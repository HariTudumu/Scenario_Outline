Feature: I am automating orange HRM application

Background: Common re-usable steps

Given user launch browser
Then User enters URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario Outline:
: TC01_AddSkills Record- creating skills record

And user enters username as "Admin" and password as "admin123" and clicks login btn

When go to skills page
Then enters skillname as <SKILLNAME>  and skill description as <SKILLDESC> and click save btn
Then logout
Then close the browser

Examples:
:
|SKILLNAME|SKILLDESC   |
|"Java23"|"Java23 desc"|
|"Java24"|"Java24 desc"|
|"Java25"|"Java25 desc"|