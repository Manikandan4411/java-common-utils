# Java Common Utils

A reusable Java utility library built with Java 21 and Maven.

This project provides lightweight utility methods for common string manipulation and validation tasks. It is designed as a learning project to demonstrate Maven project structure, utility class design, unit testing with JUnit 5, and GitHub project organization.

---

## Features

### String Utilities

- Check whether a string is null or empty
- Capitalize the first character of a string
- Remove extra spaces from text

### Validation Utilities

- Basic email validation using regular expressions

### Testing

- Comprehensive JUnit 5 unit tests
- Edge case coverage for null, empty, whitespace, and invalid inputs

---

## Project Structure

```text
java-common-utils
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── manikandan
│   │               └── commonutils
│   │                   ├── StringUtils.java
│   │                   └── ValidationUtils.java
│   │
│   └── test
│       └── java
│           └── com
│               └── manikandan
│                   └── commonutils
│                       ├── StringUtilsTest.java
│                       └── ValidationUtilsTest.java
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## Prerequisites

Before building the project, install:

- Java 21
- Maven 3.9+
- Git
- VS Code (optional)

Verify installation:

```bash
java --version
```

```bash
mvn --version
```

---

## Build and Test

### Run Unit Tests

```bash
mvn clean test
```

Expected Result:

```text
BUILD SUCCESS
```

### Create JAR File

```bash
mvn package
```

Expected Result:

```text
BUILD SUCCESS
```

Generated JAR:

```text
target/java-common-utils-1.0.0.jar
```

---

## Usage Examples

### Check Null or Empty

```java
boolean result =
        StringUtils.isNullOrEmpty("");
```

Output:

```java
true
```

---

### Capitalize

```java
String result =
        StringUtils.capitalize("java");
```

Output:

```java
Java
```

---

### Remove Extra Spaces

```java
String result =
        StringUtils.removeExtraSpaces(
                "   Hello     World   "
        );
```

Output:

```java
Hello World
```

---

### Validate Email

```java
boolean result =
        ValidationUtils.isValidEmail(
                "user@test.com"
        );
```

Output:

```java
true
```

---

## Method Behavior

### StringUtils.isNullOrEmpty()

| Input | Output |
|---------|---------|
| null | true |
| "" | true |
| " " | false |
| "Java" | false |

---

### StringUtils.capitalize()

| Input | Output |
|---------|---------|
| null | null |
| "" | "" |
| "java" | "Java" |
| "j" | "J" |

---

### StringUtils.removeExtraSpaces()

| Input | Output |
|---------|---------|
| null | null |
| "" | "" |
| "Java      Maven" | "Java Maven" |
| "  Hello   World  " | "Hello World" |

---

### ValidationUtils.isValidEmail()

| Input | Output |
|---------|---------|
| null | false |
| "" | false |
| "abc" | false |
| "abc@" | false |
| "user@test.com" | true |

---

## Using In Another Maven Project

### Install Library Locally

Navigate to the project root folder and run:

```bash
mvn install
```

This installs the JAR into your local Maven repository.

---

### Add Dependency

Add the dependency to another Maven project's pom.xml:

```xml
<dependency>
    <groupId>com.manikandan</groupId>
    <artifactId>java-common-utils</artifactId>
    <version>1.0.0</version>
</dependency>
```

---

## Running Tests

Execute:

```bash
mvn test
```

JUnit 5 will run all tests under:

```text
src/test/java
```

---

## Known Limitations

- Email validation is basic.
- International email formats are not fully supported.
- Utility methods are intentionally minimal.

---

## Future Improvements

Possible enhancements for future versions:

- Phone number validation
- Password strength validation
- String truncation utilities
- Date utilities
- Collection utilities

---

## Author

Manikandan

GitHub Repository:

```text
https://github.com/<your-github-username>/java-common-utils
```

Replace `<your-github-username>` with your actual GitHub username.

---

## License

This project is provided for learning and educational purposes.