-----------------------*********************LATTICE INNOVATIONS TASK FOR SPRING BOOT BACKEND :***************************----------------------------------------

##################################################################################################################################################################



----------------------------******************************-------------APIs-------------------***********************---------------------------------------------

/login  -  It is used for Sig-in option , if a user already present and wants to know other details then , sign-in is mandatory .

/patients - This API gives the list of all the patients present in the Database(MySQL in this project)

/newPatient - to add new patient into the database.

/updateDetailsPatient/{id} - update the details of patient like phone no., email , address etc.

/deletePatients/{id} - to remove out the particular patient from the database.

/appointments - provide all the details of the patient with the "ascending order of time" .

/bookAppointment/{id} - here id is the patients id which is unique , when any patient wants to book his/her appointment then we use this 				api .

#################################################################################################################################################################


##############################*****************************SPRING BOOT :*******************************##########################################################

Spring Boot is a Framework from “The Spring Team” to ease thedevelopment of new Spring Applications and provides the RAD(Rapid Application Development)

=====>> Why Spring Boot?

It is very easy to develop Spring Based applications .

It reduces lots of development time and increases productivity.

In Spring , XML and manual configuration s present , so, to avoid them we use Spring boot .

It is not any different framework , it is only an advanced form of "Spring"

====>> MAIN REASONS:

Avoid XML Configuration completely.

Embedded Server - Tomcat is also inbuilt.

#################################################################################################################################################################

-------------------------------------------*************************PLUS POINTS (OPTIONALS):**************************-------------------------------------------

ACCORDING TO TASK :

1. AUTHENTICATION

2. API DOCUMENTATION
 
3. UNIT TESTING
 
4. LOGGING


I have implemented Authentication and API Documentation .

#################################################################################################################################################################


--------------------------------*****************************1. AUTHENTICATION :*********************----------------------------------------------------------

In this project ,Authentication is done by Spring Security with JPA Authentication and Database(MySQL in this case).

				SPRING SECURITY ---> JPA ------>DATABASE(MYSQL)
				
====>>>  HOW REQUESTS FLOW IN SPRING SECURITY 
				
Filters get the reuests which are coming then pass it to the Authentication MAnager (interface and having no implementation of Authentication) only authenticate() 
is present , 

after this , request goes to the Provider manager ,which matches the reqquest along with the Authenticaion Provider/which is compatible.

Authentication Provider runs authenticate() and in UserDetails(example) there is a method loadUserByUserName() after authenticate ,

Valid Authentication Object is returened by Authentication provider after successful authenticaion .

Provider manager sends the VAlid Authentication Object to the filter and sets the Authentication .


In this project ,  /login  and /newPatient API is available only for any user apart from that other APIs are secured ,

Without login , no one can access those APIs.


In Login , I have used templates for displaying username and password column so user/patient can put his credentials for further process.


spring-boot-starter-security is the dependency which helps us to achieving the Security.

#################################################################################################################################################################


---------------------------------------*******************************2. API DOCUMENTATION SWAGGER :************************-------------------------------------

Swagger is used together with a set of open-source software tools to design, build, document, and use RESTful web services.
 Swagger includes -
 automated documentation with sync ( if any api changed then it automatically reflect in this documentation)
 
These two dependency helps us to achieve the Documentation:

 springfox-swagger2

 springfox-swagger-ui


Second Dependency ,Displays all the API in html page .


Swagger provides two endpoints by hiting the API you can get relevant results .

v2/api-docs

swagger-ui.html

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
#################################################################################################################################################################

--------------------------------------------***********************3. UNITTESTING -JUNIT -MOCKITO:*****************----------------------------------------------


JUnit is a unit testing framework for Java programming language. JUnit has been important in the development of test-driven development.


Controller -------->Service ---------------------> either Repository or Mockito

Repository , is when , the application is running in Real-world environment or in Production .

When any tester wants to run for testing, is it working or not , then we use Mockito so that we can reduce the load on Database without being affect the original data .

So, it helps us to achieve better testing .

( Mockito is a mocking framework. It is a Java-based library used to create simple and basic test APIs for performing unit testing of Java applications. It can 
also be used with other frameworks such as JUnit )


----------------------------------------************************************4. LOGGING -  Log4j**************************-----------------------------------------

Log4j is used by developers to keep track of what happens in their software applications or online services. It's basically a huge journal of the activity of 
a system or application. This activity is called 'logging' and it's used by developers to check out for problems for users.

Advantages :

 Good logging infrastructure without putting in any efforts. Ability to categorize logs at different levels (Trace, Debug, Info, Warn, Error and Fatal).
 Direct logs to different outputs.
 
 ###############################################################################################################################################################
 
CODE PUSH ON GITHUB :

Create a Repository on Github .

git status (to check untracked files locally)

git add . (add all the files you want to deploy on github otherwise run "git checkout filename")

git commit -m "message" ( Commit all the files)

git push origin master ( Push on the github)

#################################################################################################################################################################


 



