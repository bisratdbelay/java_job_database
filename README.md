# java_job_database
a java job application database using JDBC and MySQL database

a java job application database using JDBC and MySQL database

package java_job_database

instructions

requires MySQL server running on localhost
requires MySQL-Connector download here: https://dev.mysql.com/downloads/connector/j/

build databse using files in /database folder and the "source" command starting with "create_database.sql"

place mysql-connector jar file in folder java_job_database

to commpile execute:

javac *.java

to run program execute:

java -cp java_job_database/mysql-connector-j-9.4.0.jar:. java_job_database/Main
