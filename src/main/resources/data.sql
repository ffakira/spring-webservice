INSERT INTO user_details (id, birth_date, name) VALUES
(1001, CURRENT_DATE(), 'Akira'),
(1002, CURRENT_DATE(), 'Bob'),
(1003, CURRENT_DATE(), 'Carlos');

INSERT INTO post (id, description, user_id) VALUES
(2001, 'I want to learn AWS', 1001),
(2002, 'I want to learn DevOps', 1002),
(2003, 'I want to get AWS certificied', 1003),
(2004, 'I want to learn multi cloud', 1003);