# Online Market

## Context
Online Market is a remote API that manages a real database that contains products offered by a Supermarket. 

<br>This API provides several features and the main ones are based on Adding products to the stock and buying products. 

<br>A standard consumer for this API should only be able to buy products if they are available. 

<br>On the other hand, an admin consumer should have the power to setup products on your API and establish their details, as well as delete products from the stock. 


## Technical Requirements for the API

### Technical Stack
* Java 8
* [Spring Boot](https://spring.io/guides): Many guides on building restful services are provided there 
* [Spring Start](https://start.spring.io/): Spring Initializer tool
* RESTful communication with JSON resources
* Database: Local database. You can choose any type for data storage (arrays, lists, files, etc) - for now :)

### Testing Stack
* JUnit, Mockito, RestAssured for testing
* ArchUnit to test your code design
* Gradle to manage your dependencies

There is not a requirement for persisting data after the application is OFF.

## Features
* [Set 1: Create and Retrieve Products](features-set1.md)
