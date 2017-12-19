insert into category (id, name, description) values (1, 'flooring', 'flooring products');
insert into category (id, name, description) values (2, 'diary', 'diary products' );
insert into category (id, name, description) values (3, 'aparel', 'cloths products' );

insert into product (id, name, description, price, stock_qty, last_updated, category_id)
  VALUES (1, 'turkey carpet', 'style 1 x 201', 299.99, 33, current_timestamp, 1);
insert into product (id, name, description, price, stock_qty, last_updated, category_id)
  VALUES (2, 'milk', '1 litr galon', 2.66, 60, current_timestamp, 2);
insert into product (id, name, description, price, stock_qty, last_updated, category_id)
  VALUES (3, 'jaket', 'red xl for men', 24.99, 12, current_timestamp, 3);