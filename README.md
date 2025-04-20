# Controle de Ponto - API REST

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
   git clone https://github.com/seu-usuario/controle-ponto.git
   cd controle-ponto
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

Desenvolvido por um futuro cientista de dados, apaixonado por tecnologia e seguindo a missão de um desafio técnico. 🚀
