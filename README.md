# 2nd written exam in computer science (exam assignment)

# C24 Bank Coding Challenge

From a management perspective, an "internal" application is to be implemented to provide an overview of current customers including their account model.

## Requirements for the application

1) A listing of all customers including sorting options by last name, account type, account balance and age.
2) An ability to view customers per-account model.
3) A way to search for customers by IBAN or last name
4) A way to quickly see what percentage of customers use a "Plus" or "Max" account and what monthly revenue is generated from them

## Practical tasks

5) The customers are automatically read in from the CSV file when the program is started.
6) The organization is represented in a UML class diagram
7) The data structure "linked list" is used
8) The code is well-structured, programmed object-oriented, sufficiently commented and the variables have meaningful and English names

## Bonus task

9) There is a unit test


# Documentation

Welcome to our Project. Here is a Quick walkthrough.  
Open the Pictures, which are found in src/readme.  
### 1) Login.java (Image 1)  
You can type in the username (**admin**) and password (**admin**). The Class Login.java calls the Method compareUserPass in the Class User. If the Password is wrong the user will get a notification, that the username or password is wrong. For security reasons the user will not be told which of the two is wrong (Image 2). There are two ways to log in. First of all you can press the login button, which triggers a Mouseevent, which triggers login1. Secondly you can press *Enter*, and it will trigger login2. We had to split the events, because the event property of the Key listener is different to the one of the Button.
### 2) Dashboard.java (Image 3)
If the correct Login credentials are given, the Login Window will be disposed (The Window will be Closed completely) and the Dashboard.java main Class will be launched.   
When launching the Dashboard class runs the following methods, which create the gui (initcomponents), read the CSV with a bufferedreader (readUsers) and get the Stats. Those are populated in the specific places, where the need to be put.   
When the List is somehow getting corrupted you can relaunch the Dashboard with "**<**" key.  
The CSV is read in by, buffering through the list and reading the data into a linked-list, of the type Customer.  
The user has the option to logout (2), which disposes the instance of Dashboard and relaunches the Login window.  
Further on he can sort the list. You can change the Combobox and click sort. The second combobox is only activated, when chosing "Specific Account Type" for sorting.  
Additionally you can Search a User by his or her IBAN or last name. Be aware that this is case and space sensitive. The search Button launches a new Instance of CustomerInfo.
### 3) CustomerInfo.java (Image 4)
CustomerInfo gets all credentials handed over with an Array of the Type String. We used Textfields, which are not editable for the Output of the Userdata. This is for usability reasons, that e.g. the E-Mail can be copied right out of the Customer Info. The Close Button Disposes the instance of the Customer Info.
### 4) Customer.java 
The class Customer.java has the Data stored in Strings and a  getter, which returns the age of a Customer for the Age Sorting method to work. Additionally, we changed the dates in the csv to dd.mm.yyyy, for the getAge Method to work.  