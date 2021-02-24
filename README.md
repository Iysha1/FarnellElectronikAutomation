# FarnellElectronikAutomation
README.md 

UI Automation Skeleton Assessment Codes and Test was prepared by:
*Ayse Saribasak Software QA Engineer 
email: ishasaribasak@gmail.com

Build Tool: Maven
Test Framework: Cucumber BBD (with JUnit Assertions)
Environment: http://uk.farnell.com

System Requirements: • Java 8 + JDK

Test RUN Note: To run the scenario, use @register tag for testing Registration.

Way: 
• Clone the projects 
• Import maven dependencies from POM 
• Go src -> test > java > Runners > CukesRunner and Run 
• To generate "HTML Maven Cucumber Report" ; Open Maven right side panel Double Click Project's Lifecycle Click "verify"

Way: 
• Run from command line invoke mvn clean verify
Test Reports Locations 1- Cucumber HTML Plugin Reports target 
-> cucumber-html-reports
> overview-steps.html (Right Click and Open in any Browser )

2- When you run my project, Cucumber will create automatically online report link. 
You can click the link with in the 24 hours and check the all test steps and status.

Cucumber Test Feature Scenario: <<<<<<< Make a registration ####) Validate the dropdown options in the main page for currency graph
. a- In this Scenario, it verifies the registration.
b- To run this scenario, use the @register tag in the CukesRunner class/Cucumber Options

End
