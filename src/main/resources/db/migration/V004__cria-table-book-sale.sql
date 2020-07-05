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