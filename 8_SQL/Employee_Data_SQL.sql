create database Employee;
use Employee;  

create table EMP_Data( 
    EMP_No int(5),
    EMP_Name varchar(20),
    EMP_Exp int(5),
    EMP_Department varchar(20),
    EMP_Salary int(10)
);

insert into EMP_Data values(101,'Ajay Yadav',11,'IT',60000);
insert into EMP_Data values(102,'Anoop Negi',12,'Finance',65000);
insert into EMP_Data values(103,'Tanvi Kandpal',7,'IT',43000);
insert into EMP_Data values(104,'Sanket Mishra',16,'Sales',87000);
insert into EMP_Data values(105,'Arjun Fenn',3,'Finance',23000);
insert into EMP_Data values(106,'Vinay Yadav',8,'IT',54000);
insert into EMP_Data values(107,'Bhavesh sharma',5,'Sales',32000);
insert into EMP_Data values(108,'Venkat Raman',9,'Finance',66900);
insert into EMP_Data values(109,'Devi Ramesh',18,'IT',98000);
insert into EMP_Data values(110,'Kiran Narayan',19,'Sales',95000);
select * from EMP_Data;

select * from EMP_Data where EMP_Department='IT';
select * from EMP_Data where EMP_Department='Sales';