INSERT INTO user (id, user_name, first_name, last_name, email,password) VALUES
    (1, 'Ratz', 'joao', 'pereira', 'ratz@email.com', '12345');

INSERT INTO bonsai (id, name, specie, date_of_creation, image, description, user_id) VALUES
('9c0327a3-2d8f-48b3-9227-e48f214ba494', 'Acer', 'Acer Palmatum', '12-12-2200','random image', 'wow,very good',1),
('9c0327a3-2d8f-43b3-9127-e48f214ba494', 'Pinus', 'Pinus Silvestris', '11-12-2200','random image', 'wow,very good',1),
('7c0327a3-2d8f-48b3-9127-e48f214ba494', 'Mimosa', 'Silk Mimosa', '13-12-2200','random image', 'wow,very good',1);


INSERT INTO intervention (id, intervention_date, images, intervention_description, intervention_status, bonsai_id) VALUES
    (1, '2008-11-11',  'ola', 'ta tudo descriton', 1, '9c0327a3-2d8f-48b3-9227-e48f214ba494');