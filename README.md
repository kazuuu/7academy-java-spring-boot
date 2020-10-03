# 7comm-java-spring-boot
RESTful Web Service with Spring Boot and Clean Architecture

## Projeto realizado para o curso de Java da 7Academy ##

Neste projeto, estamos utilizando o framework Spring Boot Web para desenvolvermos uma Rest API.

As classes e códigos estão organizados com base na arquitetura limpa (Clean Archtecture).

Para não complicarmos nesta etapa estamos utilizando o método de autentição Basic Authentication através do Spring Security. Isso significa que todas rotas estão seguras, porém a autorização de acesso da API é passado em cada requisição com login e senha. Não há um processo de autenticação (login) para receber o token de autorização.

Para facilitar a interação e testes com a API utilizar a Collection do Postman que está incluso na raíz do projeto. Basta importar o arquivo "Cobranca Interna.postman_collection" no aplicativo do Postman.

### Install ###
1. Instalar o MySQL Server
2. Criar um Database com nome: cobranca
3. Editar o arquivo src/main/resources/application.properties e configurar a URL de Conexão, usuário e senha do Banco de Dados.

### Main Technological Knowledge: ###
- MySQL
- Java
- Spring Boot Web
- Spring Boot Security
- Spring Boot JPA with Hibernate

