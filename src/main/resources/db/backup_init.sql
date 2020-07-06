create table category (
	id bigint not null auto_increment,
    name varchar(50) not null,
    
    primary key(id)
);

create table suplier (
	id bigint not null auto_increment,
    name varchar(50) not null,
    cnpj varchar(20) not null,
    
    primary key(id)
);

create table book (
	id bigint not null auto_increment,
    title varchar(150) not null,
    isbn varchar(50) not null,
    description text,
    id_suplier bigint not null,
    id_category bigint not null,
    
    primary key(id)
);
alter table book add constraint fk_book_category
foreign key (id_category) references category(id);
alter table book add constraint fk_book_suplier
foreign key (id_suplier) references suplier(id);

insert into category (name) values ("ACTION"), ("ROMANCE"),("COMEDY");

create table user(
	id bigint not null auto_increment,
	name varchar(150) not null,
	address varchar(250) not null,
	login varchar(50) not null,
	password varchar(250) not null,
	
	primary key(id)
);
    
create table book_sale (
	id bigint not null auto_increment,
    id_sale bigint not null,
    id_book bigint not null,
    quantity bigint not null,
    
    primary key(id)
);

create table sale (
	id bigint not null auto_increment,
    id_user bigint not null,
    data_fechamento datetime not null,
    data_entrega datetime not null,
    
    primary key(id)
);
alter table book_sale add constraint fk_book_sale_book
foreign key (id_book) references book(id);
alter table book_sale add constraint fk_book_sale_sale
foreign key (id_sale) references sale(id);

alter table sale add constraint fk_sale_user
foreign key (id_user) references user(id);
