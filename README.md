# job4j_chat
[![Build Status](https://travis-ci.com/dmitriyermoshin19/job4j_chat.svg?branch=main)](https://travis-ci.com/dmitriyermoshin19/job4j_chat)
[![codecov](https://codecov.io/gh/dmitriyermoshin19/job4j_chat/branch/main/graph/badge.svg)](https://codecov.io/gh/dmitriyermoshin19/job4j_chat)

### Description of the project.
This project represents the Spring Boot REST full API with the use ***Spring Security & JWT*** for authentication and authorization.
This is a simple restAPI service which implementation of server side for online chat. It is assumed use simple CRUD operations by rooms,messages,persons.

### Used technologies
- Spring Boot 2 as a web framework
- Spring Security & JWT for authentication and authorization
- Spring Data as framework for data base
- Maven as a build system
- PostgresSQL
- liquibase

### Some functionality:
1. Person Registration
   
   ![GitHub Logo](images/reg.png)


2. Let's check that the security is working. Let's try to get users without authorization
   
   ![GitHub Logo](images/without.png)


3. Get a jwt token from this user
   
   ![GitHub Logo](images/tok.png)


4. Getting all users with a username and password
   
   ![GitHub Logo](images/all.png)