# "MYSQL-JAVA API"

## Purpose
This project was meant to be a big one for me, using my newly aquired knowledge of Java-MySql integration. My main idea was preparing something to facilitate creating other aplications of mine, so I firstly decided to try and develop an API myself, which later downgraded into a simple Java template.  
I've already done something similar for a university assignment, but I wanted to do something more general and widely aplicable, that's where the API idea came in. After actually learning what an API is, I made it a simple template kept in the **MyLib** folder.
My first tries were very complex and demanded some good amount of lines. Sadly, I stopped believing it was worth anything since it felt a little too much for such "simple" task, meaning I deleted most of it without maitaining any record.

## Structure
#### Initial Design
Firstly I built what I already knew, a class for connecting with the MySQL database, which is still in the project as DB_Connection.
Secondly, I created a class to mimic a table using a nested Map (Java Collection) component to represent the two-dimensional behavior. It used the row id as the first key and the column name as the second, identifying uniquely every cell.
Its usage flow would be like this: pull data from MySQL, save it in a Java "table" class" and then accessing it through an infinity of methods.
Though it was a nice learning project, I don't know why I though it was a good idea. I scrapped it after some knowledgeable advice.

#### Current Design
There're are 4 classes pre-built in the **MyLib** folder which is then extracted into the projects java package.

> **DB_CONNECTION.java**
> A collection of methods to set a connection with a running MySQL server, they are nested in a way that simplyfies the code, returning a boolean if connected or not (true or false, repectivelly).

> **CONSOLE_UI.java**
> A collection of methods (or just an initial template) to iteract with the system through the terminal. Built mainly from *Scanners* and *prints*.

> **UTILS.java**
> A collection of general methods I felt were needed, made mostly to help development, such as a simpler *print* method and a JavaScript-like *push*.

> **MYSQL_UTILS.java**
> A collection of methods to manipulate SQL inside Java, basically what was left from my previous attempt. It implements a SQL command executer and a SQL query returner (A Map with the row id as key and an object array as the row itself, inherited idea from before).