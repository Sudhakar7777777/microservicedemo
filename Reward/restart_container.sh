#Stop and remove the current container
docker stop reward
docker rm reward

#Reimage the container based on the newer code changes
gradle build
docker build -t microservicedemo/reward .

#Restart the container with the latest image
docker run -P -d --name reward --link mongodb microservicedemo/reward