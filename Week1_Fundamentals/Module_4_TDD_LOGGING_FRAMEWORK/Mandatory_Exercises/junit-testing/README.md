# JUnit and Mockito Hands-On

## Main Classes

- Calculator.java
- EvenChecker.java
- ExceptionThrower.java
- PerformanceTester.java
- ExternalApi.java
- MyService.java

## Test Classes

- CalculatorTest.java
- AssertionsTest.java
- AAAExampleTest.java
- EvenCheckerTest.java
- OrderedTests.java
- ExceptionThrowerTest.java
- PerformanceTesterTest.java
- MyServiceTest.java

## Running Tests

```bash
mvn clean test
```

Expected Result:

```
BUILD SUCCESS
```

## SLF4J Logging

### Logging Error Messages and Warning Levels

Concepts Used:

- Logger
- LoggerFactory
- logger.error()
- logger.warn()
- Logback

### Expected Output

ERROR ... This is an error message

WARN ... This is a warning message