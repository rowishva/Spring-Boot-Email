# Spring-Boot-Email

This example shows how to send email in a Spring Boot application. We use a Mailtrap service as SMTP server [We need to register an account if we do not have Mailtrap account]

###### Technology Stack
```diff
+ Java 11
+ Spring Boot 2.5.1.RELEASE
+ Feemarker
+ Spring Boot Rest API
```

###### 1. Dependency for Spring Boot Mail
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-freemarker</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
```
###### 2. Configure Mail Properties
```
spring.mail.protocol=smtp
spring.mail.host=smtp.mailtrap.io
spring.mail.port=2525
spring.mail.username=<mailtrap_username>
spring.mail.password=<mailtrap_password>
spring.mail.properties.mail.smtp.auth = true
spring.mail.properties.mail.smtp.starttls.enable = true
```

###### 3 Creating a Freemarker Email Template
Create your email.ftlh file under src/main/resources/templates as below.
```
<html>
<head></head>
<body>
    <p>Dear ${name},</p>
    <p>Sending Email using Spring 4 with <b>FreeMarker template !!!</b></p>
    <p>Thanks</p>
</body>
</html>
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.1/maven-plugin/reference/html/)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-email)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/2.5.1/reference/htmlsingle/#boot-features-spring-mvc-template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

## Author
 * [Roshitha Wishvajith](https://github.com/rowishva?tab=repositories)
