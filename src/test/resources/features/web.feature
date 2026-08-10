Feature: Selenium website

  Scenario: Validar pagina principal de Selenium
    Given David abre la pagina de Selenium
    Then David debe visualizar el titulo "Selenium"

  Scenario: Navegar a Documentation
    Given David abre la pagina de Selenium
    When David navega a Documentation
    Then David debe visualizar el titulo "The Selenium Browser Automation Project"

  Scenario: Validar WebDriver
    Given David abre la pagina de Selenium
    When David navega a Documentation
    Then David debe visualizar "WebDriver"