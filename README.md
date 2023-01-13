# 2nd written exam in computer science (exam assignment)

# C24 Bank Coding Challenge

From a management perspective, an "internal" application is to be implemented to provide an overview of current customers including their account model.

## Requirements for the application

1) A listing of all customers including sorting options by last name, account type, account balance and age.
2) An ability to view customers per account model.
3) A way to search for customers by IBAN or last name
4) A way to quickly see what percentage of customers use a "Plus" or "Max" account and what monthly revenue is generated from them

## Practical tasks

5) The customers are automatically read in from the CSV file when the program is started.
6) The organization is represented in a UML class diagram
7) The data structure "linked list" is used
8) The code is well structured, programmed object-oriented, sufficiently commented and the variables have meaningful, English names

## Bonus task

9) There is a unit test

Translated with www.DeepL.com/Translator (free version)

# Documentation

Welcome to our Project. Here is a Quick walkthrough.  
Open the Pictures, which are found in src/readme.  
### 1) Login.java (Image 1)  
You can type in the username (**admin**) and password (**admin**). The Class Login.java calls the Method compareUserPass in the Class User. If the Password is wrong the user will get a notification, that the username or password is wrong. For security reasons the user will not be told which of the two is wrong (Image 2).
### 2) Dashboard.java (Image 3)
If the correct Login credentials are given, the Login Window will be disposed (The Task will be Closed completely and reopened if needed in a completely new instance) and the Dashboard.java main Class will be launched.   
If the List is somehow corrupted you can relaunch the Dashboard with "<" key.