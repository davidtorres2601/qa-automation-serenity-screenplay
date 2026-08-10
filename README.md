\# Farmacias Peruanas - QA Automation



Proyecto de automatización de pruebas Web y API desarrollado utilizando \*\*Java, Serenity BDD, Screenplay, Selenium WebDriver, Cucumber y Serenity REST\*\*.



El proyecto contiene pruebas automatizadas para validar funcionalidades de la página de documentación de Selenium y servicios API de ReqRes.



\---



\## Tecnologías utilizadas



\- Java 17

\- Maven

\- Serenity BDD 5.3.8

\- Serenity Screenplay

\- Serenity Screenplay WebDriver

\- Serenity REST

\- Selenium WebDriver

\- Cucumber 7.34.2

\- JUnit 6

\- Chrome / ChromeDriver

\- ReqRes API



\---



\## Estructura del proyecto



```text

src

├── test

│   ├── java

│   │   └── starter

│   │       ├── navigation

│   │       ├── questions

│   │       ├── stepdefinitions

│   │       │   ├── ApiStepDefinitions.java

│   │       │   └── SeleniumStepDefinitions.java

│   │       ├── tasks

│   │       │   ├── CreateUser.java

│   │       │   ├── ListUsers.java

│   │       │   ├── UpdateUser.java

│   │       │   ├── SearchFor.java

│   │       │   └── NavigateToWebDriver.java

│   │       └── ui

│   │

│   └── resources

│       ├── features

│       │   ├── selenium.feature

│       │   └── reqres.feature

│       ├── serenity.conf

│       └── junit-platform.properties

│

├── pom.xml

└── README.md

