# Desafio Magalu - Backend

Este é um projeto de API REST para solicitação, consulta e remoção de agendamentos de envio de comunicação, desenvolvido como parte de um desafio técnico. A aplicação utiliza Java com Spring Boot, JPA, MySQL e Docker, com suporte a agendamentos automáticos via Scheduler.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Docker
- Scheduler (Agendamentos com Spring)
- Maven

## Funcionalidades

- **Criar Agendamento:** Registra um novo agendamento de envio de comunicação futura.
- **Consultar Agendamentos:** Retorna todos os agendamentos cadastrados ou um específico por ID.
- **Remover Agendamento:** Exclui um agendamento já registrado.
- **Envio programado:** Agendamentos são processados automaticamente quando a data/hora programada é atingida.

A API estará disponível em `http://localhost:8080`.

### Endpoints

| Método | Rota                   | Descrição                       |
|--------|------------------------|---------------------------------|
| POST   | `/notifications`       | Cria um novo agendamento        |
| GET    | `/notifications/{id}`  | Consulta agendamento por ID     |
| DELETE | `/notifications/{id}`  | Remove um agendamento           |

### Exemplo de Requisição - POST `/notifications`

```json
{
	"dateTime": "2025-05-13T16:15:00",
	"destination": "teste@email.com",
	"message": "Seja bem-vindo",
	"channel": "EMAIL"
}
```

## Banco de Dados

A aplicação usa um container MySQL configurado no `docker-compose.yml`. As credenciais e configurações estão disponíveis no arquivo `application.properties`.

## Agendamentos (Scheduler)

O processamento automático dos agendamentos é feito por uma tarefa agendada que verifica os registros com `dataAgendamento` vencida e os marca como enviados.

## Estrutura do Projeto

- `controller` - Camada REST da aplicação
- `service` - Regras de negócio e agendamentos
- `repository` - Interfaces de persistência JPA
- `entity` - Entidades JPA
- `scheduler` - Tarefa de envio programado

## Licença

Este projeto está licenciado sob a licença MIT.
