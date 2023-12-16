# README - Projeto CRUD SPA Pet

## Participantes
 Luciana Souza Ferreira de Oliveira |  Jessica de Oliveira Alves

## Introdução
Este é um projeto de uma API REST desenvolvido em Spring Boot para gerenciar um SPA Pet, incluindo operações CRUD (Create, Read, Update, Delete) para serviços, cliente, pet e pedidos.
O projeto também inclui autenticação básica usando o Spring Security e utiliza o banco de dados H2.

## Requisitos

- Java 11 - 17
- Spring Boot
- H2 Database

## Configuração do Ambiente

Certifique-se de ter o Java 11 ou 17 instalado em seu sistema.

## Configuração do Spring Boot

1. Crie um novo projeto Spring Boot usando o Spring Initializer.
   
2. Certifique-se de selecionar as seguintes dependências:
   - Spring Web
   - Spring Data JPA
   - H2 Database
   - Spring Security

4. Abra o arquivo `application.properties` e configure as propriedades do banco de dados H2:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
```

#Funcionalidades

Este projeto oferece as seguintes funcionalidades:
Cadastro, leitura, atualização e exclusão (lógica ou física) de clientes, pets, serviços e pedidos.
Autenticação básica de usuário usando Spring Security.

#Executando o Projeto

Clone o repositório do projeto.

Abra o projeto em sua IDE.

Execute a aplicação Spring Boot.

Acesse a API através dos endpoints definidos para realizar operações CRUD e autenticação.

#Endpoints da API

##Autenticação
POST /login: Autentica um usuário e gera um token de acesso.

##Cliente
POST /customer/add: Cria um novo cliente.
GET /customer/list: Retorna todos os clientes.
GET /customer/{id}: Retorna um cliente específico pelo ID.
PUT /customer/{id}: Atualiza um cliente existente pelo ID.
DELETE /customer/{id}: Remove logicamente ou fisicamente um cliente pelo ID.

##Pedido
POST /order: Cria um novo pedido.
GET /order/list: Retorna todos os pedidos.
GET /order/{id}: Retorna um pedido específico pelo ID.
PUT /order/{id}: Atualiza um pedido existente pelo ID.
DELETE /order/{id}: Remove logicamente ou fisicamente um pedido pelo ID.

##Pet
POST /pet/add: Cria um novo pet.
GET /pet/list: Retorna todos os pets.
GET /pet/{id}: Retorna um pet específico pelo ID.
PUT /pet/{id}: Atualiza um pet existente pelo ID.
DELETE /pet/{id}: Remove logicamente ou fisicamente um pet pelo ID.

##Tipo de Serviço
POST /types/add: Cria um novo tipo de serviço.
GET /types/list: Retorna todos os tipos de serviços.
GET /types/{id}: Retorna um tipo de serviço específico pelo ID.
PUT /types/{id}: Atualiza um tipo de serviço existente pelo ID.
DELETE /types/{id}: Remove logicamente ou fisicamente um tipo de serviço pelo ID.
