CREATE TABLE empresas
(
    id       SERIAL PRIMARY KEY,
    nome     VARCHAR(255) NOT NULL,
    email    VARCHAR(255) UNIQUE,
    telefone VARCHAR(20)  NOT NULL,
    cnpj     VARCHAR(20)  NOT NULL,
    senha    VARCHAR(255) NOT NULL
);
