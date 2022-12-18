FROM openjdk:17
ADD ./SA55_XIEWENWEN_fibonacci/target/SA55_XIEWENWEN_fibonacci-1.0-SNAPSHOT.jar /usr/fibonacciApp/SA55_XIEWENWEN_fibonacci-1.0-SNAPSHOT.jar
ADD ./SA55_XIEWENWEN_fibonacci/FBConfig.yml /usr/fibonacciApp/FBConfig.yml
WORKDIR /usr/fibonacciApp
CMD java -jar SA55_XIEWENWEN_fibonacci-1.0-SNAPSHOT.jar server 
EXPOSE 8080
EXPOSE 8443
