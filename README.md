# Projetos de Estudos de Microsserviços em Java

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/yagobmoreira/java-microservices">
  <img alt="GitHub Top Language" src="https://img.shields.io/github/languages/top/yagobmoreira/java-microservices" />
</p>


Este repositório contém projetos desenvolvidos em Java para estudos de microsserviços. Cada projeto demonstra diferentes aspectos e tecnologias utilizadas em arquiteturas de microsserviços.

## Projetos

### 1. java-spring-and-kafka

#### Descrição
O projeto `java-spring-and-kafka` é uma aplicação simples que demonstra o uso de dois serviços, `venda-service` e `estoque-service`, que se comunicam através do Apache Kafka.

#### Estrutura do Projeto
- **venda-service**: Serviço responsável por gerenciar as vendas.
- **estoque-service**: Serviço responsável por gerenciar o estoque.
- **Kafka**: Utilizado para comunicação assíncrona entre os serviços.

#### Tecnologias Utilizadas
- Java
- Spring Boot
- Apache Kafka
- Docker (para configurar o ambiente do Kafka)

#### Como Executar

1. **Pré-requisitos**
   - JDK 17 ou superior
   - Docker e Docker Compose

2. **Clone o repositório (Utilizar Link SSH)**.
3. **Acesse a pasta do projeto**
   ```bash
   cd java-microservices/java-spring-and-kafka
4. **Suba o Ambiente do Kafka e os Serviços com Docker**
   ```bash
   docker compose up -d --build
5. **Testando a comunicação**
- Envie uma requisição de venda para o `venda-service`
- Por padrão o serviço estará ativo na porta 8082.

