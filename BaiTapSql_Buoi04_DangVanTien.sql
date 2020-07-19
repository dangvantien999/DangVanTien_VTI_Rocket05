USE classicmodels;

-- Question 1: Viết lệnh lấy ra thông tin khách hàng và thông tin các oder các khách hàng đã mua
SELECT customers.customerNumber,customers.customerName,orderNumber
FROM customers
INNER JOIN orders
ON customers.customerNumber = orders.customerNumber;

-- Question : Lấy ra các nhân viên làm việc tại USA
SELECT *
FROM employees e 
JOIN offices o
ON e.officeCode = o.officeCode
WHERE o.country = 'USA';

-- Question 3 : Thống kê xem mỗi khách hàng thực hiện bao nhiêu oder

SELECT customers.customerNumber,customers.customerName,COUNT(orders.customerNumber) as SoLuong
FROM customers
LEFT JOIN orders
ON customers.customerNumber = orders.customerNumber
GROUP BY customers.customerNumber;

-- Question 4 : Lấy thống kê xem mỗi khách hàng tiêu bao nhiêu tiền

SELECT customers.customerNumber,
		customers.customerName,
        orderdetails.quantityOrdered,
        orderdetails.priceEach,
        SUM(orderdetails.priceEach*orderdetails.quantityOrdered) as TongThanhToan
FROM customers
LEFT JOIN orders
ON customers.customerNumber = orders.customerNumber
LEFT JOIN orderdetails
ON orders.orderNumber = orderdetails.orderNumber
GROUP BY customers.customerNumber;

-- Question 5 ̀: Tính tổng giá trị của các order đã xuất kho (‘shipped’) trong tháng Tám năm 2004
SELECT SUM(orderdetails.priceEach*orderdetails.quantityOrdered) as TongCacOrderXuatKho
FROM orders
LEFT JOIN orderdetails
ON orders.orderNumber = orderdetails.orderNumber
WHERE `status`='Shipped' AND (orders.shippedDate BETWEEN '2004-8-1' AND '2004-8-31');
 
-- Question 6 : 2, Tính lợi nhuận (profit) thu được từ mỗi khách hàng dựa trên các orders mà họ thực hiện. Liệt kê theo tên khách hàngpayments
SELECT customers.customerNumber,
		customers.customerName,
        orderdetails.quantityOrdered,
        orderdetails.priceEach,
        SUM((orderdetails.priceEach*orderdetails.quantityOrdered)-(products.buyPrice*orderdetails.quantityOrdered)) as LoiNhuan
FROM customers
LEFT JOIN orders
ON customers.customerNumber = orders.customerNumber
LEFT JOIN orderdetails
ON orders.orderNumber = orderdetails.orderNumber
LEFT JOIN products
ON products.productCode= orderdetails.productCode
GROUP BY customers.customerNumber
ORDER BY customers.customerNumber;

-- Question 7 : Tính doanh thu (revenue) mà mỗi sản phẩm mang lại. Liệt kê theo tên sản phẩm.
SELECT products.productName,SUM(orderdetails.priceEach*quantityOrdered-products.buyPrice*quantityOrdered) as LoiNhuan
FROM products
LEFT JOIN orderdetails
ON products.productCode = orderdetails.productCode
GROUP BY productName;



