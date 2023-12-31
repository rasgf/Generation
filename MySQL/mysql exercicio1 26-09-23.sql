create database db_RH;

use db_RH;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
depart varchar(255) not null,
salario decimal not null,
admissao date not null,
contrato varchar(255),
primary key (id)
);

insert into tb_funcionarios(nome,depart,salario, admissao,contrato) values ("Claudia","Financeiro",4500.00,"2016-06-11","Home Office");
insert into tb_funcionarios(nome,depart,salario, admissao,contrato) values ("Sergio","Financeiro",1800.00,"2018-10-05","Presencial");
insert into tb_funcionarios(nome,depart,salario, admissao,contrato) values ("Fernanda","Juridico",3500.00,"2011-03-10","Semi-presencial");
insert into tb_funcionarios(nome,depart,salario, admissao,contrato) values ("Carlos","Juridico",1500.00,"2022-04-05","Presencial");

select * from tb_funcionarios; 

select * from tb_funcionarios where salario > 2000.00;

delete from tb_funcionarios where id = 1;

select * from tb_funcionarios where salario < 2000.00;

update tb_funcionarios set salario = 6000.00 where id = 5;

