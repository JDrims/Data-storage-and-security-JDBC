CREATE TABLE if not exists CUSTOMERS(
    id SERIAL PRIMARY KEY,
    name VARCHAR(20),
    surname VARCHAR(30),
    age INT,
    phone_number VARCHAR(11)
);

CREATE TABLE if not exists ORDERS (
    id SERIAL PRIMARY KEY,
    date DATE,
    customer_id INT,
    product_name VARCHAR(255),
    amount INT,
    FOREIGN KEY (customer_id) REFERENCES customers (id)
);