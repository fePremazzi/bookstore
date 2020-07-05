create table category (
	id bigint not null auto_increment,
    name varchar(50) not null,
    
    primary key(id)
);

insert into category (name) values ("ACTION"), ("ROMANCE"),("COMEDY");

create table suplier (
	id bigint not null auto_increment,
    name varchar(50) not null,
    cnpj varchar(20) not null,
    
    primary key(id)
);
