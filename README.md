# SmallJavaProjects

Bank Application
Scenario: you are a beacon developer and need to create an application to handle new customer bake account request
Your application should do the following:
 Read a .csv file of names, Social Security numbers, account types, and initial deposit
 Use a proper data structure to hold these accounts
 Both savings and checking accounts share the following properties:
deposit()
withdraw()
transfer()
showInfo()

11 – digit account number (generated with the following process: 1 or 2 depending on Savings or Checking,
 last two digits of SSN, and random 3-digit number)
 
 Savings account holders are given a safety deposit box, identified by a 3 digit number and access by a 4 digit code
 Checking account holders are assigned a Debit card with a 3-digit number and 4-digit pin
 Both accounts will be use an interface that determines the base interest rate.
Saving accounts will use .25 points less then the base rate
Checking accounts will use 15% of the base rate
 The showInfo method should reveal relevant account information as well as information 
specific to the checking account or savings account.
__________________________________________________________________________________________________________________________

Email Application
Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.
Your application should do the following:
 Generate an email with the following syntax: firstname.lastname@department.company.com
 Determine the department (sales, development, accounting), if none leave blank
 Generate a random String for a password
 Have set methods to change the password, set the mailbox capacity, and define an alternate
email address
 Have get methods to display the name, email, and mailbox capacity
__________________________________________________________________________________________________________________________

Student Database Application
Scenario: You are a Database Administrator for a university and need to create an application to manage student enrollments and balance.
Your application should do the following:
 Ask the user how many new students will be added to the database
 The user should be prompted to enter the name and year for each student
 The student should have a 5-digit unique ID, with the first number being their grade level
 A student can enroll in the following courses:
History 101 Mathematics 101 English 101
Chemistry 101 Computer Science 101
 Each course costs $600 to enroll
 The student should be able to view their balance and pay the tuition
 To see the status of the student, we should see their name, ID, courses enrolled, and balance
