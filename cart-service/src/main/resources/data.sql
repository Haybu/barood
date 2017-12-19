insert into customer (id, name) values (1, 'Haytham Mohamed');
insert into customer (id, name) values (2, 'Eyman Ahmad');

insert into cart (id, name, customer_id) values (1, 'cart 1', 1);
insert into cart (id, name, customer_id) values (2, 'cart 2', 2);

insert into cart_item(cart_id, product_id, item_qty,  last_updated)
  VALUES (1, 1, 2, current_timestamp);
insert into cart_item(cart_id, product_id, item_qty, last_updated)
  VALUES (1, 2, 1, current_timestamp);
insert into cart_item(cart_id, product_id, item_qty, last_updated)
  VALUES (1, 3, 1, current_timestamp);

insert into cart_item(cart_id, product_id, item_qty, last_updated)
VALUES (2, 1, 3, current_timestamp);
insert into cart_item(cart_id, product_id, item_qty, last_updated)
  VALUES (2, 2, 7, current_timestamp);
