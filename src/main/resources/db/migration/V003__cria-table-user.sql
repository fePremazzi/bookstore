create table user(
	id bigint not null auto_increment,
    name varchar(150) not null,
    address varchar(250) not null,
    login varchar(50) not null,
    password varchar(250) not null,
    
    primary key(id)
);