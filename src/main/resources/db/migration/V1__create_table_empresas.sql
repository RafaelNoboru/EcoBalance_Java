CREATE TABLE empresas
(
    id         BIGSERIAL PRIMARY KEY,
    nome       VARCHAR(255)        NOT NULL,
    email      VARCHAR(255) UNIQUE NOT NULL,
    telefone   VARCHAR(20)         NOT NULL,
    cnpj       VARCHAR(20)         NOT NULL,
    senha      VARCHAR(255)        NOT NULL,
    papel      VARCHAR(50)         DEFAULT 'USER'
);

UPDATE empresas SET papel = 'ROLE_ADMIN' WHERE papel = 'ADMIN';
UPDATE empresas SET papel = 'ROLE_USER' WHERE papel = 'USER';
