# datatable-assignment
I have used SpringBoot, Hibernate ORM for backend.
Database: MySQl
Frontend:Simple HTML, Bootstrap, datatable library from Javascript

I have embedded generic data in .sql file dump. You can use it by exporting to your DB server. It contains 500 entries.

For backend, port number is 9091(hardcoded). If this port is not available for you , change it in application.properties, (server.port=<give your desired port>)

If you want to deploy the jar , deploy the backend code over a server then build jar using maven build 

Simplest way to do it , open it using Eclipse IDE , maven build clean-package
Another way to run the backend code is simply, run as a java application from the IDE in th local as spring-boot comes with a in-built application server

In case if you change the port number, please also change this in the index.js file with the same port number 

As frontend is simply with HTML so by clicking on that file you can get the page up andsee the desired result.

