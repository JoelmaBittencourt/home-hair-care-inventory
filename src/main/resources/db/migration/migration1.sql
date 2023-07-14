CREATE TABLE PRODUCT (
  code INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  preco DECIMAL(10, 2) NOT NULL,
  quantidade INT NOT NULL,
  tamanho INT NOT NULL,
  validade DATE,
  localDeCompra VARCHAR(255),
  tipoProduto VARCHAR(255) NOT NULL,
  marca VARCHAR(255) NOT NULL,
  descricao VARCHAR(255),
  ativo BOOLEAN,
  dataCompra DATE
)
