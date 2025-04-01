# TestNG Learning & Automation Project

This project demonstrates various TestNG features and automation testing concepts, including assertions, data providers, parallel execution, groups, and more.

## 🚀 Tech Stack

- Java
- TestNG Framework
- Maven
- Allure Reports
- Excel Data Provider (Apache POI)

## 📋 Features Covered

### 1. Basic TestNG Annotations
- `@BeforeSuite`, `@AfterSuite`
- `@BeforeTest`, `@AfterTest`
- `@BeforeClass`, `@AfterClass`
- `@BeforeMethod`, `@AfterMethod`
- `@Test` annotations and their attributes

### 2. Data Providers
- CSV Data Provider implementation
- Excel Data Provider using Apache POI
- Simple Data Provider examples
- Login Data parameterization

### 3. Parallel Execution
- Method level parallel execution
- Class level parallel execution
- Test level parallel execution
- Instance level parallel execution

### 4. TestNG Groups & Priority
- Group level execution
- Priority based test execution
- Groups with Regular Expressions
- Sanity test groups
- Group level listeners

### 5. Listeners & Custom Implementations
- Custom Listeners
- Custom List implementations
- Factory Pattern implementation
- Parameter handling demos

## 🛠️ Project Structure

```
LearnTestNG/
├── src/
│   ├── main/java/
│   └── test/java/
│       ├── com.ajaytest.testng.assertion/
│       ├── com.ajaytest.testng.BasicAnnotations/
│       ├── com.ajaytest.testng.dataprovider/
│       ├── com.ajaytest.testng.differnet/
│       ├── com.ajaytest.testng.instance/
│       ├── com.ajaytest.testng.Listener/
│       ├── com.ajaytest.testng.param/
│       ├── com.ajaytest.testng.parallel/
│       ├── com.ajaytest.testng.priority/
│       └── com.ajaytest.testng.TestNGGroups/
├── resources/
├── test-output/
└── pom.xml
```

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher
- Maven installed
- IDE (Eclipse/IntelliJ) with TestNG plugin

### Running Tests

1. Clone the repository:
```bash
git clone <repository-url>
cd LearnTestNG
```

2. Install dependencies:
```bash
mvn clean install
```

3. Run specific test groups:
```bash
mvn test -Dgroups="sanity"
```

4. Run specific test classes:
```bash
mvn test -Dtest=MainClass
```

5. Run with specific XML file:
```bash
mvn test -DsuiteXmlFile=testing.xml
```

### Running Different Test Suites

- Sanity Tests: `testing-groups-sanity.xml`
- Parallel Tests: `testing-parrellel.xml`
- Group Tests: `testing-groups-reg.xml`
- Parameter Tests: `testing-param.xml`

## 📊 Test Reports

- TestNG HTML reports are generated in `test-output` directory
- Allure reports can be found in `allure-results` directory

To generate and open Allure reports:
```bash
mvn allure:serve
```

## 🙏 Acknowledgments

- TestNG Documentation
- Maven Documentation
- Allure Reports Documentation
