
create table avaliador(
	id serial primary key,
	nome varchar(100) not null
);

create table bar(
	id serial primary key,
	nome varchar(100) not null,
	endereco varchar(100),
	preco float,
	ambiente float,
	atendimento float,
	gelada float,
	drinks float
);
create table japones(
	id serial primary key,
	nome varchar(100) not null,
	endereco varchar(100),
	preco float,
	ambiente float,
	atendimento float,
	variedades float,
	peixeFresco float
);

create table hamburgueria(
	id serial primary key,
	nome varchar(100) not null,
	endereco varchar(100),
	preco float,
	ambiente float,
	atendimento float,
	hamburger float,
	acompanhamento float
);

create table restaurantes(
	id_avaliador int references avaliador(id),
	id_bar int references bar(id),
	id_hamburgueria int references hamburgueria(id),
	id_japones int references japones(id)
);