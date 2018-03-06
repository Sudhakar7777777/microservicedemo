#Stop and remove the current container
docker stop mission
docker rm mission

#Reimage the container based on the newer code changes
gradle build
docker build -t microservicedemo/mission .

#Restart the container with the latest image
docker run -P -d --name mission --link mongodb microservicedemo/mission