# SA55_XieWenwen-_fibonacci
A simple DropWizard micro service which can calculate fibonacci sequence

## Dependency
This software is built on jdk17, other dependency are designated in ```pom.xml```

## Build Jar
```sh
mvn package
```
A jar named ```SA55_XIEWENWEN_fibonacci-1.0-SNAPSHOT.jar``` will be built and can be used for launching service.

## Run the service
```sh
java -jar target target\SA55_XIEWENWEN_fibonacci-1.0-SNAPSHOT.jar server FBConfig.yml
```

## How to test the service
This micro service doesn't come with any frontend/UI, if you wanna test the service locally, you need to send a ```JSON``` structure with ```POST``` method to ```localhost:8080/fibonacci```, the ```JSON``` format is like:

```json
{
  "elements": 10
}
```
```elements``` is the length of the fibonacci sequence. You can use http client like Postman to do this test.

The return value will be like this:
```json
{
  "fibonacci": [
    0,
    1,
    1,
    2,
    3,
    5,
    8,
    13,
    21,
    34
  ],
  "sorted": [
    34,
    8,
    2,
    0,
    21,
    13,
    5,
    3,
    1,
    1
  ]
}
```
Which representing the fibonacci sequence and its partially sorted result list. The sort rule is:
* Even numbers first, in descending order
* Odd numbers second, in descending order

## Run the Service With Docker

With the ```Dockfile``` in root, you can easily build the service's docker image. Use following line to build docker image:

```sh
docker build -t fibonacci ./
```

## Access the Service From Public IP:
Send json (like the example above) with post request to URL: http://18.183.79.67:80/fibonacci, you can get reply json too