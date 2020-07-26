insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');

insert into restaurante (id, nome, taxa_frete, cozinha_id) values (1, 'Thai Gourmet', 10, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Thai Delivery', 9.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Tuk Tuk Comida Indiana', 15, 2);

insert into estado (id, nome) values (1, 'Rio de Janeiro');
insert into estado (id, nome) values (2, 'Minas Gerais');

insert into cidade (id, nome, estado_id) values (1, 'Rio de Janeiro', 1);
insert into cidade (id, nome, estado_id) values (2, 'Duque De Caxias', 1);
insert into cidade (id, nome, estado_id) values (3, 'Belo Horizonte', 2);
