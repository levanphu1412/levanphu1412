## Liệt kê danh sách độc giả đang mượn sách
```sql
SELECT DISTINCT docgia.*
FROM docgia inner JOIN phieumuon ON docgia.id = phieumuon.docgia_id 


```

## Liệt kê các quyển sách thuộc thể loại bất kỳ
```sql 
SELECT * 
FROM `sach` INNER JOIN sach_theloai ON sach.id = sach_theloai.sach_id
INNER JOIN theloai ON sach_theloai.theloai_id = theloai.id
WHERE theloai.tentheloai = 'giáo dục'

```

## Đưa ra số lần tái bản của quyển sách bất kỳ

```sql
SELECT ten, COUNT(nam) AS 'số lần tái bản'
FROM sach INNER JOIN taiban ON sach.id = taiban.sach_id
GROUP BY ten
```

## Liệt kê thông tin các độc giả mượn sách nhưng quá hạn trả và id, tên của quyển sách mà độc giả đó đang mượn (Gợi ý sử dụng DATEDIFF)

```sql

```