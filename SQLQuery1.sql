Create Database EmployeeDB
go
use EmployeeDB
go
create table Employee(
	Id int primary key identity,
	Name nvarchar(100) not null,
	Age int not null,
	Position nvarchar(100) not null,
	Salaryrange int not null,
	[Address] nvarchar(100)
)
go 
select * from Employee
go
insert into Employee values ('Fahad', '23', 'General Manager', '20000', 'Dhaka')
insert into Employee values ('Jony', '21', 'Managing Director', '35000', 'Dhaka')
insert into Employee values ('Rasel', '22', 'Chief Technology Officer', '25000', 'Dhaka')
go
create proc getAllEmployee
as
	select * from Employee
go
exec getAllEmployee
go 
