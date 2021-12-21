# Spring-Boot-Email

This example shows how to send email in a Spring Boot application. We use a Mailtrap service as SMTP server [We need to register an account if we do not have Mailtrap account]

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
