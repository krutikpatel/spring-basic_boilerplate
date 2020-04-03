# spring-basic_boilerplate
Basic Springboot boilerplate, minimal. Contains: cmd line run, no web, JPA example, H2 DB

Spring 2.2.6

## Any useful note shall be put in comments, beginning with keyword : "knote", so that its easy to search later

## H2 Console
specify in application.properties

  -spring.h2.console.enabled=true
  -spring.h2.console.path=/h2-console
  
db url once connected/open the console : (can be found in logs)
  jdbc:h2:mem:testdb
