# Desafio Técnico - API REST de Beneficiários e Documentos

Este projeto consiste em uma API RESTful desenvolvida como parte de um desafio técnico. A API permite o gerenciamento de **beneficiários** e seus **documentos**, suportando operações de cadastro, listagem, atualização e remoção.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (ex: PostgreSQL, H2)
- Maven

## Endpoints Disponíveis

### Beneficiários

#### 1. Cadastrar um beneficiário com seus documentos

- **POST** `/v1/beneficiario`
- **Descrição**: Cadastra um novo beneficiário junto com seus dados pessoais.
- **Corpo da requisição**:
```json
{
  "nome": "João da Silva",
  "cpf": "12345678900",
  "telefone": "11999999999",
  "dataNascimento": "1990-05-10"
}
```
- **Resposta**:
```json
{
  "idBeneficiario": "uuid-gerado",
  "nome": "João da Silva",
  "cpf": "12345678900"
}
```

---

#### 2. Listar todos os beneficiários cadastrados

- **GET** `/v1/beneficiario`
- **Descrição**: Retorna uma lista com todos os beneficiários cadastrados.

---

#### 3. Listar dados detalhados de um beneficiário por ID

- **GET** `/v1/beneficiario/{idBeneficiario}`
- **Descrição**: Retorna os dados detalhados do beneficiário com base em seu ID.

---

#### 4. Atualizar dados de um beneficiário

- **PATCH** `/v1/beneficiario/{idBeneficiario}`
- **Descrição**: Altera os dados cadastrais de um beneficiário existente.
- **Corpo da requisição**:
```json
{
  "telefone": "11988888888"
}
```

---

#### 5. Remover um beneficiário

- **DELETE** `/v1/beneficiario/{idBeneficiario}`
- **Descrição**: Remove um beneficiário do sistema com base em seu ID.

---

### Documentos

#### 6. Cadastrar documentos para um beneficiário existente

- **POST** `/v1/documento/{idBeneficiario}/novos-documentos`
- **Descrição**: Adiciona novos documentos ao beneficiário informado.
- **Corpo da requisição**:
```json
{
  "tipo": "RG",
  "numero": "123456789"
}
```

---

#### 7. Buscar documentos de um beneficiário por ID do documento

- **GET** `/v1/documento/buscaDocumentos/{idDocumento}`
- **Descrição**: Retorna os dados detalhados de um documento com base em seu ID.

---

#### 8. Editar um documento existente

- **PATCH** `/v1/documento/edita-documento/{idDocumento}`
- **Descrição**: Altera os dados de um documento já cadastrado.
- **Corpo da requisição**:
```json
{
  "numero": "987654321"
}
```

---

## Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/pedhros/beneficiario-documento.git
```

2. Acesse a pasta do projeto:
```bash
cd beneficiario-documento
```

3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080/beneficiario-documento/api/swagger-ui/index.html#/`.

---

## Observações

- Os dados são validados de acordo com as anotações presentes nos DTOs (`@Valid`).
- Pode-se utilizar um banco em memória (como H2) para testes locais.
- Todos os IDs utilizados são do tipo UUID.

---