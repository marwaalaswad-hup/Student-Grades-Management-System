# Student Grades Management System

An academic JavaFX desktop application project for managing student grades. This repository contains the **login screen and dashboard portion** of a larger team project, not the complete grade-management application.

## Included features
- JavaFX login interface with input validation feedback
- Dashboard UI and event handlers
- Navigation from login to dashboard and back to login
- CSS-based interface styling

The **Add Student, Add Grades, View Students and Reports** buttons are disabled because their Java/FXML files were **not included** in the source archive used to prepare this repository. Those features were described in the team report but are not claimed as implemented here.

## Technologies
Java 17, JavaFX, FXML, CSS, Maven

## Run locally
Requirements: **JDK 17+** and **Maven 3.9+**.

```bash
mvn clean javafx:run
```

Demo-only credentials:
- **Username:** `demo`
- **Password:** `demo123`

> These credentials are hardcoded for a classroom demonstration. This is **not** a secure or production-ready authentication system. Do not reuse these credentials for real accounts.

## Structure
```text
src/main/java/com/mycompany/main/
  Main.java
  LoginController.java
  DashboardController.java
src/main/resources/com/mycompany/main/
  Login.fxml
  Dashboard.fxml
  style.css
pom.xml
```

## Academic context
Advanced Programming course group project. The source files provided for this repository cover the login/dashboard and navigation portion. The full team report describes additional screens/modules, but their implementation files are not part of this repository.

## Privacy
The original academic report is not published here because it contains students' names and university IDs. If you want to publish a report, prepare a redacted version first and obtain any necessary permission from your teammates.
