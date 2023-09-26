create database db_Escola;

use db_Escola;

Create table Alunos (
    id int auto_increment,
    nome varchar(255),
    ano int,
    turma int,
    turno varchar(50),
    nota decimal(10,2),
    primary key (ID)
);

insert into Alunos (nome, ano, turma, turno, nota) values
('Ana Gabriela Souza', 2, 21, 'Manhã', 8.0),
('Matheus Souza', 2, 21, 'Manhã', 8.5),
('Carlos Silva', 2, 22, 'Tarde', 9.00),
('Patrick Estrela', 2, 22, 'Tarde', 5.3),
('Maria Clara', 3, 31, 'Manhã', 10.00),
('Maria Escura', 3, 31, 'Manhã', 10.00),
('Eduardo Pereira', 3, 32, 'Tarde', 5.7),
('João da Silva', 1, 11, 'Manhã', 7.00);


select * from Alunos;

update Alunos set nota = 6.5 where id = 7;

select * from Alunos where nota < 7;

select * from Alunos where nota > 7;