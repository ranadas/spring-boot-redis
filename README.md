### A concept for legacy relational database and redis cache. Three modules 
* redis-rdb (A) - using redis as a datastore. Stores Employees using Redistemplate and hashOperations. 
* legacy-db (B) - Using JPA to store in a relational DB.  
* redis-cache - This is where caching is used to cache data from either (A) or (B) and use in controllers.  




#### Some useful links
* [How to plement Redis with Spring boot](https://javatechonline.com/how-to-implement-redis-cache-in-spring-boot-application/)
* [Jedis for SpringBoot application](https://medium.com/aeturnuminc/redis-cache-implementation-for-springboot-application-bda6e8e33b2d)
* [Distributed Caching with redis](https://b-nova.com/en/home/content/distributed-caching-with-redis-and-spring-boot)
* [Spring Boot Redis](https://programmerfriend.com/ultimate-guide-to-redis-cache-with-spring-boot-2-and-spring-data-redis/)
* [Code from Github](https://github.com/eiselems/ultimate-redis-boot/tree/dependabot/maven/org.springframework.boot-spring-boot-starter-parent-3.0.4)
* [Spring boot caching with Redis](https://blog.tericcabrel.com/data-caching-spring-boot-redis/)
* [Redis cache](https://www.bezkoder.com/spring-boot-redis-cache-example/)
* [Code from Github](https://github.com/tericcabrel/blog-tutorials/tree/main/springboot-caching)
* [Code from bitbucket](https://bitbucket.org/redis-cache-app-blog/redis-jedis-app-blog/src/master/)