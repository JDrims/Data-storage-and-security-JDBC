insert into CUSTOMERS(name, surname, age, phone_number)
values ('alexey', 'alexey', 28, '77777777777'),
('anrei', 'anrei', 40, '77777777777'),
('sahsa', 'sahsa', 21, '77777777777');

insert into ORDERS(date, customer_id, product_name, amount)
values (current_date, 2, 'desktop', 4),
(current_date, 2, 'laptop', 2),
(current_date, 3, 'iphone', 3);