Feature: I am automating the Orange HRM Application

Background: Common Re-usable steps

Given user launch the browser
Then user enter the URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: TC003_adding Nationality
And user enter the username as "Admin" and password as "admin123" and click on login button
Then user go to Nationalities page
And user add Nationalities as <NATIONALITY> and click on save button
Then user logout from the application
Then user close the browser

Examples:
|NATIONALITY|
|"America"|
|"Africa"|
|"England"|

