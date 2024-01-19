--------------------------------------------------------
--  已建立檔案 - 星期五-1月-19-2024   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table LIBRARY_BOOK
--------------------------------------------------------

  CREATE TABLE "STUDENT"."LIBRARY_BOOK" 
   (	"ISBN" NUMBER, 
	"NAME" VARCHAR2(50 BYTE), 
	"AUTHOR" VARCHAR2(100 BYTE), 
	"INTRODUCTION" VARCHAR2(500 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;

   COMMENT ON COLUMN "STUDENT"."LIBRARY_BOOK"."ISBN" IS '國際標準書號';
   COMMENT ON COLUMN "STUDENT"."LIBRARY_BOOK"."NAME" IS '書名';
   COMMENT ON COLUMN "STUDENT"."LIBRARY_BOOK"."AUTHOR" IS '作者';
   COMMENT ON COLUMN "STUDENT"."LIBRARY_BOOK"."INTRODUCTION" IS '書籍內容介紹';
REM INSERTING into STUDENT.LIBRARY_BOOK
SET DEFINE OFF;
Insert into STUDENT.LIBRARY_BOOK (ISBN,NAME,AUTHOR,INTRODUCTION) values (9786267366530,'打造你要的人生','歐普拉．溫弗蕾, 亞瑟．布魯克斯','★亞馬遜書店、《紐約時報》暢銷榜★
媒體天后歐普拉和哈佛幸福學教授想對你說：
你不是只能無助地面對生活的苦；
而是能更深入了解自己的心和腦，
「刻意練習」出你想要的幸福。');
Insert into STUDENT.LIBRARY_BOOK (ISBN,NAME,AUTHOR,INTRODUCTION) values (9786263746695,'最佳狀態',' 丹尼爾．高曼, 卡利．查尼斯','經由本書的深度研究與科學實證，你將學到進入最佳狀態的實際方法──透過「情商」（EQ）。丹尼爾．高曼在1996年的開創性鉅作《EQ》中，革命性地改變了我們對情緒的看法。經過近三十年，他再度揭示如何透過情商讓我們更容易達成最佳狀態，取得高效表現。');
--------------------------------------------------------
--  DDL for Index LIBRARY_BOOK_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."LIBRARY_BOOK_PK" ON "STUDENT"."LIBRARY_BOOK" ("ISBN") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table LIBRARY_BOOK
--------------------------------------------------------

  ALTER TABLE "STUDENT"."LIBRARY_BOOK" MODIFY ("ISBN" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."LIBRARY_BOOK" ADD CONSTRAINT "LIBRARY_BOOK_PK" PRIMARY KEY ("ISBN")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
