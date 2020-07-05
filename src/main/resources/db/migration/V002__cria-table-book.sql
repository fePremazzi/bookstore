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