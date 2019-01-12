create schema autos;

use autos;

create table cars (
   id int(11) not null auto_increment,
   brand varchar(255) null default '',
   model varchar(255) null default '',
   price double null,
   primary key (id)
)