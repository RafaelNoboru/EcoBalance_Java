CREATE TABLE consumos
(
    id         BIGSERIAL PRIMARY KEY,
    data       TIMESTAMP      NOT NULL,
    valor      DECIMAL(10, 2) NOT NULL,
    empresa_id BIGINT         NOT NULL,
    FOREIGN KEY (empresa_id) REFERENCES empresas (id) ON DELETE CASCADE
);

INSERT INTO consumos (data, valor, empresa_id)
VALUES ('2024-11-01 08:00:00', 40.2, 1),
       ('2024-11-01 12:00:00', 65.5, 1),
       ('2024-11-01 16:00:00', 70.8, 1),
       ('2024-11-02 08:00:00', 45.7, 1),
       ('2024-11-02 12:00:00', 72.0, 1),
       ('2024-11-02 16:00:00', 68.9, 1),
       ('2024-11-03 08:00:00', 55.1, 1),
       ('2024-11-03 12:00:00', 60.3, 1),
       ('2024-11-03 16:00:00', 72.5, 1);
