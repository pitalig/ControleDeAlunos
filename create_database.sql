drop database progweb;
create database progweb;
use progweb;
create table tblAluno(
   id        int not null auto_increment,
   nome      varchar(200),
   email     varchar(100),
   endereco  varchar(200),
   constraint pk_aluno primary key (id)
);
