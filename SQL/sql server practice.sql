use Learning;
select * from INFORMATION_SCHEMA.tables;
-char -ascii
-varchar -ascii
-nchar -unicode
-nvarchar -unicode
ascii
unicode


declare @chrMyCharacters as varchar(10)
set @chrMyCharacters=''
select @chrMyCharacters as myString, len(@chrMyCharacters) as MyLength,datalength(@chrMyCharacters) as mydataLength;
declare @chrASCII as varchar(10) ='   hello  '
declare @chrUNICODE as nvarchar(10)=N'helloజ్ఞా'
select @chrASCII ,@chrUNICODE;




declare @myvar as varchar(10)
select @myvar  --gives nullselect CONVERT(decimal(5,2),1000)-- gives error message
select TRY_CONVERT(decimal(5,2),1000)-- gives null



declare @firstname as nvarchar(20)
declare @middlename as nvarchar(20)
declare @lastname as  nvarchar(20)

set @firstname='Hemanth'
--set @middlename='Kumar Reddy'
set @lastname='Siripireddy'

select @firstname+' '+@middlename+' '+@lastname
select @firstname+iif(@middlename is null,'',' '+@middlename)+' '+@lastname
select @firstname +case when @middlename is null then '' else ' '+@middlename end+' '+@lastname
select @firstname+coalesce(' '+@middlename,'')+' '+@lastname
select concat(@firstname,' '+@middlename,' ',@lastname)

select 'My Number is: '+convert(varchar(20),4325)
select 'My Number is: '+cast(3456 as varchar(20))
select 'My Salary is: $'+convert(varchar(20),2345.6)
select 'My Salary is: '+format(2345.6,'C')
select 'My Salary is: '+format(2345.6,'C','fr-Fr')

select [name]+N'Ⱥ ' from sys.all_columns
select substring([name],1,len([name])-1) from sys.all_columns


declare @mydate as datetime='2015-06-24 12:34:56:125'
select @mydate as MyDate
declare @mydate2 as datetime2(4) ='2015-06-24 12:34:56:128'
select @mydate2 as Myda
select datefromparts(2015,04,23) as thisdate
select datetime2fromparts(2015,04,23,23,45,34,124,7) as ThatTime
select year(@mydate) as myYear,month(@mydate) as myMonth,day(@mydate) as myday;


select CURRENT_TIMESTAMP as rightmow
select getdate() as rigthnow
select SYSDATETIME() as rightnow
select dateadd(year,1,getdate()) as myyear
select datepart(hour,'2049-04-23 12:34:43') as myHour
select datename(weekday,getdate()) as myAnwer
select datediff(MONTH,'2021-05-22',getdate())



declare @myDateoffset as datetimeoffset(2) ='2015-06-25 01:02:03.456 +05:30'
select @myDateoffset as MyDateOffset
declare @mydate1 as datetime2='2015-06-25 01:02:03.456'
select TODATETIMEOFFSET(@mydate1,'+05:30') as MyDateffset
select DATETIME2FROMPARTS(2015,06,23,12,4,34,456,3)
select DATETIMEOFFSETFROMPARTS(2015,06,23,12,4,34,456,5,30,3)
select SYSDATETIMEoffset() as TimeNowWithOffset
select SYSUTCDATETIME() as TimeNowUTC
select SWITCHOFFSET(GETDATE(),'+05:30')


declare @myDate3 as datetime='2015-06-25 01:02:03.345'
select 'Then Time and date is'+convert(nvarchar(20),@mydate3) as MyconvertedDate
declare @myDate4 as datetime='2015-06-25 01:02:03.345'
select cast(@myDate4 as nvarchar(20))
select parse('Thursday, 25 June 2015' as date)
select format(cast('2015-06-25 01:02:05.456' as datetime),'D') as MyformattedLongDate
select format(cast('2015-06-25 01:02:05.456' as datetime),'d') as MyformattedLongDate
select format(cast('2015-06-25 01:02:05.456' as datetime),'dd-mm-yyyy') as MyformattedLongDate


create table tblEmployee(
EmployeeNumber int not null,
EmployeeFirstName varchar(50) not null,
EmployeeMiddilName varchar(50) null,
EmployeeLastName varchar(50) not null
,
EmployeeGovernmentID char(10) null,
DateOfBirth Date not null)

exec sp_help 'dbo.tblEmployee'
select * from INFORMATION_SCHEMA.tables
select  * from INFORMATION_SCHEMA.COLUMNS
where TABLE_NAME='tblEmployee'

alter table tblEmployee
add Department varchar(20)
alter table tblEmployee
alter column department varchar(23)

select * from tblEmployee
where EmployeeLastName>='Word'
--delete from tblEmployee
select * from tblEmployee
where EmployeeLastName like 'w%'
select * from tblEmployee
where EmployeeLastName like '%w%'
select * from tblEmployee
where EmployeeLastName like '[r-t]%'
select * from tblEmployee
where EmployeeLastName like '[^r-t]%'
select * from tblEmployee
where EmployeeLastName like '[%]%'


select * from tblEmployee
where not EmployeeNumber>200
select * from tblEmployee
where EmployeeNumber between 200 and 209
select * from tblEmployee
where EmployeeNumber not between 200 and 209
select * from tblEmployee
where EmployeeNumber in(200,204,208)



use Learning
--select from where group having order 
exec sp_rename 'dbo.tblEmployee.EmployeeMiddilName', 'EmployeeMiddleName','column'
update tblEmployee
set EmployeeMiddleName=null
where EmployeeMiddleName=''
select * from tblEmployee
----
create procedure spGetEmployees
as begin
select EmployeeFirstName,EmployeeLastName from tblEmployee
end
---
spGetEmployees
---
exec spGetEmployees
execute spGetEmployees
--
create proc spGetEmployeesByDateOfBirthAndDepartment 
@DateOfBirth date,
@Department nvarchar(20)
as begin
select * from tblEmployee
where DateOfBirth>@DateOfBirth and Department=@Department
end
---
exec spGetEmployeesByDateOfBirthAndDepartment '1955-03-23','HR'
--
sp_helptext spGetEmployeesByDateofBirthAndDepartment
--
alter proc spGetEmployeesByDateOfBirthAndDepartment   
@DateOfBirth date,  
@Department nvarchar(20)  
with encryption 
as begin  
select * from tblEmployee  
where DateOfBirth>@DateOfBirth and Department=@Department  
order by EmployeeFirstName
end  
----
drop proc spGetEmployees
--
select Datename(month,DateOfBirth) as MonthName,count(*) as countOfEmployeesInMonth, 
count(EmployeeMiddleName),count(*)-count(EmployeeMiddleName) as NoMiddleNames,
format(min(DateOfBirth),'dd-MM-yy') as LatestDateOfBirth,format(max(DateOfBirth),'D') as EarliestDateOfBirth
from tblEmployee
group by Datename(month,DateOfBirth), Datepart(month,DateOfBirth)
order by Datepart(month,DateOfBirth)
--
create table tblTransaction
(
Amount smallmoney not null,
DateOfTransaction smalldatetime null,
EmployeeNumber int not null)
--
select * from tblTransaction
--
select * from tblEmployee
join tblTransaction 
on tblEmployee.EmployeeNumber=tblTransaction.EmployeeNumber
--
select tblEmployee.EmployeeNumber,EmployeeFirstName,EmployeeLastName,sum(Amount) from tblEmployee
join tblTransaction 
on tblEmployee.EmployeeNumber=tblTransaction.EmployeeNumber
group by tblEmployee.EmployeeNumber,EmployeeFirstName,EmployeeLastName
order by EmployeeNumber
use learning
---
alter table tblTransaction
add DateOfEntry datetime

alter table tblTransaction
add constraint defDateOfEntry Default GetDate() for dateofEntry;

select * from tblTransaction
if exists(select * from  sys.views where name='ViewByDepartment')
drop view ViewByDepartment
go
create view [dbo].[ViewByDepartment] as
select D.department,T.employeeNumber,T.dateofTransaction,T.Amount as TotalAmount
from Department as D
left join tblEmployee E
on D.Department=E.Department
left join tblTransaction as T
on T.EmployeeNumber=E.EmployeeNumber
GO

ALTER view [dbo].[ViewByDepartment] as
select D.department,T.employeeNumber,T.dateofTransaction,T.Amount as TotalAmount
from Department as D
left join tblEmployee E
on D.Department=E.Department
left join tblTransaction as T
on T.EmployeeNumber=E.EmployeeNumber
GO
drop view dbo.ViewByDepartment


drop view dbo.ViewByDepartment

select * from sys.views
select * from INFORMATION_SCHEMA.views
select * from sys.tables
select * from INFORMATION_SCHEMA.tables
select * from sys.objects
--definition of view
select * from sys.syscomments

select V.name,S.text from sys.syscomments S
join sys.views V on V.object_id=S.id

select OBJECT_DEFINITION(object_id('dbo.ViewByDepartment'))
select* from  sys.sql_modules

begin tran

insert into Viewbydepartment(department,Employeenumber,dateoftransaction,totalamount)
values('customer relations',132,'2015-07-07',998.99)
select * from viewbydepartment 
where employeenumber='132'
select * from tbltransaction where EmployeeNumber=132
rollback tran
use Learning

begin tran

 
select * from viewbydepartment order by department,employeenumber
update

select * from tbltransaction where EmployeeNumber=132
rollback tran


--------------------
use learning
select * from tblTransaction;

create view ViewSimple
as 
select * from tblTransaction
go
begin tran
delete from ViewSimple
where EmployeeNumber=658
select * from ViewSimple
Rollback tran
------------------------
if exists(select * from INFORMATION_SCHEMA.VIEWS
where TABLE_NAME='viewByDepartment' and TABLE_SCHEMA='dbo')
 drop view dbo.viewByDepartment

create view [dbo].[ViewByDepartment] with schemabinding as
select D.Department, T.EmployeeNumber, T.DateofTransaction, T.Amount as TotalAmount
from dbo.department as D
join dbo.tblEmployee as E
on d.department=E.Department
join dbo.tblTransaction as T
on T.EmployeeNumber=E.EmployeeNumber
where T.EmployeeNumber between 120 and 139
go

create unique clustered index inx_viewByDepartment on dbo.viewByDepartment(EmployeeNumber,Department,dateofTransaction)

begin tran
delete tblEmployee
rollback tran
--------------------------------

CREATE TRIGGER tr_tbldepartment
    ON [dbo].department
    after DELETE, INSERT, UPDATE
    AS
    BEGIN
   -- SET NOCOUNT ON
	select * from Inserted
	select *  from Deleted
    END
go
CREATE TRIGGER tr_tblTransaction
    ON [dbo].tblTransaction
    after DELETE, INSERT, UPDATE
    AS
    BEGIN
   -- SET NOCOUNT ON
	select * from Inserted
	select *  from Deleted
    END
go
begin tran
insert into tblTransaction (Amount,DateOfTransaction,EmployeeNumber)
values(123,2015-07-10,123)
rollback tran
go
select * from tblTransaction
set nocount on
select * from dbo.Department
set nocount off


------------------------------
use Learning
--nested triggers
alter trigger tr_tbltransaction
on tblTransaction
after delete,insert, update
as begin
  if @@nestlevel =1
   begin
      select *,'Inserted' from Inserted
      select *,'deleted' from Deleted
	end
End
Go

begin tran
insert into tblTransaction (Amount,DateOfTransaction,EmployeeNumber)
values(123,2015-07-10,123)
rollback tran
go

begin tran
select * from ViewByDepartment where TotalAmount=-2.77 and EmployeeNumber=132
delete from ViewByDepartment
where TotalAmount=-2.77 and EmployeeNumber=132
select * from ViewByDepartment where TotalAmount=-2.77 and EmployeeNumber=132
rollback tran
-------------------------------
--update functions
alter trigger tr_tbltransaction
on tblTransaction
after delete,insert, update
as begin
      --if @@ROWCOUNT>0
	  --if UPDATE(dateoftransaction)
	  if COLUMNS_UPDATED()&2=2
	  begin
      select *,'Inserted-tblTransaction' from Inserted
      select *,'deleted-tblTransaction' from Deleted
	  end
	
End
Go

insert into tbltransaction (Amount,DateOfTransaction,EmployeeNumber)
values(123,'2015-07-11',123)

update tblTransaction
set EmployeeNumber=124
where amount=123 and DateOfTransaction='2015-07-11' and EmployeeNumber=123

begin tran
insert into tblTransaction (Amount,DateOfTransaction,EmployeeNumber)
values(123,2015-07-10,123)
rollback tran
go


begin tran

delete from ViewByDepartment
where TotalAmount=-2.77 and EmployeeNumber=132

rollback tran

-----------------
--handline multiple rows in a session
alter trigger tr_viewByDepartment
on dbo.viewByDepartment
instead of delete
as begin
  select *,'To Be Deleted' from deleted
  declare @EmployeeNumber as int
  declare @DateOfTransaction as smalldatetime
  declare @Amount as smallmoney
  select @EmployeeNumber=employeeNumber,@DateOfTransaction=dateofTransaction, @Amount=TotalAmount
  from deleted
  delete tblTransaction
   from tblTransaction as T
   where T.EmployeeNumber=@EmployeeNumber
   and T.DateOfTransaction=@DateOfTransaction
   and T.Amount=@Amount
end
go
alter trigger tr_viewByDepartment
on dbo.viewByDepartment
instead of delete
as begin
  select *,'To be Deleted' from deleted
  delete tblTransaction
  from tbltransaction  as T
  join deleted as D
  on T.EmployeeNumber=D.EmployeeNumber
  and T.DateofTransaction=D.DateOfTransaction
  and T.Amount=D.TotalAmount
end
go

begin tran
select *, 'Before Delete' From ViewByDepartment where EmployeeNumber=132
delete from ViewByDepartment
where EmployeeNumber=132 --and TotalAmount =861.16
select *, 'After Delete' From ViewByDepartment where EmployeeNumber=132
rollback tran
----------------------------
--union
select convert(char(5),'hi')
union
select convert(char(11),'hi there')

select 6
union 
select '5'

select '5'
union
select 'hi there'

select 5
union
select 'hemanth'

------------------------------
use learning
select * from tblTransaction
--union all,except , intersect
select *, row_number() over(order by(select null))%3 as shouldIdelete
into tblTransactionNew
from tblTransaction


delete from tblTransactionnew
where shouldIdelete=1

update tblTransactionNew
set DateOfTransaction= dateadd(day,1,DateOfTransaction)
where shouldIdelete=2

alter table tblTransactionnew
drop column shouldIdelete

select * from tblTransaction--2506
union all
select * from tblTransactionNew--1670--836


select * from tblTransaction--2506
except
select * from tblTransactionNew--1670--836


select * from tblTransaction--2506
intersect
select * from tblTransactionNew--1670--836 changed-835 unchanged

---------
--case
declare @myOption as varchar(10) ='Option B'

select case when @myOption='Option A' then 'First Option'
            when @myOption='Option B' then 'Second Option'
			else 'No Option'
			End as myOptions

--case
declare @myOption as varchar(10) ='Option B'
select case @myOption when 'Option A' then 'First Option'
            when 'Option B' then 'Second Option'
			else 'No Option'
			End as myOptions

select *,
      case left(EmployeeGovernmentId,1) when'A' then 'Letter A'
	  when 'B' then 'Letter B'
	  else 'Neither Letter'
	  
	   end
from tblEmployee


---------------
--isnull
--isnull can create a non nullable column
--but iscoalesce always creae nullable column
--isnull can have multiple data types

declare @myOption as varchar(10)='Option A'
select isnull(@myOption,'No Option') as MyOptions
go

declare @myFirstOption as varchar(10)-- ='Option A'
declare @mySecondOption as varchar(10)='Options B'

select coalesce(@myFirstOption,@mySecondOption,'No Option') as MyOptions

select isnull('ABC',1) as MyAnswer
select coalesce('ABC',1) as MyOtherAnswer--it doesn't work

use learning
create table tblExample
(myOption nvarchar(10) null)
go
insert into tblExample (myOption)
values('Option A')

select coalesce(myOption,'No option') as MyOptions
into tblIsCoalesce
from tblExample
go

select isnull(myOption, 'No Option') as MyOptions
into tblIsNull
from tblExample
go

--------------------
--merge
alter table [dbo].[tblTransaction2]
add comments varchar(20) null

begin tran
merge into tblTransaction2 as T
using (select employeeNumber,DateofTransaction, sum(amount) as amount from tblTransactionnew
group by EmployeeNumber,DateOfTransaction) as S
on T.EmployeeNumber=S.EmployeeNumber and T.dateofTransaction=S.dateoftransaction
when matched then 
    update set amount=T.amount+s.amount,comments='updated'
when not matched by target then
    insert([Amount],[DateOfTransaction],[EmployeeNumber],comments)
	values(s.amount,s.dateoftransaction,s.EmployeeNumber,'added new Row')
when not matched by source then
update set comments='unchanged'
output inserted.*,deleted.*,$action;
--select * from [dbo].[tblTransaction2];
 rollback tran
disable trigger [tr_tblTransaction] on [dbo].[tblTransaction] ;
use learning
select employeeNumber,DateofTransaction, count(*) from tblTransaction2
group by EmployeeNumber,DateOfTransaction
having count(*)>1

select employeeNumber,DateofTransaction from tblTransaction2
------------------------------------------------------------------------
--views
create view vw_Employee as
select employeeNumber,EmployeeFirstName,EmployeeLastname from tblemployee


-------------------------
--procudures
create proc nameEmployees as
begin
    select employeeNumber,EmployeeFirstName,EmployeeLastname
	from tblemployee
end

exec nameEmployees
execute nameemployees
nameemployees



if exists(select * from sys.procedures where name='nameEmployees')
if object_ID('nameemployees','P') is not null
drop  proc nameEmployees
go
create proc nameEmployees(@EmployeeNumber int) as
begin
   if exists (select * from tblemployee where EmployeeNumber=@EmployeeNumber)
   begin 
        select employeeNumber,EmployeeFirstName,EmployeeLastname
	    from tblemployee
	     where EmployeeNumber=@EmployeeNumber
   end
end
go
nameemployees 4
exec nameEmployees 223
execute nameemployees 323








if exists(select * from sys.procedures where name='nameEmployees')
if object_ID('nameemployees','P') is not null
drop  proc nameEmployees
go
create proc nameEmployees(@EmployeeNumber int) as
begin
   if exists (select * from tblemployee where EmployeeNumber=@EmployeeNumber)
   begin 
       if @EmployeeNumber<300
	     begin
             select employeeNumber,EmployeeFirstName,EmployeeLastname
	         from tblemployee
	         where EmployeeNumber=@EmployeeNumber

          end
		else
		  begin
		      select employeeNumber,EmployeeFirstName,EmployeeLastname,department
	          from tblemployee
	          where EmployeeNumber=@EmployeeNumber
			  select * from tblTransaction where EmployeeNumber=@EmployeeNumber
		  end
	end
		    
end
go
nameemployees 4
exec nameEmployees 223
execute nameemployees 324





if object_ID('nameemployees','P') is not null
drop  proc nameEmployees
go
create proc nameEmployees(@EmployeeNumberFrom int,@EmployeeNumberTo int) as
begin
   if exists (select * from tblemployee where EmployeeNumber between @EmployeeNumberfrom and @EmployeeNumberTo)
   begin 
        select employeeNumber,EmployeeFirstName,EmployeeLastname
	    from tblemployee
	     where EmployeeNumber between @EmployeeNumberFrom and @EmployeeNumberTo
   end
end
go




-----------------------------
--while

if object_ID('nameemployees','P') is not null
drop  proc nameEmployees
go
create proc nameEmployees(@EmployeeNumberFrom int,@EmployeeNumberTo int) as
begin
   if exists (select * from tblemployee where EmployeeNumber between @EmployeeNumberfrom and @EmployeeNumberTo)
   begin 
        declare @EmployeeNumber int=@EmployeeNumberFrom
		while @EmployeeNumber<=@EmployeeNumberTO
		  begin
		       select employeeNumber,EmployeeFirstName,EmployeeLastname
	           from tblemployee
	           where EmployeeNumber =@EmployeeNumber
			   set @EmployeeNumber=@EmployeeNumber+1
		  end

   end
end
go
use Learning
select * from tblEmployee
execute nameemployees 324 ,500

-------------------
--return


if object_ID('nameemployees','P') is not null
drop  proc nameEmployees
go
create proc nameEmployees(@EmployeeNumberFrom int,@EmployeeNumberTo int,@NumberOfRows int output) as
begin
   if exists (select * from tblemployee where EmployeeNumber between @EmployeeNumberfrom and @EmployeeNumberTo)
   begin 
        select employeeNumber,EmployeeFirstName,EmployeeLastname
	    from tblemployee
	     where EmployeeNumber between @EmployeeNumberFrom and @EmployeeNumberTo
		 set @NumberOfRows=@@ROWCOUNT
		 return 0
   end
   else
     begin
	  set @NumberOfRows=0
	   return 1
	  end
end
go
declare @NumberRows int,@Returnvalue int;
execute @Returnvalue= nameemployees 324 ,500,@NumberRows output
select @NumberRows,@Returnvalue
go
go
declare @NumberRows int,@Returnvalue int;
execute @Returnvalue= nameemployees 3 ,4,@NumberRows output
select @NumberRows,@Returnvalue
go

select * from dbo.department
sdjsdlhvb