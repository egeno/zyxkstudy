package test;

import org.apache.commons.lang.StringUtils;

public class Test2 {

	public static void main(String[] args) {
		
//String temp="&openid=oETX71czkbqkWZhjXlXfyAINPF7M&mpid=gh_8723d8894bff&tenantcode=66";
//String url	="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx45fd69a77bf56087&redirect_uri=http://liyang.s1.natapp.cc/hbweixin/xjk/html/micromall/orderdetails.jsp?orderid=121@@&response_type=code&scope=snsapi_base&state=gh_8723d8894bff#wechat_redirect";
//
//url=url.replace("@@", temp);
//System.out.println(url);
		
//Integer.valueOf("1.2");
//System.out.println(Integer.valueOf("1.2"));
		
		System.out.println(StringUtils.isNumeric("1.5"));
		
		
	}

}


/*


if not exists (select * from sysobjects where name = 'PlatformOperateLog' and OBJECTPROPERTY(id, N'IsTable') = 1)
begin
CREATE TABLE [dbo].[PlatformOperateLog](
	[LogId] [int] IDENTITY(1,1) NOT NULL,
	[OperateUser] [int] NOT NULL,
	[IP] [varchar](16) NOT NULL,
	[LogTime] [datetime] NOT NULL,
	[LogContent] [nvarchar](2048) NOT NULL,
	[OptType] [varchar](20) NOT NULL,
 CONSTRAINT [PK_PlatformOperateLog] PRIMARY KEY CLUSTERED 
(
	[LogId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作用户, TenantCode不为0时引用Users表中的 UserID,为0时引用SysUser中的ID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLog', @level2type=N'COLUMN',@level2name=N'OperateUser'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IP地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLog', @level2type=N'COLUMN',@level2name=N'IP'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLog', @level2type=N'COLUMN',@level2name=N'LogTime'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLog', @level2type=N'COLUMN',@level2name=N'LogContent'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLog', @level2type=N'COLUMN',@level2name=N'OptType'
end
GO

if not exists (select * from sysobjects where name = 'PlatformOperateLogHistory' and OBJECTPROPERTY(id, N'IsTable') = 1)
begin
CREATE TABLE [dbo].[PlatformOperateLogHistory](
	[LogId] [int] IDENTITY(1,1) NOT NULL,
	[OperateUser] [int] NOT NULL,
	[OperateName] [nvarchar](32) NOT NULL,
	[IP] [varchar](16) NOT NULL,
	[LogTime] [datetime] NOT NULL,
	[LogContent] [nvarchar](2048) NOT NULL,
	[OptType] [varchar](20) NOT NULL,
 CONSTRAINT [PK_PlatformOperateLogHistory] PRIMARY KEY CLUSTERED 
(
	[LogId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]


EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作用户,引用SysUser中的SysUserID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLogHistory', @level2type=N'COLUMN',@level2name=N'OperateUser'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作用户姓名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLogHistory', @level2type=N'COLUMN',@level2name=N'OperateName'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IP地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLogHistory', @level2type=N'COLUMN',@level2name=N'IP'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLogHistory', @level2type=N'COLUMN',@level2name=N'LogTime'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLogHistory', @level2type=N'COLUMN',@level2name=N'LogContent'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'PlatformOperateLogHistory', @level2type=N'COLUMN',@level2name=N'OptType'
end
GO

if not exists (select * from sysobjects where name = 'TenantOperateLog' and OBJECTPROPERTY(id, N'IsTable') = 1)
begin
CREATE TABLE [dbo].[TenantOperateLog](
	[LogId] [int] IDENTITY(1,1) NOT NULL,
	[TenantCode] [int] NOT NULL,
	[TenantName] [nvarchar](32) NOT NULL,
	[OperateUser] [int] NOT NULL,
	[OperateUserType] [tinyint] NULL,
	[OperateUserName] [nvarchar](32) NOT NULL,
	[IP] [varchar](16) NOT NULL,
	[LogTime] [datetime] NOT NULL,
	[LogContent] [nvarchar](1024) NOT NULL,
	[OptType] [varchar](20) NOT NULL,
 CONSTRAINT [PK_TENANTOPERATELOG] PRIMARY KEY CLUSTERED 
(
	[LogId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]


EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'??id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'LogId'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????,??Tenant?TenantCode' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'TenantCode'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????(????)' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'TenantName'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????,??Users??? UserID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'OperateUser'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'1??2??3??4??' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'OperateUserType'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'???,???' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'OperateUserName'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'ip??' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'IP'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'LogTime'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'LogContent'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????,??????tenantotptype' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog', @level2type=N'COLUMN',@level2name=N'OptType'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLog'
end
GO

if not exists (select * from sysobjects where name = 'TenantOperateLogHistory' and OBJECTPROPERTY(id, N'IsTable') = 1)
begin
CREATE TABLE [dbo].[TenantOperateLogHistory](
	[LogId] [int] IDENTITY(1,1) NOT NULL,
	[TenantCode] [int] NOT NULL,
	[TenantName] [nvarchar](32) NOT NULL,
	[OperateUser] [int] NOT NULL,
	[OperateName] [nvarchar](32) NOT NULL,
	[IP] [varchar](16) NOT NULL,
	[LogTime] [datetime] NOT NULL,
	[LogContent] [nvarchar](1024) NOT NULL,
	[OptType] [varchar](20) NOT NULL,
 CONSTRAINT [PK_TenantOperateLogHistory] PRIMARY KEY CLUSTERED 
(
	[LogId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'租户编号,引用Tenant中TenantCode' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'TenantCode'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'租户名称' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'TenantName'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作用户,引用Users中的UserID' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'OperateUser'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作用户姓名' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'OperateName'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'IP地址' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'IP'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志时间' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'LogTime'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'日志内容' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'LogContent'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'操作类型' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'TenantOperateLogHistory', @level2type=N'COLUMN',@level2name=N'OptType'
end
GO

if not exists (select * from sysobjects where name = 'ELMAH_ErrorHistory' and OBJECTPROPERTY(id, N'IsTable') = 1)
begin
CREATE TABLE [dbo].[ELMAH_ErrorHistory](
	[ErrorId] [uniqueidentifier] NOT NULL,
	[Application] [nvarchar](60) NOT NULL,
	[Host] [nvarchar](50) NOT NULL,
	[Type] [nvarchar](100) NOT NULL,
	[Source] [nvarchar](60) NOT NULL,
	[Message] [nvarchar](500) NOT NULL,
	[User] [nvarchar](50) NOT NULL,
	[StatusCode] [int] NOT NULL,
	[TimeUtc] [datetime] NOT NULL,
	[Sequence] [int] IDENTITY(1,1) NOT NULL,
	[AllXml] [ntext] NOT NULL,
 CONSTRAINT [PK_ELMAH_ERROR] PRIMARY KEY CLUSTERED 
(
	[ErrorId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]


EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'??id' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'ErrorId'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'Application'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'??' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'Host'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'Type'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'Source'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'Message'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'User'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'?????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'StatusCode'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'TimeUtc'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'Sequence'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????XMl??' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory', @level2type=N'COLUMN',@level2name=N'AllXml'
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'????????' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'ELMAH_ErrorHistory'
end
GO

if not exists (select * from sysobjects where name = 'ELMAH_Error' and OBJECTPROPERTY(id, N'IsTable') = 1)
begin
CREATE TABLE [dbo].[ELMAH_Error](
	[ErrorId] [uniqueidentifier] NOT NULL,
	[Application] [nvarchar](60) NOT NULL,
	[Host] [nvarchar](50) NOT NULL,
	[Type] [nvarchar](100) NOT NULL,
	[Source] [nvarchar](60) NOT NULL,
	[Message] [nvarchar](500) NOT NULL,
	[User] [nvarchar](50) NOT NULL,
	[StatusCode] [int] NOT NULL,
	[TimeUtc] [datetime] NOT NULL,
	[Sequence] [int] IDENTITY(1,1) NOT NULL,
	[AllXml] [ntext] NOT NULL,
 CONSTRAINT [PK_ELMAH_ERRORNew] PRIMARY KEY CLUSTERED 
(
	[ErrorId] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
end
GO


if not exists(select 1 from syscolumns where id=object_id('TenantOperateLog') and name='OptType')
begin
alter table TenantOperateLog add OptType varchar(128);
EXECUTE sp_addextendedproperty @name = N'MS_Description', @value = '操作类型', @level0type = N'SCHEMA', @level0name = N'dbo', @level1type = N'TABLE', @level1name = N'TenantOperateLog', @level2type = N'COLUMN', @level2name = N'OptType';
end
else
begin
alter table TenantOperateLog alter column OptType varchar(128);
end
Go

if not exists(select 1 from syscolumns where id=object_id('TenantOperateLog') and name='TenantName')
begin
alter table TenantOperateLog add TenantName nvarchar(32);
EXECUTE sp_addextendedproperty @name = N'MS_Description', @value = '租户名称', @level0type = N'SCHEMA', @level0name = N'dbo', @level1type = N'TABLE', @level1name = N'TenantOperateLog', @level2type = N'COLUMN', @level2name = N'TenantName';
end
else
begin
alter table TenantOperateLog alter column TenantName nvarchar(32);
end
Go

if not exists(select 1 from syscolumns where id=object_id('TenantOperateLog') and name='Source')
begin
alter table TenantOperateLog add Source int;
EXECUTE sp_addextendedproperty @name = N'MS_Description', @value = '来源', @level0type = N'SCHEMA', @level0name = N'dbo', @level1type = N'TABLE', @level1name = N'TenantOperateLog', @level2type = N'COLUMN', @level2name = N'Source';
end
else
begin
alter table TenantOperateLog alter column [Source] int;
end
Go

if not exists(select 1 from syscolumns where id=object_id('TenantOperateLog') and name='relationid')
begin
alter table TenantOperateLog add relationid int;
EXECUTE sp_addextendedproperty @name = N'MS_Description', @value = '关联ID', @level0type = N'SCHEMA', @level0name = N'dbo', @level1type = N'TABLE', @level1name = N'TenantOperateLog', @level2type = N'COLUMN', @level2name = N'relationid';
end
else
begin
alter table TenantOperateLog alter column relationid int;
end
Go

if not exists(select 1 from syscolumns where id=object_id('TenantOperateLog') and name='userType')
begin
alter table TenantOperateLog add userType tinyint;
EXECUTE sp_addextendedproperty @name = N'MS_Description', @value = '用户类型', @level0type = N'SCHEMA', @level0name = N'dbo', @level1type = N'TABLE', @level1name = N'TenantOperateLog', @level2type = N'COLUMN', @level2name = N'userType';
end
else
begin
alter table TenantOperateLog alter column userType tinyint;
end
Go

if not exists(select 1 from syscolumns where id=object_id('TenantOperateLog') and name='OperateUserType')
begin
alter table TenantOperateLog add OperateUserType tinyint;
EXECUTE sp_addextendedproperty @name = N'MS_Description', @value = '操作用户类型', @level0type = N'SCHEMA', @level0name = N'dbo', @level1type = N'TABLE', @level1name = N'TenantOperateLog', @level2type = N'COLUMN', @level2name = N'OperateUserType';
end
else
begin
alter table TenantOperateLog alter column OperateUserType tinyint null;
end
Go

if exists(select 1 from syscolumns where id=object_id('TenantOperateLog') and name='LogContent')
alter table TenantOperateLog alter column LogContent nvarchar(max)
Go
 */