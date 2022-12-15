
select MaHD,HoaDonChiTiet.MaCTSP,HoaDonChiTiet.MaKhuyenMai,HoaDonChiTiet.SoLuong,GiaBan,HoaDonChiTiet.TrangThai,HoaDonChiTiet.MaHD,  sum( ((giaban*(100 - khuyenmai.GiamGia))/100)*HoaDonChiTiet.SoLuong) from hoadonchitiet join chitietsanpham on hoadonchitiet.maCTSP = chitietsanpham.MaCTSP
                              						join khuyenmai on hoadonchitiet.makhuyenmai = khuyenmai.makhuyenmai 
                         						join kichthuoc on chitietsanpham.makichthuoc = kichthuoc.makichthuoc 
          									
               									group by HoaDonChiTiet.MaHD,HoaDonChiTiet.MaCTSP,HoaDonChiTiet.MaKhuyenMai,HoaDonChiTiet.SoLuong,ChiTietSanPham.GiaBan,HoaDonChiTiet.TrangThai