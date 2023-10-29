@tag
  Feature: Check patient DCMS website
    I want to use this template for my feature file

    Background:
      Given the user landed on login page


    @tag2
    Scenario Outline: Verify the user able to create a patient
      Given Logged in  with username <email> and password <password>
      Then the user click on home button on the landing screen
      Then the user navigates to create page by selecting the left navigation menu
      Then the user click to patients button on navigation screen
      Then the use click to plus button for add the details of patient
      Then the user set ID Number of patient
      Then the user select Font size
      Then the user click for heading
      Then the user set address of patient
      Then the user click for country
      Then the user select the country
      Then the user set the avatar of patient
      Then the user fill patient salutation
      Then the user select the salutation of patient
      Then the user set firstname of patient
      Then the user set middlename of patient
      Then the user set lastname of patient
      Then the user select gender of patient
      Then the user set the DOB of patient
      Then the user set phone number of patient
      Then the user set the email of patient
      Then the user click for hospitalisedQuery
      Then the user write answer for hospitalised question
      Then the user click for medication Query
      Then the user write answer for medication question
      Then the user click for allergy query
      Then the user click for allergy food
      Then the user click for diabetic query
      Then the user click for hypertension query
      Then the user click for bleeding query
      Then the user click to submit button
      Then the user search Patient<name> details in searchBox




      Examples:
        | email                  | password  |name   |
        | rasheed@riamsdental.com| Riams@1988|shakeer|