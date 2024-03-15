CREATE TABLE product (
   id SERIAL PRIMARY KEY,
   name TEXT NOT NULL,
   description TEXT,
   price DECIMAL(10, 2) NOT NULL,
   quantity INTEGER NOT NULL
);