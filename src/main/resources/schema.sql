create table board(
    id int auto_increment,
    name  varchar(255) not null,
    primary key (id)
);

create table board_columns(
    id int not null auto_increment,
    name varchar(255) not null,
    reference int not null,
    primary key (id),
    foreign key (reference) references board(id)
);

create table cards(
    id int auto_increment,
    name varchar(255) not null,
    message varchar(255),
    reference int not null,
    primary key (id),
    foreign key (reference) references board_columns(id)
);

