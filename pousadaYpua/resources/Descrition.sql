CREATE TABLE IF NOT EXISTS Usuario (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    celular VARCHAR(15),
    email VARCHAR(100),
    endereco VARCHAR(200),
    numero VARCHAR(10),
    cidade VARCHAR(100),
    cep VARCHAR(10),
    estado VARCHAR(2)
);

