# 🖼️ Imagem Hero

![Hero Image Placeholder](https://via.placeholder.com/1200x400.png?text=Controle+de+Ponto+e+Acesso+com+Spring+Boot)

---

# Controle de Ponto - API REST

[![Java 17+](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/technologies/javase/17-ea-downloads.html)
[![Spring Boot 3.x](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

Este projeto (SANTANDER BOOTCAMP FULLSTACK) é uma API REST desenvolvida com **Spring Boot** para controle de ponto e acesso de usuários de uma empresa. Ele utiliza as seguintes tecnologias:

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate Envers
- Lombok
- Swagger (OpenAPI)
- Banco de dados H2 (para testes)

## 📁 Estrutura do Projeto

```
src/
└── main/
    ├── java/
    │   └── com/suaempresa/controleponto/
    │       ├── controller/
    │       ├── model/
    │       ├── repository/
    │       ├── service/
    │       └── ControlePontoApplication.java
    └── resources/
        └── application.properties
```

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/galafis/Construindo-um-Sistema-de-Controle-de-Ponto-e-Acesso-com-Spring-Boot
   ```

2. Compile e execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse a documentação interativa do Swagger:
   ```
   http://localhost:8080/swagger-ui.html
   ```

4. Acesse o banco de dados H2:
   ```
   http://localhost:8080/h2-console
   ```

## 📌 Endpoints Básicos

- `POST /api/usuarios` — Cadastrar novo usuário
- `GET /api/usuarios` — Listar todos os usuários

## 🧠 Observações

- O Hibernate Envers está configurado para auditar as entidades.
- Lombok está sendo utilizado para reduzir código boilerplate.
- O banco H2 é temporário e reinicia ao parar a aplicação.

## 🛠 Tecnologias e Dependências

- spring-boot-starter-web
- spring-boot-starter-data-jpa
- hibernate-envers
- lombok
- springdoc-openapi-ui
- h2database

---

Desenvolvido por Gabriel Demetrios Lafis, um futuro cientista de dados, apaixonado por tecnologia e seguindo a missão de um desafio técnico. 🚀


## 📋 Descrição

Este projeto é uma API REST robusta para controle de ponto e acesso, desenvolvida com Spring Boot. Ele oferece funcionalidades essenciais para gerenciar usuários e seus registros de ponto, ideal para empresas que buscam uma solução eficiente e segura para monitoramento de jornada de trabalho.

## 📦 Instalação

Para instalar e configurar o projeto localmente, siga os passos abaixo:

1.  **Pré-requisitos:** Certifique-se de ter o Java Development Kit (JDK) 17 ou superior e o Maven instalados em sua máquina.
2.  **Clone o repositório:**
    ```bash
    git clone https://github.com/galafis/Construindo-um-Sistema-de-Controle-de-Ponto-e-Acesso-com-Spring-Boot
    ```
3.  **Navegue até o diretório do projeto:**
    ```bash
    cd Construindo-um-Sistema-de-Controle-de-Ponto-e-Acesso-com-Spring-Boot
    ```
4.  **Compile o projeto:**
    ```bash
    ./mvnw clean install
    ```

## 💻 Uso

Após a instalação e execução do projeto (conforme a seção "Como Executar"), você pode interagir com a API utilizando os endpoints básicos fornecidos. A documentação do Swagger (http://localhost:8080/swagger-ui.html) oferece uma interface interativa para testar todos os endpoints disponíveis.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

# 🇬🇧 English Version

# 🖼️ Hero Image

![Hero Image Placeholder](https://via.placeholder.com/1200x400.png?text=Time+and+Access+Control+with+Spring+Boot)

---

# Time and Access Control - REST API

[![Java 17+](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/technologies/javase/17-ea-downloads.html)
[![Spring Boot 3.x](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

This project (SANTANDER BOOTCAMP FULLSTACK) is a REST API developed with **Spring Boot** for time and access control of company users. It uses the following technologies:

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate Envers
- Lombok
- Swagger (OpenAPI)
- H2 Database (for testing)

## 📁 Project Structure

```
src/
└── main/
    ├── java/
    │   └── com/suaempresa/controleponto/
    │       ├── controller/
    │       ├── model/
    │       ├── repository/
    │       ├── service/
    │       └── ControlePontoApplication.java
    └── resources/
        └── application.properties
```

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/galafis/Construindo-um-Sistema-de-Controle-de-Ponto-e-Acesso-com-Spring-Boot
   ```

2. Compile and run the project:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Access the interactive Swagger documentation:
   ```
   http://localhost:8080/swagger-ui.html
   ```

4. Access the H2 database:
   ```
   http://localhost:8080/h2-console
   ```

## 📌 Basic Endpoints

- `POST /api/usuarios` — Register new user
- `GET /api/usuarios` — List all users

## 🧠 Observations

- Hibernate Envers is configured to audit entities.
- Lombok is used to reduce boilerplate code.
- The H2 database is temporary and restarts when the application stops.

## 🛠 Technologies and Dependencies

- spring-boot-starter-web
- spring-boot-starter-data-jpa
- hibernate-envers
- lombok
- springdoc-openapi-ui
- h2database

---

Developed by Gabriel Demetrios Lafis, a future data scientist, passionate about technology and following the mission of a technical challenge. 🚀


## 📋 Description

This project is a robust REST API for time and access control, developed with Spring Boot. It offers essential functionalities to manage users and their time records, ideal for companies seeking an efficient and secure solution for workforce monitoring.

## 📦 Installation

To install and configure the project locally, follow the steps below:

1.  **Prerequisites:** Ensure you have Java Development Kit (JDK) 17 or higher and Maven installed on your machine.
2.  **Clone the repository:**
    ```bash
    git clone https://github.com/galafis/Construindo-um-Sistema-de-Controle-de-Ponto-e-Acesso-com-Spring-Boot
    ```
3.  **Navigate to the project directory:**
    ```bash
    cd Construindo-um-Sistema-de-Controle-de-Ponto-e-Acesso-com-Spring-Boot
    ```
4.  **Compile the project:**
    ```bash
    ./mvnw clean install
    ```

## 💻 Usage

After installing and running the project (as per the "How to Run" section), you can interact with the API using the provided basic endpoints. The Swagger documentation (http://localhost:8080/swagger-ui.html) offers an interactive interface to test all available endpoints.

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

