# README - Projeto CRUD SPA Pet

## Participantes
 Luciana Souza Ferreira de Oliveira
 Jessica de Oliveira Alves

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

#Funcionalidades

Este projeto oferece as seguintes funcionalidades:
Cadastro, leitura, atualização e exclusão (lógica ou física) de clientes, pets, serviços e pedidos.
Autenticação básica de usuário usando Spring Security.

#Executando o Projeto

Clone o repositório do projeto.

Abra o projeto em sua IDE.

Execute a aplicação Spring Boot.

Acesse a API através dos endpoints definidos para realizar operações CRUD e autenticação.
