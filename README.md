# CatFact API Test

Automated API tests using Java, Cucumber, and RestAssured for the [Cat Facts API](https://catfact.ninja/), specifically testing the `/breeds` endpoint.

## 🧰 Tech Stack

- Java 11+
- Maven
- Cucumber
- RestAssured
- JUnit 4

---

## 📦 Clone & Run the Project

### 1. Clone this repository

```bash
git clone https://github.com/seu-usuario/catfact-api-test.git
cd catfact-api-test
```

### 2. Run the tests

```bash
mvn test
```

> 💡 O projeto baixa as dependências automaticamente via Maven.

---

## 📁 Project Structure

```text
catfact-api-test/
├── README.md                  # Instruções do projeto
├── pom.xml                    # Configurações do Maven e dependências
├── src/
│   └── test/
│       ├── java/
│       │   └── tests/
│       │       ├── steps/     # Implementações dos passos do Cucumber
│       │       │   └── BreedsSteps.java
│       │       ├── runners/   # Classe para executar os testes
│       │       │   └── TestRunner.java
│       └── resources/
│           └── features/      # Arquivos de cenários escritos em Gherkin
│               └── Breeds.feature
└── target/
    └── cucumber-report.html   # Relatório HTML gerado após os testes
```

### 🧭 O que faz cada parte

| Pasta/Arquivo              | Função |
|---------------------------|--------|
| `pom.xml`                 | Gerencia dependências (Cucumber, RestAssured, JUnit etc). |
| `features/`               | Onde ficam os testes no formato Gherkin (BDD). |
| `steps/`                  | Contém o código Java que implementa cada passo (`Given`, `When`, `Then`). |
| `runners/`                | Classe que executa os testes usando JUnit e configura o Cucumber. |

---

## 🧪 Test Scenarios

This project includes:

- ✅ Valid request to `/breeds`
- ✅ Pagination with `?limit=5`
- ✅ Field validation (`breed`, `country`, `origin`, `coat`, `pattern`)
- ❌ Invalid endpoint `/breedz`
---

## 📊 Report

Após rodar os testes, um relatório HTML será gerado em:

```
target/cucumber-report.html
```

Abra o arquivo com seu navegador favorito.

---

## 🧑‍💻 Author

Desafio técnico de QA para automação de testes backend com RestAssured + Cucumber.
