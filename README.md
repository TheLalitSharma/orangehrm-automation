# OrangeHRM Automation Suite

This project is a Selenium WebDriver + TestNG automation framework designed to automate the OrangeHRM demo web application.

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven

## Project Structure
- **pages/**: Page Object Model (POM) classes
- **tests/**: TestNG test classes
- **utilities/**: BaseTest setup and Driver management

## Features Automated
- Login to OrangeHRM
- Add New Employee
- Logout from OrangeHRM

## How to Run
1. Clone the repository.
2. Open in IDE (IntelliJ, Eclipse).
3. Install Maven dependencies (`mvn clean install`).
4. Update browser driver path if required.
5. Run `testng.xml` or use `mvn clean test` command.

## Future Improvements
- Add Assertions for validations
- Add Data-driven testing with Excel/CSV
- Generate Test Reports (ExtentReports/Allure)
- Add Jenkins CI/CD Pipeline Integration

---

Happy Testing!
