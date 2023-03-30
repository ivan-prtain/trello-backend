create table board(
    id int auto_increment,
    name  varchar(255) not null,
    primary key (id)
);

create table boardDetails(
    id int not null,
    name varchar(255) not null,
    board_id int not null,
    primary key (id),
    foreign key (board_id) references board(id)
);