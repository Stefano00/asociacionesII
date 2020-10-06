create database asociacionesii;
use asociacionesii;
create table pasajero(id integer not null auto_increment primary key, rut varchar(100), nombre varchar(100), apellido varchar(100), edad int, ciudad_natal varchar(100));
select * from pasajero;

create table destino (id integer not null auto_increment primary key, ciudad varchar(100), pais varchar(100), fecha date, id_destino Integer not null, foreign key(id_destino) references pasajero(id));
select * from destino;
insert into pasajero values(1,'17953245-k','Stefano','Marin', 28,'Santiago');
select * from pasajero;
insert into destino values(1,'Santiago','Chile','2020-08-13', 1);

select * from pasajero p inner join destino d on p.id = d.id_destino where d.id=1;


