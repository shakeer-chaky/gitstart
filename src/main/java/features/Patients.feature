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
      Then the user fill in patient information in patient details page and click submit
      Then the user verify that patient create success message displayed as Patient has been created successfully
      #Then Search the Patient <Search name> in searchBox


      Examples:
        | email                  | password  | Patientname    | Search name    |
        | rasheed@riamsdental.com| Riams@1988| mahammad       |SHAKEER         |