# Sistema Bancário

![License](https://img.shields.io/github/license/teresabat/sistema-bancario)
![Java](https://img.shields.io/badge/Java-11-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-brightgreen)
![MongoDB](https://img.shields.io/badge/MongoDB-4.4-green)

## Descrição

O **Sistema Bancário** é uma aplicação web desenvolvida para gerenciar operações bancárias básicas, como criação de contas, depósitos, saques e transferências. Este projeto foi desenvolvido usando **Java**, **Spring Boot**, e **MongoDB**.

## Funcionalidades

- **Criação de Conta:** Permite aos usuários criar novas contas bancárias.
- **Depósito:** Realiza depósitos em contas existentes.
- **Saque:** Realiza saques de contas existentes.
- **Transferência:** Transfere fundos entre contas.
- **Consulta de Saldo:** Exibe o saldo atual de uma conta.

## Tecnologias Utilizadas

- **Java 11**
- **Spring Boot 2.5.4**
- **MongoDB 4.4**
- **Maven**
- **Lombok**

## Configuração do Projeto

### Pré-requisitos

- **Java 11**
- **Maven**
- **MongoDB**

### Instalação

1. **Clone o repositório:**

    ```bash
    git clone https://github.com/teresabat/sistema-bancario.git
    cd sistema-bancario
    ```

2. **Configure o MongoDB:**

    Certifique-se de que o MongoDB está rodando e configure as propriedades de conexão no `application.properties`:

    ```properties
    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database=sistema_bancario_db
    spring.data.mongodb.username=seu_usuario
    spring.data.mongodb.password=sua_senha
    spring.data.mongodb.auto-index-creation=true
    ```

3. **Compile e execute a aplicação:**

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

### Testes

Para executar os testes da aplicação, use o seguinte comando:

```bash
mvn test
```

Uso
Acesse a aplicação no seu navegador em http://localhost:8080. Utilize as seguintes rotas para realizar operações:

Criar Conta: POST /api/accounts
Depósito: POST /api/accounts/{id}/deposit
Saque: POST /api/accounts/{id}/withdraw
Transferência: POST /api/accounts/transfer
Consultar Saldo: GET /api/accounts/{id}/balance
Contribuição
Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

Fork o repositório
Crie uma branch para sua feature (git checkout -b feature/nova-feature)
Commit suas mudanças (git commit -m 'Adiciona nova feature')
Push para a branch (git push origin feature/nova-feature)
Abra um Pull Request
Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Contato
Desenvolvido por Teresa Batista. Você pode entrar em contato pelo email: teresabat@example.com.

<p align="center">
  Feito com ❤️ por <a href="https://github.com/teresabat" target="_blank">teresabat</a>
</p>
```
Certifique-se de substituir os valores de exemplo, como seu_usuario, sua_senha e o email de contato pelo seu email verdadeiro. Este README.md oferece uma visão geral clara e profissional do projeto, incluindo funcionalidades, tecnologias, instruções de instalação e contribuição.
