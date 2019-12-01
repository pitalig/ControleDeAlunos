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
insert into alunos values (null, 'Jessica Silva','jessica@email.ru', 'Rua Abolicao');
insert into alunos values (null, 'Priscila Silva','pris@email.ru', 'Rua Abolicao');
insert into alunos values (null, 'Adolfo Silva','adolfo@email.ru', 'Rua Abolicao');

create table disciplinas(
   id        bigint not null auto_increment,
   nome      varchar(200),
   creditos  int,
   vagas     int,
   constraint pk_disciplina primary key (id)
);

insert into disciplinas values (null, 'Sistemas Operacionais', 4, 30);
insert into disciplinas values (null, 'Programacao para Web', 4, 30);
insert into disciplinas values (null, 'Algoritmos e Estruturas de Dados', 4, 30);
insert into disciplinas values (null, 'Algoritmos e Estruturas de Dados 2', 4, 30);

create table matricula(
    id bigint not null auto_increment,
    alunoId bigint,
    discId bigint,
    FOREIGN KEY (alunoId) REFERENCES alunos(id),
    FOREIGN KEY (discId) REFERENCES disciplinas(id),
    constraint pk_matricula primary key (id)
);

insert into matricula values (null, 1, 1);
insert into matricula values (null, 1, 2);
insert into matricula values (null, 2, 2);
insert into matricula values (null, 2, 3);
insert into matricula values (null, 3, 3);
insert into matricula values (null, 3, 4);

select * from alunos a
join matricula m on a.id = m.alunoId
join disciplinas d on d.id = m.discId;