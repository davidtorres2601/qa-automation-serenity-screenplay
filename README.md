# Farmacias Peruanas - QA Automation

Proyecto de automatización de pruebas Web y API desarrollado utilizando **Java, Serenity BDD, Screenplay, Selenium WebDriver, Cucumber y Serenity REST**.

El proyecto contiene pruebas automatizadas para validar funcionalidades de la página de documentación de Selenium y servicios API de ReqRes.

---

## Tecnologías utilizadas

- Java 17
- Maven
- Serenity BDD 5.3.8
- Serenity Screenplay
- Serenity Screenplay WebDriver
- Serenity REST
- Selenium WebDriver
- Cucumber 7.34.2
- JUnit 6
- Chrome / ChromeDriver
- ReqRes API

---

## Casos automatizados

El proyecto contiene **6 escenarios automatizados**.

### Pruebas Web - Selenium

1. **Validar página principal de Selenium**
   - Verifica que la página principal de Selenium se encuentre disponible.

2. **Navegar a Documentation**
   - Verifica la navegación desde la página principal hacia la sección Documentation.

3. **Validar WebDriver**
   - Verifica que la sección de Documentation contenga la información relacionada con WebDriver.

### Pruebas API - ReqRes

4. **Listar usuarios**
   - Consulta la API de usuarios.
   - Valida el código de respuesta `200`.
   - Valida que la respuesta contenga usuarios.

5. **Crear usuario**
   - Realiza una petición para crear un usuario.
   - Valida el nombre del usuario.
   - Valida el trabajo del usuario.

6. **Actualizar usuario**
   - Realiza una petición para actualizar un usuario.
   - Valida el nombre actualizado.
   - Valida el trabajo actualizado.
   - Valida el código de respuesta `200`.

---

## Estructura del proyecto

```text
src
├── test
│   ├── java
│   │   └── starter
│   │       ├── navigation
│   │       ├── questions
│   │       ├── stepdefinitions
│   │       │   ├── ApiStepDefinitions.java
│   │       │   ├── ParameterDefinitions.java
│   │       │   └── SeleniumStepDefinitions.java
│   │       │
│   │       ├── tasks
│   │       │   ├── CreateUser.java
│   │       │   ├── ListUsers.java
│   │       │   ├── NavigateToDocumentation.java
│   │       │   ├── NavigateToWebDriver.java
│   │       │   └── UpdateUser.java
│   │       │
│   │       ├── ui
│   │       └── CucumberTestSuite.java
│   │
│   └── resources
│       ├── features
│       │   ├── reqres.feature
│       │   └── web.feature
│       │
│       └── junit-platform.properties
│
├── pom.xml
├── serenity.properties
├── .gitignore
└── README.md