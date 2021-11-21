Feature: Contact

Scenario: BigSmall contact page Validation


Given User lands on Home Page
When click contact us tab in footer
And Enter the name "YASH" email "yash2@gmail.com" and message "Checking the contact page" and click on send
Then Thankyou message displayed 
