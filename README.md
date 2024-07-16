# CS401 Summer 2024 Assignment 3

## Project Name
CS401_Summer2024_<Firstname>_<Lastname>_assignment_3

## Description
This project implements JUnit parameterized tests to validate various string operations. The objective is to familiarize with the usage of JUnit's `@Parameters` annotation to execute parameterized tests with non-numerical types, specifically focusing on string inputs.

## Requirements
- Maven
- JUnit 5

## Setup Instruction

### Install Maven
1. Download Maven from the Apache Maven website.
2. Unpack the archive to a directory of your choice.
3. Add the bin directory of the created directory to the PATH environment variable.
4. Verify the installation by running:
  mvn -version

### Setup VS Code 
1. Install the Java Extension Pack.

### Run the Project
1. To clean and build the project:
   mvn clean install
2. To execute the tests:
   mvn test

## StringUtils Class 
The StringUtils class provides the following string operations:

* Concatenation of two strings
* Reversal of a string
* Conversion of a string to uppercase
* Trimming of leading and trailing whitespace

## StringUtilsTest Class
The StringUtilsTest class implements parameterized test cases using JUnit 5 to verify the functionality of the string operations under different input scenarios. It includes test cases with various types of string inputs, including empty strings, single characters, alphanumeric strings, and strings with whitespace.

## Test Plan

The test plan outlines the test objectives, test scenarios, and test data. It is documented in the TestPlan.md file.

## Test Report

The test report documents the test execution results and findings. It is documented in the TestReport.md file.

### Test Run
<img width="930" alt="testrun" src="https://github.com/user-attachments/assets/8c46f8f8-2e73-4c67-9528-fe5b82d7994b">

### Test Result
<img width="778" alt="testresult" src="https://github.com/user-attachments/assets/406d73e1-375b-4ed4-8da4-fd52ef62a8f6">

