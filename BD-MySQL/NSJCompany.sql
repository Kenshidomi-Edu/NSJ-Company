create database nsjcompany;
use nsjcompany;

#Con esto se pueden colocar default en los datos de dateTime
	SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
	SET SQL_MODE='ALLOW_INVALID_DATES';
#COn lo de arriba

create table `NSJCompany`.`tipo_usuario` (
`id` int not null auto_increment,
`nombre` varchar(45) not null,
primary key (`id`));

insert into tipo_usuario (nombre) values ("Administrador"),("Usuario");

create table `NSJCompany`.`personal` (
`id` int not null auto_increment,
`nombreUsuario` varchar(45) not null,
`NAtendedor` int null,
`contraseña` varchar(45) not null,
`nombre` varchar(100) not null,
`correo` varchar(45) not null,
`fecha_ingreso` date null default '0000-00-00',
`ultima_sesion` datetime null default '0000-00-00 00:00:00',
`idTipo_usuario` int not null,
`salario` Decimal(3.9) not null,
primary key (`id`),
index `idTipoUsuario_idx` (`idTipo_usuario` asc),
constraint `idTipoUsuario`
foreign key (`idTipo_usuario`)
references `NSJCompany`.`tipo_usuario` (`id`)
on delete no action
on update no action);


use nsjcompany;
select * from personal;
select * from tipo_usuario;

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idCategoria`)
);

INSERT INTO `categoria` VALUES 
(1,'Bebidas'),
(2,'Congelados'),
(3,'Helados'),
(4,'Galletas'),
(5,'Limpieza'),
(6,'Alimentos ');

update categoria set nombre='Limpieza' where idCategoria=5;

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `codigoI`varchar(14) not null,
  `nombre` varchar(50) NOT NULL,
  `precio` decimal(8,4) NOT NULL,
  `idCategoria` int(5) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `stock` int(11) null,
  PRIMARY KEY (`idProducto`));
  ALTER TABLE `nsjcompany`.`producto` 
ADD INDEX `idCategoria_fk_idx` (`idCategoria` ASC) VISIBLE;
;
ALTER TABLE `nsjcompany`.`producto` 
ADD CONSTRAINT `idCategoria_fk`
  FOREIGN KEY (`idCategoria`)
  REFERENCES `nsjcompany`.`categoria` (`idCategoria`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

CREATE TABLE cliente (
  idCliente INT(12) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  rut VARCHAR(15) NOT NULL UNIQUE,
  telefono INT(20) NOT NULL,
  correo VARCHAR(80) NOT NULL,
  direccion VARCHAR(100) NOT NULL
);
use nsjcompany;
select * from personal;
select * from categoria;
select * from tipo_usuario;
select * from producto;

select p.codigoI, p.nombre, p.precio, c.nombre as 'Categoria' ,p.cantidad, p.stock  from producto as p
inner join categoria as c on p.idCategoria = c.idCategoria;

CREATE TABLE `nsjcompany`.`proveedores` (
  `idproveedores` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `telefono` INT NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idproveedores`));

