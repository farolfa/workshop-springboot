# 🚀 Criando Minha Primeira API com Spring Boot

Este projeto é uma **API REST desenvolvida com Spring Boot**, criada com o objetivo de praticar desenvolvimento backend em Java e compreender a estrutura de uma aplicação organizada em camadas.

A aplicação passou por duas fases de banco de dados:

* Inicialmente utilizando **H2 (em memória)** para testes locais
* Posteriormente migrada para **PostgreSQL**, permitindo persistência real dos dados

Atualmente, a API está publicada online utilizando a plataforma **Koyeb**.

---

## 🌐 Aplicação Online

A aplicação foi publicada na nuvem utilizando o Koyeb.

Link da API online:

```
https://disappointed-joye-koyebpessoal-17d1363c.koyeb.app/
```

A API está ativa e pronta para receber requisições HTTP (GET, POST e DELETE).

---

## 🛠 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Maven
* H2 Database (fase inicial)
* PostgreSQL (versão atual)
* Deploy em nuvem com Koyeb

---

## 📂 Estrutura do Projeto

```
src/
 └── main/
     ├── java/
     └── resources/
pom.xml
```

* controller → Endpoints REST
* service → Regras de negócio
* repository → Comunicação com o banco de dados
* model → Entidades da aplicação

---

## 🔎 Endpoints Disponíveis

Atualmente a API possui os seguintes métodos implementados:

* GET
* POST
* DELETE
* PUT (em desenvolvimento)

---

## 📌 Exemplos de Requisições

### GET – Listar registros

```
GET https://disappointed-joye-koyebpessoal-17d1363c.koyeb.app/seu-endpoint
```

---

### POST – Criar novo registro

```
POST https://disappointed-joye-koyebpessoal-17d1363c.koyeb.app/seu-endpoint
Content-Type: application/json
```

Exemplo de corpo da requisição:

```json
{
  "nome": "Novo Registro",
  "descricao": "Descrição do registro"
}
```

---

### DELETE – Remover registro

```
DELETE https://disappointed-joye-koyebpessoal-17d1363c.koyeb.app/seu-endpoint/{id}
```

---

## ▶️ Como Executar Localmente

### 1. Clonar o repositório

```bash
git clone https://github.com/farolfa/Criando-minha-primeira-api-Spring-boot.git
```

### 2. Entrar na pasta do projeto

```bash
cd Criando-minha-primeira-api-Spring-boot
```

### 3. Configurar o PostgreSQL

No arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### 4. Executar a aplicação

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

---

## 🎯 Objetivo do Projeto

* Criar uma API REST com Spring Boot
* Trabalhar com JPA e persistência de dados
* Migrar banco em memória (H2) para PostgreSQL
* Realizar deploy em ambiente cloud (Koyeb)
* Disponibilizar uma API funcional online

