## tạo database library
```sql
    CREATE DATABASE library
```

## tạo bảng sách

```sql
    CREATE TABLE sach(
	id INT PRIMARY KEY,
    ten VARCHAR(30) NOT NULL,
    sotrang INT NOT NULL,
    theloai TEXT NOT NULL,
    tacgia VARCHAR(30) NOT NULL,
    namxuatban DATE,
    nhaxuatban TEXT NOT NULL,
    tinhtrang TEXT,
    vitri VARCHAR(30)
);
```

## tạo bảng thể loại

```sql
    CREATE TABLE theloai(
        id INT PRIMARY KEY,
        tentheloai TEXT
    )
```

## tạo bảng sach_theloai

```sql
    CREATE TABLE sach_theloai(
	sach_id INT,
    theloai_id INT,
    FOREIGN KEY(sach_id) REFERENCES sach(id),
    FOREIGN KEY(theloai_id) REFERENCES theloai(id)
)
```

## tạo bảng tác giả
```sql
    CREATE TABLE tacgia(
	id INT PRIMARY KEY,
    ten VARCHAR(30) NOT NULL,
    ngaysinh DATE,
    quenquan VARCHAR(30),
    mota TEXT
)
```

## tạo bảng sach_tacgia

```sql
    CREATE TABLE sach_tacgia(
	sach_id INT,
    tacgia_id INT,
    FOREIGN KEY(sach_id) REFERENCES sach(id),
    FOREIGN KEY(tacgia_id) REFERENCES tacgia(id)
)
```

## tạo bảng tái bản

```sql
    CREATE TABLE taiban(
	id INT PRIMARY KEY,
    nam YEAR NOT NULL,
    sach_id INT,
    FOREIGN KEY(sach_id) REFERENCES sach(id)
)
```

## tạo bảng độc giả
```sql
    CREATE TABLE docgia(
	id INT PRIMARY KEY,
    ten VARCHAR(30) NOT NULL,
    ngaysinh DATE,
    gioitinh VARCHAR(30),
    diachi VARCHAR(30) NOT NULL,
    sdt BIGINT NOT NULL,
    email CHAR(50)
)
```

## tạo bảng nhân viên

```sql
    CREATE TABLE nhanvien(
	id INT PRIMARY KEY,
    ten VARCHAR(30) NOT NULL,
    ngaysinh DATE,
    gioitinh VARCHAR(30),
    diachi VARCHAR(30) NOT NULL,
    sdt BIGINT NOT NULL,
    email CHAR(50),
    avata TEXT NOT NULL
)
```

## tạo bảng phiếu mượn

```sql
    CREATE TABLE phieumuon(
	id INT PRIMARY KEY,
    docgia_id INT,
    nhanvien_id INT,
    ngaymuon DATE NOT NULL,
    ngayhentra DATE NOT NULL,
    FOREIGN KEY(docgia_id) REFERENCES docgia(id),
    FOREIGN KEY(nhanvien_id) REFERENCES nhanvien(id)
)
```

## tạo bảng chi tiết mượn

```sql
    CREATE TABLE chitietmuon(
	phieumuon_id INT,
    sach_id INT,
    soluong INT NOT NULL,
    FOREIGN KEY(phieumuon_id) REFERENCES phieumuon(id),
    FOREIGN KEY(sach_id) REFERENCES sach(id)
)
```

## tạo bảng phiếu trả 

```sql
    CREATE TABLE phieutra(
	id INT PRIMARY KEY,
    phieumuon_id INT,
    ngaytra DATE NOT NULL,
    FOREIGN KEY(phieumuon_id) REFERENCES phieumuon(id)
)
```

![image](image/library.png)

