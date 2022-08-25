CREATE TABLE testMember (
	memberId varchar2(10) not null,
	memberPw varchar2(10) not null
);

insert into testMember values ('plitche', '1234');


select *
from testMember


		select memberId
		from testMember
		where memberId = 'plitche'
		and memberPw = '1234'
