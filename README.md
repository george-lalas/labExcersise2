# Spring Lab Exercise2
Spring Boot SQL Server example

## Installation Steps:

### 1.MS-SQL server developer edition is installed.
### 2.Open application properties:
````
server.port=9085 #change this to your desired port

spring.datasource.url=jdbc:sqlserver://localhost;databaseName=springbootdb
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.show-sql=true
spring.jpa.hibernate.dialect=org.hibernate.dialect.SQLServer2012Dialect
spring.jpa.hibernate.ddl-auto = create

Replace url (database name), username and password with the relevant information from your SQL Server installation.
````
## Swagger-ui:
Swagger-ui available at : http://localhost:9085/swagger-ui.html

##Front-End: 
Basic Html & JavaScript, JQUERY Ajax example, Datasets example, Chart.js example

