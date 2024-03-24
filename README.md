# Automation Framework Setup Documentation:

## 1. Project Structure:
- The project follows a package structure where classes are organized under packages like `com.pom` and `com.test`.
- WebDriver setup and initialization are managed in the `driverutils` class under `com.utils` package.

## 2. Dependencies:
- The project utilizes Selenium WebDriver for browser automation.
- TestNG is used as the testing framework for organizing and running tests.

## 3. Execution Instructions:
- Before running tests, ensure that the Chrome WebDriver executable is located at `C:\Users\user\eclipse-workspace\swaglabs\src\test\resources\chromedriver.exe`.
- Run the test classes (`logintest`, `hometest`, `carttest`) using TestNG.

# Page Object Model Design Documentation:

## 1. Basepage Class (`com.pom.Basepage`):
- This class initializes WebDriver using the `driverutils` class and Page Factory for initializing elements.
- It serves as the parent class for all Page Objects.

## 2. Loginpage Class (`com.pom.loginpage`):
- Represents the login page of the Swag Labs website.
- Contains methods for entering username, password, and clicking the login button.
- Includes a `driverclose()` method to close the WebDriver instance after the test.

## 3. Homepage Class (`com.pom.homepage`):
- Represents the home page of the Swag Labs website.
- Contains methods for filtering products, scrolling, and adding products to the cart.

## 4. Cartpage Class (`com.pom.cartpage`):
- Represents the cart page of the Swag Labs website.
- Contains methods for navigating to the cart, checkout process, and entering user details.

# Test Scripts Documentation:

## 1. logintest Class (`com.test.logintest`):
- Contains a TestNG test method for testing the login functionality.
- Utilizes a data provider (`loginData`) to provide multiple sets of login credentials.
- Instantiates the `loginpage` class and performs login operations using the provided credentials.
- Includes assertions to verify login success or failure.

## 2. hometest Class (`com.test.hometest`):
- Contains TestNG test methods for testing the home page functionality.
- Instantiates the `homepage` class and performs filtering, scrolling, and adding products to the cart.

## 3. carttest Class (`com.test.carttest`):
- Contains TestNG test methods for testing the cart functionality.
- Instantiates the `cartpage` and `homepage` classes and performs cart operations, checkout process, and entering user details.
---  
# Reflection:

## Challenges Encountered:
- Handling dynamic elements and waits.
- Ensuring proper synchronization between test steps.

## Solutions Implemented:
- Implemented explicit waits and JavaScriptExecutor for handling dynamic elements.
- Utilized Thread.sleep for adding temporary delays.

## Lessons Learned:
- Importance of proper synchronization for reliable test automation.
- Understanding the significance of Page Object Model for maintaining code readability and reusability.


