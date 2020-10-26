# igreendata-test
IGreenData Test

## Getting started
### 1. Ensure Docker is installed
```
Reference to install docker: https://docs.docker.com/get-docker/
```
### 2. Pull postgresql docker images
```
docker run --name postgres -e POSTGRES_PASSWORD=P0stgr3s -d postgres
```
### 3. Create a database 'igreendata'
```
docker ps -a

docker exec -it <CONTAINER_ID> sh

psql -U postgres

create database igreendata;

quit

exit
```
### 4. Clone the application
```
git clone git@github.com:ivan-lunardi/igreendata-test.git
```
### 5. Run the application
```
gradle bootRun
```
### 6. Access Swagger
```
http://localhost:9093
```
### 7. Invoke the Rest API
- Account List API
```
curl -X GET "http://localhost:9092/rest/v1/account/list?pageNo=1&rowCount=10" -H "accept: application/json"
```
- Account Transaction List API
```
curl -X GET "http://localhost:9092/rest/v1/transaction/585309209?pageNo=1&rowCount=10" -H "accept: application/json"
```
