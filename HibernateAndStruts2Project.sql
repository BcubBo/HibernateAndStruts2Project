drop table EDOC_CATEGORY;
drop table EDOC_ENTRY;

create table EDOC_CATEGORY (

    id number(10),
    name varchar2(10) not null

);
create table EDOC_ENTRY(
    id number(10),
    categoryid number(10) not null,
    title varchar2(100) not null,
    summary varchar(255),
    uploaduser varchar(50),
    createdate date not null
);
--alter table HOUSE_PICTURE
 -- add constraint HOUSE_PICTURE_REF_HOUSE foreign key (HOUSE_ID)
  --references HOUSE (ID);
alter table EDOC_CATEGORY add constraint  EDOC_CATEGORY_PRI primary key(ID);
alter table EDOC_ENTRY add constraint EDOC_ENTRY_FOR foreign key(CATEGORYID) references EDOC_CATEGORY(ID);
alter table EDOC_ENTRY add constraint EDOC_ENTRY_PRI primary key(ID);
commit;
create sequence EDOC_ENTRY_SEQ;
create sequence EDOC_CATE_SEQ;
commit;
insert into EDOC_CATEGORY values( 1,'IT技术');
insert into EDOC_CATEGORY values( 2,'其他');
commit;

   COMMENT ON COLUMN "EDOC_ENTRY"."ID" IS '编号';
 
   COMMENT ON COLUMN "EDOC_ENTRY"."CATEGORYID" IS '分类编号';
 
   COMMENT ON COLUMN "EDOC_ENTRY"."TITLE" IS '标题';
 
   COMMENT ON COLUMN "EDOC_ENTRY"."SUMMARY" IS '摘要';
 
   COMMENT ON COLUMN "EDOC_ENTRY"."UPLOADUSER" IS '上传人';
 
   COMMENT ON COLUMN "EDOC_ENTRY"."CREATEDATE" IS '创建时间';
Insert into EDOC_ENTRY (ID,CATEGORYID,TITLE,SUMMARY,UPLOADUSER,CREATEDATE) values (1001,1,'JAVA','java语言','BcubBo',to_date('14-8月 -17','DD-MON-RR'));
Insert into EDOC_ENTRY (ID,CATEGORYID,TITLE,SUMMARY,UPLOADUSER,CREATEDATE) values (1002,2,'XML','xml语言','BcubBo',to_date('14-8月 -17','DD-MON-RR'));
Insert into EDOC_ENTRY (ID,CATEGORYID,TITLE,SUMMARY,UPLOADUSER,CREATEDATE) values (1003,1,'C++','c++语言','BcubBo',to_date('14-8月 -17','DD-MON-RR'));
Insert into EDOC_ENTRY (ID,CATEGORYID,TITLE,SUMMARY,UPLOADUSER,CREATEDATE) values (1004,1,'C#','c#语言','BcubBo',to_date('14-8月 -17','DD-MON-RR'));
Insert into EDOC_ENTRY (ID,CATEGORYID,TITLE,SUMMARY,UPLOADUSER,CREATEDATE) values (1005,2,'HTML','html语言','BcubBo',to_date('14-8月 -17','DD-MON-RR'));
Insert into EDOC_ENTRY (ID,CATEGORYID,TITLE,SUMMARY,UPLOADUSER,CREATEDATE) values (1012,2,'测试','测试','测试',to_date('15-8月 -17','DD-MON-RR'));
commit;