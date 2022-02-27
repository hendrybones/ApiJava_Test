# ApiJava_Test

# Pulling data from external api and store in MysQl database using spring boot

# Tools
1. intelij idea
2. sring boot
3. maven
4. mysql database

# dependencies
1. spring-web  for web services
2. Mysqa jdbc driver to enable connection to the database
3. Jpa enables as to manipulte data to the data base store,update,retrieve and delete
4. Jackson-dataBind dependencies which enable us to read xml data to Json
5. jackson-dataFormat-xml 

# how to build and run the project
1. create a maven project from spring Initilizr.io 
2. add all the spring boot dependencies
3. download the zip file and extract to open using intelij idea
4. 
# How to pull data from external api
1. create and account to obtain api key http://www.opensecrets.org/api/?method=getLegislators&id=NJ&apikey=__apikey__
2. create a model class which take given fields from api: firstlast,lastname;party,office;gender, first_elected,phonevotesmart_id, feccandid;birthdate
3. create  service which implement the logic on how to get data from external api and store it to the database
4. create  controller which maps the http request from the service 
5. To applicatio springboot main class create a @bean Using CommanLine Runner the use Object mapper and model class to add data to the database
6.
# Screenshot for data the data in the database![data](https://user-images.githubusercontent.com/44755841/155873278-4e0f4fd5-a710-430e-a5ee-8a8bc7091cd6.png)

