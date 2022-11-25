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

create table NguoiDung (
	TenDangNhap  varchar(20) NOT NULL PRIMARY KEY,
	MatKhau varchar(20) NOT NULL,	
	VaiTro nvarchar(50) NOT NULL
)


create table NhanVien (
	MaNV int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenNV nvarchar(50),
	NgaySinh nchar(10),
	GioiTinh Smallint ,
	SoDienThoai nvarchar(15),
	DiaChi nvarchar(200) ,
	Email nvarchar(50) ,	
	TrangThai Smallint ,
	
	
)



create table XuatXu (
	MaXuatXu int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenXuatXu varchar(50),
	TrangThai Smallint ,
)
create table KichThuoc (
	MaKichThuoc int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenKichThuoc varchar(50),
	TrangThai Smallint ,
)

create table ChatLieu (
	MaChatLieu int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenChatLieu varchar(50),
	TrangThai Smallint ,
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
	NgayBatDau nchar(10),
	NgayKetThuc nchar(10),
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
	NgayKhoiTao varchar(20) ,
	GhiChu text ,
	TrangThai Smallint ,
)



create table HoaDonChiTiet (
	MaHDCT int IDENTITY(1,1) not null PRIMARY KEY,
	MaHD int null foreign key references HoaDon(MaHD),
	MaCTSP int foreign key references ChiTietSanPham(MaCTSP),
	SoLuong int not null,
	Gia decimal not null,
	GiamGia decimal not null,
	ThanhTien decimal not null,
	GhiChu text,
	TrangThai Smallint ,
)




