\c admin admin
CREATE TABLE first_table (
    TableId int,
    FirstName varchar(100),
    Texttab varchar(100)
);
CREATE TABLE second_table (
    TableId int,
    SecondName varchar(100),
    Texttab varchar(100)
);

INSERT INTO first_table (TableId, FirstName, Texttab)
VALUES (1, 'Тест', 'Тестовый пример1');
INSERT INTO first_table (TableId, FirstName, Texttab)
VALUES (2, 'Тест2', 'Тестовый пример2');

INSERT INTO second_table (TableId, SecondName, Texttab)
VALUES (1, 'Тестик', 'Тестовый пример');
INSERT INTO second_table (TableId, SecondName, Texttab)
VALUES (2, 'Тестик2', 'Тестовый пример2');