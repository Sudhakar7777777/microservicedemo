#Stop and remove the current container
docker stop employee
docker rm employee

#Reimage the container based on the newer code changes
gradle build
docker build -t microservicedemo/employee .

#Restart the container with the latest image
docker run -P -d --name employee --link mongodb microservicedemo/employee