/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/2/27 14:14:16                           */
/*==============================================================*/

drop table if exists gov_user;


/*==============================================================*/
/* Table: gov_user                                              */
/*==============================================================*/
create table gov_user
(
  id                   int(32) unsigned not null auto_increment,
  login_name           varchar(64) not null comment '登录名',
  password             varchar(64) not null comment '密码',
  chinese_name         varchar(64) not null comment '中文名',
  identify_code        varchar(18) not null comment '身份证号',
  police_code          varchar(20) not null comment '警号',
  phone_number         varchar(32) comment '联系方式',
  email                varchar(64) comment '邮箱地址',
  dept_id              int(32) unsigned not null comment '外键、单位ID',
  dept_code            varchar(50) not null comment '单位代码',
  creator              int(32) unsigned not null comment '创建人',
  create_date          datetime not null comment '创建时间',
  modify_man           int(32) unsigned not null comment '修改人',
  modify_date          datetime not null comment '修改时间',
  state                bit(1) not null comment '伪删除状态（1：正常，2：删除）',
  primary key (id)
);

alter table gov_user comment '政府用户表';