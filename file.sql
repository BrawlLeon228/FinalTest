CREATE DATABASE Друзья_человека;
USE Друзья_человека;

CREATE TABLE Домашние_животные (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    command VARCHAR(50),
    birth_date DATE
);

CREATE TABLE Вьючные_животные (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    command VARCHAR(50),
    birth_date DATE
);

INSERT INTO Домашние_животные (name, command, birth_date) VALUES
('Рex', 'Сидеть', '2021-06-05'),
('Мурка', 'Лежать', '2020-03-15'),
('Хомка', 'Бегать', '2022-11-01');

INSERT INTO Вьючные_животные (name, command, birth_date) VALUES
('Лошадь', 'Скакать', '2020-05-23'),
('Верблюд', 'Идти', '2019-12-12'),
('Осел', 'Тянуть', '2021-07-30');

DELETE FROM Вьючные_животные WHERE name = 'Верблюд';

CREATE TABLE Объединенные_животные AS (
    SELECT * FROM Вьючные_животные
    UNION
    SELECT * FROM Домашние_животные
);

CREATE TABLE Молодые_животные AS
SELECT *, TIMESTAMPDIFF(MONTH, birth_date, CURDATE()) AS age_months
FROM (
    SELECT * FROM Домашние_животные
    UNION ALL
    SELECT * FROM Вьючные_животные
) AS все_животные
WHERE TIMESTAMPDIFF(YEAR, birth_date, CURDATE()) < 3
  AND TIMESTAMPDIFF(YEAR, birth_date, CURDATE()) > 1;

CREATE TABLE Все_животные AS (
    SELECT * FROM Домашние_животные
    UNION ALL
    SELECT * FROM Вьючные_животные
);
