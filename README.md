# Home Hair Care Inventory

## Descrição
Home Hair Care Inventory é uma aplicação para gerenciar estoque de produtos para cuidados com o cabelo e pele.

## Swagger
A documentação da API está disponível no Swagger. Para acessar, execute a aplicação e acesse a seguinte URL em seu navegador: `http://localhost:8080/swagger-ui.html`

## Banco de Dados H2
A aplicação utiliza o banco de dados H2 para armazenar os dados. O banco de dados H2 é um banco de dados em memória e pode ser acessado por meio de uma interface web.

Para acessar o console do H2, execute a aplicação e acesse a seguinte URL em seu navegador: `http://localhost:8080/h2-console`

As configurações para acessar o banco de dados H2 são as seguintes:
- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: (deixe em branco)

## Requisição POST usando cURL
Você pode usar o cURL para fazer uma requisição POST para criar um novo produto. Veja o exemplo de comando cURL abaixo:

```bash
curl -X POST -H "Content-Type: application/json" -d '{
  "nome": "Produto Exemplo",
  "preco": 9.99,
  "quantidade": 10,
  "tamanho": 100,
  "validade": "2023-12-31",
  "localDeCompra": "Loja Exemplo",
  "tipoProduto": "SHAMPOO",
  "marca": "Marca Exemplo",
  "descricao": "Descrição do produto",
  "dataCompra": "2023-07-03"
}' http://localhost:8080/products
