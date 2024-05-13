alter table lanchesLegal.clientes add column pedido_vinculado tinyint DEFAULT 0;

update lanchesLegal.clientes set pedido_vinculado = 0;

alter table lanchesLegal.clientes modify column pedido_vinculado tinyint not null DEFAULT 0;

alter table lanchesLegal.produtos add column pedido_vinculado tinyint DEFAULT 0;

update lanchesLegal.produtos set pedido_vinculado = 0;

alter table lanchesLegal.produtos modify column pedido_vinculado tinyint not null DEFAULT 0;