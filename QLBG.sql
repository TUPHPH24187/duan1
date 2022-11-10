create database QLBG
go
use QLBG
go




create table KhachHang (
	MaKH int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenKH nvarchar(50) ,
	NgaySinh nchar(10) ,
	GioiTinh Smallint ,
	SoDienThoai nvarchar(15) ,
	DiaChi nvarchar(200) ,
	TrangThai Smallint ,
	

)

create table ChucVu (
	MaCV int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenCV nvarchar(50) ,	
	
)


create table NhanVien (
	MaNV int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenNV nvarchar(50),
	NgaySinh nchar(10),
	GioiTinh Smallint ,
	SoDienThoai nvarchar(15),
	DiaChi nvarchar(200) ,
	Email nvarchar(50) ,	
	MatKhau nchar(16) ,
	TrangThai Smallint ,
	
	MaCV int null foreign key references ChucVu(MaCV),
)



create table XuatXu (
	MaXuatXu int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenXuatXu varchar(50),
	
)
create table KichThuoc (
	MaKichThuoc int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenKichThuoc varchar(50),
	
)

create table ChatLieu (
	MaChatLieu int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenChatLieu varchar(50),
)


create table ChiTietSanPham (
	MaCTSP int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenCTSP nvarchar(50),
	MaChatLieu int null foreign key references ChatLieu(MaChatLieu),
	MaXuatXu int null foreign key references XuatXu(MaXuatXu),
	MaKichThuoc int null foreign key references KichThuoc(MaKichThuoc),
	SoLuong int ,
	Gia decimal ,
	GiamGia decimal ,
	TrangThai Smallint ,
)

create table KhuyenMai (
	MaKhuyenMai int IDENTITY(1,1) not null PRIMARY KEY,
	TenKhuyenMai varchar(30) ,
	NgayBatDau date,
	NgayKetThuc date,
	GiamGia int,
	TrangThai Smallint ,
	MaCTSP int null foreign key references ChiTietSanPham(MaCTSP),
)




create table HinhThucThanhToan (
	MaHTTT int IDENTITY(1,1) not null PRIMARY KEY,
	TenHTTT varchar(50),
	
)

create table HoaDon (
	MaHD int IDENTITY(1,1) not null PRIMARY KEY,
	MaKH int null foreign key references KhachHang(MaKH),
	MaNV int null foreign key references NhanVien(MaNV),
	MaHTTT int null foreign key references HinhThucThanhToan(MaHTTT),
	NgayKhoiTao date ,
	TienShip decimal,
	GhiChu text ,
	TrangThai Smallint ,

	
)



create table HoaDonChiTiet (
	MaHDCT int IDENTITY(1,1) not null PRIMARY KEY,
	MaHD int null foreign key references HoaDon(MaHD),
	MaCTSP int null foreign key references ChiTietSanPham(MaCTSP),
	SoLuong int not null,
	Gia decimal not null,
	GiamGia decimal not null,
	ThanhTien decimal not null,
	GhiChu text,
	TrangThai Smallint ,

)




