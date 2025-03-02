CREATE TABLE IF NOT EXISTS tasks
(
    id          BIGSERIAL PRIMARY KEY,
    title       VARCHAR(255) NOT NULL,
    description TEXT,
    due_date    TIMESTAMP,
    status      VARCHAR(50)  NOT NULL
);