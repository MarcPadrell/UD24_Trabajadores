
DROP table IF EXISTS trabajador;


create table trabajador(
	id int primary key auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario double default null
);

insert into trabajador (nombre, trabajo, salario)values('Jose','IT',1850.56);
insert into trabajador (nombre, trabajo, salario)values('Juan','RRHH',1300.30);
insert into trabajador (nombre, trabajo, salario)values('Pedro','Marketing',1400.80);
insert into trabajador (nombre, trabajo, salario)values('Jordi','FullStack',2500.95);
insert into trabajador (nombre, trabajo, salario)values('Jonatan','Consultor',3000.40);