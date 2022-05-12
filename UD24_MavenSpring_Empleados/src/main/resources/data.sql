
DROP table IF EXISTS trabajador;


create table trabajador(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario double default null
);

/*insert into trabajador (nombre, trabajo, salario)values('Jose','IT',1850.56);
insert into trabajador (nombre, trabajo, salario)values('Juan','RRHH',1300.30);
insert into trabajador (nombre, trabajo)values('Pedro','Marketing');
insert into trabajador (nombre, trabajo)values('Jordi','FullStack');
insert into trabajador (nombre, trabajo)values('Jonatan','Consultor');*/