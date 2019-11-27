drop database progweb;
create database progweb;
use progweb;
create table alunos(
   id        bigint not null auto_increment,
   nome      varchar(200),
   email     varchar(100),
   endereco  varchar(200),
   constraint pk_aluno primary key (id)
);

insert into alunos values (null, 'Joao Silva','aluno@email.ru', 'Rua Abolicao');

select * from alunos;