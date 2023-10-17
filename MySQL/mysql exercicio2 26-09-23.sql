create database db_ecommerce;

use db_ecommerce;

Create table Produtos (
    id int auto_increment,
    Nome varchar(100),
    Ano int,
    Preco decimal(10,2),
    QuantidadeEstoque int,
    Categoria varchar(50),
    primary key (ID)
);

insert into Produtos (Nome, Ano, Preco, QuantidadeEstoque, Categoria) values
('Galaxy S23 Ultra', 2023, 7999.99, 30, 'Smartphone'),
('Galaxy S23+', 2023, 5999.99, 20, 'Smartphone'),
('Galaxy S23', 2023, 4999.99, 30, 'Smartphone'),
('Galaxy watch 5 pro', 2023, 249.99, 30, 'Smartwatch'),
('Galaxy watch 5', 2023, 1299.99, 30, 'Smartwatch'),
('Galaxy buds 2', 2022, 449.99, 20, 'Fone'),
('Galaxy buds', 2022, 399.99, 10, 'Fone'),
('Powerbank', 2022, 299.99, 10, 'Bateria');

select * from Produtos;

update Produtos set preco = 1999.99 where id = 4;

select * from Produtos where preco < 2000.00;

select * from Produtos where preco > 2000.00;