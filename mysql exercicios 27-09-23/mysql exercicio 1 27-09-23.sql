create database db_generation_game_online;
use db_generation_game_online;

create table tb_classes (
id int auto_increment,
classe varchar(100) not null,
exp int,
primary key (ID)
);

create table tb_personagens (
id int auto_increment,
nome varchar(100),
genero varchar(100),
idade int,
altura decimal(10,2),
ataque int,
defesa int,
classe_id int,
primary key (ID),
foreign key (classe_id) references tb_classes(id)
);

insert into tb_classes (classe, exp) values
('Cavaleiro', 1200),
('Feiticeiro', 1000),
('Ladrão', 800),
('Arqueiro', 900),
('Clérigo', 1100);

insert into tb_personagens (nome, genero, idade, altura, ataque, defesa, classe_id) values
    ('Alice', 'Feminino', 25, 1.68, 2000, 1750, 1),
    ('Bob', 'Masculino', 30, 1.80, 1700, 1600, 2),
    ('Carla', 'Feminino', 28, 1.65, 2700, 1900, 1),
    ('David', 'Masculino', 35, 1.75, 1800, 1500, 3),
    ('Eva', 'Feminino', 22, 1.70, 1600, 1700, 2),
    ('Frank', 'Masculino', 40, 1.85, 1900, 1400, 1),
    ('Grace', 'Feminino', 27, 1.63, 2500, 1800, 3),
    ('Hank', 'Masculino', 32, 1.78, 1650, 1650, 2);

select * from tb_personagens;

SELECT * FROM tb_personagens WHERE ataque > 2000;

SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 and 2000;

SELECT * FROM tb_personagens WHERE nome LIKE '%c%';

SELECT * FROM tb_personagens inner join tb_classes on tb_personagens.classe_id = tb_classes.id;

SELECT * FROM tb_personagens inner join tb_classes on tb_personagens.classe_id = tb_classes.id
WHERE tb_classes.classe = "Ladrão";
