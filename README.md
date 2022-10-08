#  TRIANGLE SERVICE :office:

### Purpose
The purpose of this project is to return the type of triangle given length of all 3 sides.

## Requirements for running :runner:
- Java 17
- Gradle

## Requirements for development :construction_worker:
- Java 17
- Gradle

## Running the projects :beers:
Run the project from any given IDE or build the project and run the jar file.

### Hitting the endpoints :facepunch:

See swagger `http://localhost:8080` or hit the endpoint with curl:
```
curl -X 'POST' \
  'http://localhost:8080/v1/get-triangle-type' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "hypotenuseLength": 14,
  "oppositeLength": 12,
  "adjacentLength": 13
}'
```