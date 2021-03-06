USE [staff_manager]
GO
/****** Object:  Table [dbo].[admins]    Script Date: 4/24/2021 6:25:26 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admins](
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[departs]    Script Date: 4/24/2021 6:25:26 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[departs](
	[id] [varchar](10) NOT NULL,
	[name] [varchar](50) NULL,
	[number_staffs] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[jobs]    Script Date: 4/24/2021 6:25:26 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[jobs](
	[id] [varchar](10) NOT NULL,
	[describe] [varchar](500) NULL,
	[finish_date] [date] NULL,
	[name] [varchar](50) NULL,
	[start_date] [date] NULL,
	[depart_id] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[records]    Script Date: 4/24/2021 6:25:26 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[records](
	[id] [int] NOT NULL,
	[date] [date] NULL,
	[reason] [varchar](200) NULL,
	[type] [varchar](50) NULL,
	[staff_id] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roles]    Script Date: 4/24/2021 6:25:26 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[id] [varchar](10) NOT NULL,
	[basic_salary] [bigint] NULL,
	[name] [varchar](50) NULL,
	[salary_factor] [float] NULL,
	[sub_salary] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[salaries]    Script Date: 4/24/2021 6:25:26 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[salaries](
	[id] [varchar](10) NOT NULL,
	[salary_factor] [float] NULL,
	[staff_id] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[staffs]    Script Date: 4/24/2021 6:25:26 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[staffs](
	[id] [varchar](10) NOT NULL,
	[birthday] [date] NULL,
	[email] [varchar](100) NULL,
	[gender] [bit] NOT NULL,
	[name] [varchar](50) NULL,
	[notes] [varchar](500) NULL,
	[phone] [varchar](12) NULL,
	[photo] [varchar](500) NULL,
	[salary] [float] NULL,
	[depart_id] [varchar](10) NULL,
	[role_id] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[admins] ([username], [password]) VALUES (N'Quynh', N'116')
INSERT [dbo].[admins] ([username], [password]) VALUES (N'Tai', N'116')
INSERT [dbo].[admins] ([username], [password]) VALUES (N'Thanh', N'116')
INSERT [dbo].[admins] ([username], [password]) VALUES (N'Yen', N'116')
GO
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB01', N'Code', 100)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB02', N'Design', 200)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB03', N'Sale', 200)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB04', N'Maketing', 150)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB05', N'Kinh doanh', 300)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB06', N'Hanh chinh', 200)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB07', N'Ke toan', 100)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB09', N'Nhan su', 100)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB10', N'Cham soc khach hang', 200)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB11', N'Thue', 20)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB12', N'AI', 50)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB13', N'Nghien cuu', 30)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB14', N'Trien khai du an', 100)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB15', N'Cong tac xa hoi', 150)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB16', N'Dao tao', 200)
INSERT [dbo].[departs] ([id], [name], [number_staffs]) VALUES (N'PB17', N'Test', 80)
GO
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV01', N'Phan tich & thiet ke phan mem thanh toan dien tu Sendo', CAST(N'2020-06-05' AS Date), N'Thiet ke', CAST(N'2020-04-05' AS Date), N'PB15')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV02', N'Tao cac chuc nang co ban cua ung dung thanh toan', CAST(N'2021-05-20' AS Date), N'Lap trinh', CAST(N'2021-04-20' AS Date), N'PB01')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV03', N'Goi dien cho cac cong ty co nhu cau & gi?i thi?u', CAST(N'2021-09-10' AS Date), N'Gioi thieu san pham', CAST(N'2021-06-10' AS Date), N'PB03')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV04', N'Lien he cac dich vu quang cao cho cac san pham', CAST(N'2021-09-10' AS Date), N'Quang cao', CAST(N'2021-04-10' AS Date), N'PB04')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV05', N'Tim hieu thi truong va gia ban cac san pham tuong tu', CAST(N'2021-04-20' AS Date), N'Kinh doanh', CAST(N'2021-02-20' AS Date), N'PB05')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV06', N'Tim kiem cac nhan su moi cho phong design', CAST(N'2021-02-20' AS Date), N'Tuyen nhan su', CAST(N'2021-01-20' AS Date), N'PB09')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV07', N'Hoan tat cac thu tuc voi doi tac lien quan', CAST(N'2021-01-20' AS Date), N'Thu tuc', CAST(N'2020-12-20' AS Date), N'PB06')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV09', N'Them cac chuc nang bao mat cho ung dung', CAST(N'2021-12-10' AS Date), N'Lap trinh', CAST(N'2021-06-10' AS Date), N'PB01')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV10', N'Thiet ke giao dien cho cac chuc nang ', CAST(N'2021-08-10' AS Date), N'Thiet ke', CAST(N'2021-05-30' AS Date), N'PB02')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV11', N'Tinh doanh thu trong thang & luong nhan vien', CAST(N'2021-09-10' AS Date), N'Ke toan', CAST(N'2021-07-30' AS Date), N'PB07')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV12', N'Tim cac khach hang moi cho san pham', CAST(N'2021-11-10' AS Date), N'Ban hang', CAST(N'2021-07-30' AS Date), N'PB10')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV13', N'Training ki thuat cho nhan vien', CAST(N'2021-05-20' AS Date), N'Dao tao', CAST(N'2021-04-20' AS Date), N'PB16')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV14', N'Giao luu va gap mat sinh vien', CAST(N'2021-05-20' AS Date), N'Cong tac xa hoi', CAST(N'2021-04-20' AS Date), N'PB15')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV15', N'Phat trien du an robot tu dong ASIMA', CAST(N'2023-09-10' AS Date), N'Nghien cuu phat trien', CAST(N'2021-04-20' AS Date), N'PB13')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV16', N'Xu ly, bo sung cac hieu ung tang UI, UX cho du an', CAST(N'2021-07-18' AS Date), N'Lap trinh Frontend', CAST(N'2021-06-18' AS Date), N'PB01')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV17', N'Tinh toan tien thue cong ty', CAST(N'2022-09-10' AS Date), N'Tinh thue', CAST(N'2021-04-20' AS Date), N'PB11')
INSERT [dbo].[jobs] ([id], [describe], [finish_date], [name], [start_date], [depart_id]) VALUES (N'CV18', N'Thuc hien viet tai lieu va thiet ke du an', CAST(N'2022-09-10' AS Date), N'Trien khai du an', CAST(N'2021-05-20' AS Date), N'PB14')
GO
INSERT [dbo].[roles] ([id], [basic_salary], [name], [salary_factor], [sub_salary]) VALUES (N'R01', 100, N'Intership', NULL, 50)
INSERT [dbo].[roles] ([id], [basic_salary], [name], [salary_factor], [sub_salary]) VALUES (N'R02', 500, N'Staff', NULL, 50)
INSERT [dbo].[roles] ([id], [basic_salary], [name], [salary_factor], [sub_salary]) VALUES (N'R03', 1000, N'Manage', NULL, 50)
INSERT [dbo].[roles] ([id], [basic_salary], [name], [salary_factor], [sub_salary]) VALUES (N'R04', 2000, N'Director', NULL, 0)
INSERT [dbo].[roles] ([id], [basic_salary], [name], [salary_factor], [sub_salary]) VALUES (N'R05', 1500, N'CTO', NULL, 50)
INSERT [dbo].[roles] ([id], [basic_salary], [name], [salary_factor], [sub_salary]) VALUES (N'R06', 600, N'Secretary', NULL, 50)
GO
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S01', 1.2000000476837158, N'NV01')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S02', 1.5, N'NV02')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S03', 2, N'NV03')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S04', 1, N'NV04')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S05', 1.2999999523162842, N'NV05')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S06', 1.6000000238418579, N'NV06')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S07', 1.2000000476837158, N'NV07')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S08', 1.2000000476837158, N'NV08')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S09', 1.2999999523162842, N'NV09')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S10', 1.7999999523162842, N'NV10')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S11', 2.5, N'NV11')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S12', 1.5, N'NV12')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S13', 1.3999999761581421, N'NV13')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S14', 1.8999999761581421, N'NV14')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S15', 2, N'NV15')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S16', 1.2000000476837158, N'NV16')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S17', 3, N'NV17')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S18', 1.2000000476837158, N'NV18')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S19', 1.7000000476837158, N'NV19')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S20', 2, N'NV20')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S21', 1.5, N'NV21')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S22', 1.6000000238418579, N'NV22')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S23', 1.1000000238418579, N'NV23')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S24', 1, N'NV24')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S25', 1.6000000238418579, N'NV25')
INSERT [dbo].[salaries] ([id], [salary_factor], [staff_id]) VALUES (N'S26', 1, N'NV26')
GO
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV01', CAST(N'2000-06-10' AS Date), N'thanhquynh610@gmail.com', 0, N'Nguyen Thanh Quynh', N'Nothing', N'0366434548', N'Logo.png', 2000, N'PB01', N'R01')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV02', CAST(N'1988-06-10' AS Date), N'haiha@gmail.com', 0, N'Le Hai Ha', N'', N'0366434548', N'anh2.webp', 1000, N'PB02', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV03', CAST(N'1997-06-10' AS Date), N'hoangd@gmail.com', 1, N'Nguyen Hoang Duong', N'', N'0366434548', N'anh3.jpg', 500, N'PB09', N'R01')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV04', CAST(N'1999-06-10' AS Date), N'maiht@gmail.com', 0, N'Hoang Thi Mai', N'', N'0366434548', N'anh4.jpg', 800, N'PB03', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV05', CAST(N'1997-06-10' AS Date), N'maiha@gmail.com', 0, N'Nguyen Mai Ha', N'', N'0366434548', N'anh5.jpg', 1200, N'PB05', N'R03')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV06', CAST(N'1997-06-23' AS Date), N'longcn@gmail.com', 1, N'Chu Cong Long', N'', N'0366434548', N'anh6.png', 700, N'PB02', N'R04')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV07', CAST(N'1996-06-23' AS Date), N'thanhdat@gmail.com', 1, N'Ha Thanh Dat', N'', N'0366434548', N'anh7.jpg', 900, N'PB03', N'R01')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV08', CAST(N'1996-06-23' AS Date), N'haanh@gmail.com', 0, N'Truong Ha Anh', N'', N'0366434548', N'anh8.jpg', 1400, N'PB04', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV09', CAST(N'2000-06-23' AS Date), N'trangnthi@gmail.com', 0, N'Tran Thi Trang', N'', N'0366434548', N'anh9.jpg', 500, N'PB06', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV10', CAST(N'1995-06-23' AS Date), N'cuongnv@gmail.com', 1, N'Pham Van Cuong', N'', N'0366434548', N'anh10.jpg', 900, N'PB09', N'R03')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV11', CAST(N'1996-06-23' AS Date), N'mylinhh@gmail.com', 0, N'Le My Linh', N'', N'0366434548', N'anh11.jpg', 2100, N'PB01', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV12', CAST(N'1994-06-23' AS Date), N'lanphuong@gmail.com', 0, N'Nguyen Phuong Lan', N'', N'0366434548', N'anh12.jpg', 1100, N'PB01', N'R01')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV13', CAST(N'1999-06-10' AS Date), N'linhhh@gmail.com', 0, N'Phan Thuy Linh', N'', N'0366434548', N'anh13.jpg', 1400, N'PB02', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV14', CAST(N'1992-06-10' AS Date), N'hoangduy@gmail.com', 1, N'Duong Duy Hoang', N'', N'0366434548', N'anh14.png', 1000, N'PB02', N'R03')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV15', CAST(N'2000-06-10' AS Date), N'dungnguyen@gmail.com', 1, N'Nguyen Van Dung', N'', N'0366434548', N'anh15.jpg', 2000, N'PB01', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV16', CAST(N'1997-06-10' AS Date), N'minhhhh@gmail.com', 1, N'Le Minh Phuong', N'', N'0366434548', N'anh1.jpg', 900, N'PB05', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV17', CAST(N'1997-10-12' AS Date), N'duonghai@gmail.com', 1, N'Chu Hai Duong', N'Nothing', N'0366434548', N'anh4.jpg', 500, N'PB04', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV18', CAST(N'1997-06-10' AS Date), N'trinhtrinh@gmail.com', 0, N'Kieu Ngoc Trinh', N'', N'0366434548', N'anh3.jpg', NULL, N'PB15', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV19', CAST(N'1996-06-23' AS Date), N'duongdinh@gmail.com', 1, N'Tran Dinh Duong', N'', N'0366434548', N'anh5.jpg', NULL, N'PB12', N'R01')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV20', CAST(N'1993-06-23' AS Date), N'tranglinh@gmail.com', 0, N'Luong Thi Trang', N'', N'0366434548', N'anh6.png', NULL, N'PB02', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV21', CAST(N'2000-06-10' AS Date), N'anhngoc@gmail.com', 0, N'Nguyen Ngoc Anh', N'', N'0366434548', N'anh10.jpg', NULL, N'PB06', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV22', CAST(N'1988-06-10' AS Date), N'hieppp@gmail.com', 0, N'Nguyen Hoang Hiep', N'', N'0366434548', N'anh6.png', NULL, N'PB12', N'R05')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV23', CAST(N'1999-06-10' AS Date), N'quangson0@gmail.com', 1, N'Dao Quang Son', N'', N'0366434548', N'anh14.png', NULL, N'PB13', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV24', CAST(N'1995-06-17' AS Date), N'quangson0@gmail.com', 0, N'Truong Hinh Di', N'', N'0366434548', N'anh2.webp', NULL, N'PB03', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV25', CAST(N'1994-04-17' AS Date), N'huongha@gmail.com', 0, N'Ha Thi Huong', N'', N'0366434548', N'anh15.jpg', NULL, N'PB07', N'R05')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV26', CAST(N'2000-09-18' AS Date), N'thanhquynh@gmail.com', 1, N'Nguyen Duc Thanh', N'', N'0366434548', N'thanh.jpg', NULL, N'PB01', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV27', CAST(N'2000-03-18' AS Date), N'haiyen@gmail.com', 0, N'Nguyen Hai Yen', N'', N'0366434548', N'anh8.jpg', NULL, N'PB02', N'R02')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV28', CAST(N'2000-06-12' AS Date), N'taiii@gmail.com', 0, N'Phung The Tai', N'', N'0366434548', N'anh3.jpg', NULL, N'PB01', N'R03')
INSERT [dbo].[staffs] ([id], [birthday], [email], [gender], [name], [notes], [phone], [photo], [salary], [depart_id], [role_id]) VALUES (N'NV29', CAST(N'1997-06-10' AS Date), N'haiyen@gmail.com', 1, N'ABC', N'', N'0366434548', N'anh10.jpg', NULL, N'PB01', N'R02')
GO
ALTER TABLE [dbo].[jobs]  WITH CHECK ADD  CONSTRAINT [FKprl7ketbvushg0p1jlk3ajf0l] FOREIGN KEY([depart_id])
REFERENCES [dbo].[departs] ([id])
GO
ALTER TABLE [dbo].[jobs] CHECK CONSTRAINT [FKprl7ketbvushg0p1jlk3ajf0l]
GO
ALTER TABLE [dbo].[records]  WITH CHECK ADD  CONSTRAINT [FKh8ohht48yul18ihlwbf8em406] FOREIGN KEY([staff_id])
REFERENCES [dbo].[staffs] ([id])
GO
ALTER TABLE [dbo].[records] CHECK CONSTRAINT [FKh8ohht48yul18ihlwbf8em406]
GO
ALTER TABLE [dbo].[salaries]  WITH CHECK ADD  CONSTRAINT [FKmve8e174cp0untqiv1e4e55cx] FOREIGN KEY([staff_id])
REFERENCES [dbo].[staffs] ([id])
GO
ALTER TABLE [dbo].[salaries] CHECK CONSTRAINT [FKmve8e174cp0untqiv1e4e55cx]
GO
ALTER TABLE [dbo].[staffs]  WITH CHECK ADD  CONSTRAINT [FKboorj82ggotfu5pv3vuyo7me9] FOREIGN KEY([role_id])
REFERENCES [dbo].[roles] ([id])
GO
ALTER TABLE [dbo].[staffs] CHECK CONSTRAINT [FKboorj82ggotfu5pv3vuyo7me9]
GO
ALTER TABLE [dbo].[staffs]  WITH CHECK ADD  CONSTRAINT [FKlq1kinn71te2nigo4g4pjecvx] FOREIGN KEY([depart_id])
REFERENCES [dbo].[departs] ([id])
GO
ALTER TABLE [dbo].[staffs] CHECK CONSTRAINT [FKlq1kinn71te2nigo4g4pjecvx]
GO
