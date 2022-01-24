Feature: Login Functionality

Background: user is successfully logged in
Given user opens "Chrome" browser with exe "D:\\Automation soft support\\chromedriver.exe"
Given user enters url as "https://www.flipkart.com/"

@SmokeTest
Scenario: Login Funtionality with valid credentials
When click on Cancel button
When user move on Login Dropdown
When user click on My Profile
When user enter "9028302520"  as username
When user enter "DN7140solapur" as password
When  user click on login button
Then Application shows user profile to user