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




create table NhanVien (
	MaNV int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenNV nvarchar(50),
	NgaySinh nchar(10),
	GioiTinh Smallint ,
	SoDienThoai nvarchar(15),
	DiaChi nvarchar(200) ,
	Email nvarchar(50) ,
	MatKhau varchar(16),
	ChucVu Smallint ,
	TrangThai Smallint ,
	
)



create table XuatXu (
	MaXuatXu int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenXuatXu nvarchar(50) not null,
	TrangThai Smallint not null,
)
create table KichThuoc (
	MaKichThuoc int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenKichThuoc nvarchar(50) not null,
	TrangThai Smallint not null,
)

create table ChatLieu (
	MaChatLieu int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenChatLieu nvarchar(50),
	TrangThai Smallint ,
)


create table ChiTietSanPham (
	MaCTSP int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	TenCTSP nvarchar(50) not null,
	MaChatLieu int null foreign key references ChatLieu(MaChatLieu),
	MaXuatXu int null foreign key references XuatXu(MaXuatXu),
	MaKichThuoc int null foreign key references KichThuoc(MaKichThuoc),
	SoLuong int not null, 
	GiaNhap decimal not null,
	GiaBan decimal not null,
	GiamGia decimal not null,
	TrangThai Smallint not null,
)

create table KhuyenMai (
	MaKhuyenMai int IDENTITY(1,1) not null PRIMARY KEY,
	TenKhuyenMai Nvarchar(30) ,
	NgayBatDau nchar(10),
	NgayKetThuc nchar(10),
	GiamGia int,
	TrangThai Smallint ,
	
)




create table HinhThucThanhToan (
	MaHTTT int IDENTITY(1,1) not null PRIMARY KEY,
	TenHTTT Nvarchar(50),
	
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
	
	GhiChu text,
	TrangThai Smallint ,
	MaKhuyenMai int foreign key references KhuyenMai(MaKhuyenMai)
)


create table TraHang(
MaHD int null foreign key references HoaDon(MaHD),

TenKH nvarchar(50) ,
TienDTT decimal not null,
NgayTH varchar(20),
TongTien varchar(20),

)





