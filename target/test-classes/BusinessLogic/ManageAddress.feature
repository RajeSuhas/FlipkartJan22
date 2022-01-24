Feature: Manage Addresses Functionality

Background: user is successfully logged in
Given user opens "Chrome" browser with exe
Given user enters url as
Given click on Cancel button
Given user move on Login Dropdown
Given user click on My Profile
Given user enter "9028302520" as username
Given user enter "DN7140solapur" as password
Given  user click on login button


@SmokeTest
Scenario: Manage addresses functionality with valid data
When user click on manage addresses
When user click on Add a new address
When user enter "abc" as name
When user enter "8208364702" as mobile number
When user enter "413003" as pincode
When user enter "Lashkar" as locality
When user enter "sadar bazar" as address
When user select Home as address type
When user click on save button
Then application shows new address added successfully