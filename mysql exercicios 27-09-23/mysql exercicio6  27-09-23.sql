CREATE DATABASE db_curso_da_minha_vida;
use db_curso_da_minha_vida;

CREATE Table tb_categorias(
	categoria_id bigint auto_increment primary key,
    nome varchar(255) not null,
    descricao text,
    imagem_url varchar(255)
);

CREATE Table tb_cursos(
    curso_id bigint auto_increment primary key,
    nome varchar(255) not null,
    descricao text,
    valor decimal(10,2),
    duracao_horas int,
    categoria_id bigint,
    foreign key (categoria_id) references tb_categorias(categoria_id)
);

INSERT INTO tb_categorias (nome, descricao, imagem_url) VALUES
('Programação', 'Cursos de programação para iniciantes e avançados.', 'https://example.com/programming.jpg'),
('Design Gráfico', 'Cursos de design gráfico e criação de mídia visual.', 'https://example.com/graphic_design.jpg'),
('Marketing Digital', 'Cursos sobre estratégias de marketing digital.', 'https://example.com/marketing_digital.jpg'),
('Línguas Estrangeiras', 'Cursos para aprender línguas estrangeiras.', 'https://example.com/languages.jpg'),
('Gestão de Projetos', 'Cursos sobre gerenciamento de projetos.', 'https://example.com/project_management.jpg');

INSERT INTO tb_cursos (nome, descricao, duracao_horas, valor,categoria_id) VALUES
('Introdução à Programação em Python', 'Curso introdutório de programação em Python.', 40, 500,1),
('Design de Logotipos Profissionais', 'Aprenda a criar logotipos profissionais.', 30, 1500, 2),
('Estratégias de Marketing nas Redes Sociais', 'Maximize seu alcance nas redes sociais.', 20, 5500, 3),
('Inglês para Iniciantes', 'Aprenda o básico do inglês.', 60, 8500, 4),
('Gestão de Projetos Ágeis', 'Curso avançado de gestão de projetos ágeis.', 50, 600, 5),
('Desenvolvimento Web Avançado', 'Aprofunde seus conhecimentos em desenvolvimento web.', 45, 900, 1),
('Adobe Photoshop Masterclass', 'Torne-se um especialista em Photoshop.', 35, 1000, 2),
('SEO e Marketing de Conteúdo', 'Domine as técnicas de SEO e marketing de conteúdo.', 25, 500, 3);

SELECT * FROM tb_cursos WHERE valor > 500;

SELECT * FROM tb_cursos WHERE valor BETWEEN 600 and 1000;

SELECT * FROM tb_cursos WHERE nome LIKE "%J%";

SELECT * FROM tb_cursos inner join tb_categorias on tb_cursos.categoria_id = tb_categorias.categoria_id;

SELECT * FROM tb_cursos inner join tb_categorias on tb_cursos.categoria_id = tb_categorias.categoria_id
WHERE tb_categorias.nome = 'Programação';