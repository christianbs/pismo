CREATE TABLE account
(
    id              BIGSERIAL PRIMARY KEY,
    document_number VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE operation_type
(
    id          BIGSERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL
);

CREATE TABLE transaction
(
    id                BIGSERIAL PRIMARY KEY,
    account_id        INT       NOT NULL,
    operation_type_id INT       NOT NULL,
    amount            MONEY     NOT NULL,
    event_date        TIMESTAMP NOT NULL,
    FOREIGN KEY (account_id) REFERENCES account (id),
    FOREIGN KEY (operation_type_id) REFERENCES operation_type (id)
);