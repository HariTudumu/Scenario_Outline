Feature: I am automating Orange Hrm Application

Background: common re-usable steps

Given user launch the browser
Then user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario Outline: TC002_add Job Record_creating Job Record

Then user enters username as "Admin" and password as "admin123" and clicks login btn
Then user go to Job Page
And user enter the job title as <JOBTITLE> and job description as <JOBDESCRIPTION> and note as <NOTE>
And user save the Job Record
Then user logout from the application
And user close the browser
 
Examples:

|JOBTITLE|JOBDESCRIPTION  |NOTE|
|"Testing"|"Testing Description"|"sprint will starts from july 10"|
|"manual testing1"|"manual testing description1"|"sprint will starts from july 201"|
|"Automation1"|"Automation Testing Description1"|"sprint will starts from Aug 101"|
|"Team Lead1"|"Team Lead Description1"|"sprint will starts from Aug 201"|
|"Manager1"|"Manager Description1"|"sprint will starts from july 301"|



