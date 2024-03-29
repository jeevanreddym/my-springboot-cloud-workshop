# Patterns in spring cloud environment

1) Load Balancing, Scaling MicroServices - Registry & Discovery server for Service Discovery,
2) Fault Tolerance & Resilience - Timeout, Circuit Breaker, Retry, Ratelimiter - resilience4j, Hystriz (deprecated Netflix dependency)
3) Configuration


# Changing port, profile using VM options:
# -Dserver.port=8084 -Dspring.profiles.active=dev

# java -jar -Dspring.profiles.active=profilename XXX.jar

# mvn spring-boot:run -Dspring-boot.run.profiles=foo,bar

![img.png](/z-readme-imgs/img.png)



# docker-compose is a CLI (command line interface) that's installed along with docker desktop

docker-compose up



# http://localhost:8082/ratings/8888
ratings-data-service
![img_2.png](/z-readme-imgs/img_2.png)
![img_11.png](/z-readme-imgs/img_11.png)
# http://localhost:8082/h2-console/
![img.png](z-readme-imgs/img_12.png)


# http://localhost:8083/movies/111
movie-info-service
![img_3.png](/z-readme-imgs/img_3.png)
![img_4.png](/z-readme-imgs/img_4.png)
![img_10.png](/z-readme-imgs/img_10.png)


# http://localhost:8081/catalog/8888
movie-catalog-service
![img_1.png](/z-readme-imgs/img_1.png)
# http://localhost:9000/MOVIE-CATALOG-SERVICE/catalog/8888
![img_6.png](/z-readme-imgs/img_6.png)


# http://localhost:8761/
Eureka Registry Discovery server
![img_5.png](/z-readme-imgs/img_5.png)


# http://localhost:8888/actuator/configprops
Config Server: actuator
![img_7.png](/z-readme-imgs/img_7.png)


# profiles from config server:
![img_8.png](/z-readme-imgs/img_8.png)
![img_9.png](/z-readme-imgs/img_9.png)






