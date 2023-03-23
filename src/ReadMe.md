## Framework of SpringBoot
1. The top-most layer is API layer managed by controller class which deals with mapping request to their specific url.
It is the layer which user directly interacts with client. 
2. The middle layer is the service layer which contains business logic or logic of fuctions of crud operations.It is implemented by service class.
3. The last layer and most nearmost to the database is the repository level.This level is implemented by an interface which implememnts JpaRepository which has so many ready-to-use functions for working on databases.If we define our own function in database then we annotate that function with @Query("SELECT p FROM Person p WHERE p.id>:id")
4. The last one is database where we using DBMS systems like MySQL and PostgreSQL.
5. When requesting is done by a client, there are basically 3 parts of the request made
    - Request Path: It is the one which is like URL. To extract variables out of this path, we use @Pathvariable("Variable_name"). There are also params in the path which are handy when you want to update only one or two attributes of a tuple.They are extracted by @RequestParam and on path the are shown as "...path?name=Dev" , where name is the param
    - Request Header: They are meta-data to a request which specify request body language, user-agent browser and many more data.They don't need to be extracted specifically
    - Request Body: They are body in many formats(Ex:JSON) which are generally used for POST request.They normally contain object value to be added.They can be extracted by @RequestBody

> ### Important points to check-off while creating CRUD backend using SpringBoot
>- Make a model class which works as schema for table in a database
>- 


- In repository we implement JpaRepository with table model and primary key.
- We use @Autowired for Dependency Injection
- We use @Service for specifying a service class
- We use JPA dependency to map classes to database tables
- We use UUID class to generate random numbers    
- We use Optional when we not sure wether it will return a non-null value or not 
- We use @RestController annonation in Controller class of API layer
- ResponseEntity is a handy class for return type of HttpRequests functions
- We use " {} " within URL path for specfying values which are variable.
- We use @Pathvariable("id") annotation to extract the variable value in URL path
- We use @RequestBody to extract body of request and @RequestParam to extract parameters from request