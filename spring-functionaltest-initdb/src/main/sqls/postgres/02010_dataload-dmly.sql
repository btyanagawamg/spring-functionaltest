INSERT INTO m_delivery_type (delivery_type_id, delivery_type_name) VALUES (0, '');
INSERT INTO m_delivery_type (delivery_type_id, delivery_type_name) VALUES (1, '通常');
INSERT INTO m_delivery_type (delivery_type_id, delivery_type_name) VALUES (2, '速配');
INSERT INTO m_delivery_type (delivery_type_id, delivery_type_name) VALUES (3, 'クール');
INSERT INTO m_delivery_type (delivery_type_id, delivery_type_name) VALUES (4, 'メール');
INSERT INTO t_delivery_status (delivery_status) VALUES ('');
INSERT INTO t_delivery_status (delivery_status) VALUES ('受付');
INSERT INTO t_delivery_status (delivery_status) VALUES ('配達中');
INSERT INTO t_delivery_status (delivery_status) VALUES ('完了');
INSERT INTO t_delivery_order (delivery_no, delivery_type_id, sender_name, sender_address, reciever_name, reciever_address, accept_datetime, completion_datetime, delivery_driver, delivery_status) VALUES (1, 1, '送り主名1', '送り主住所1', '送り先名1', '送り先住所1', TO_TIMESTAMP('2014/01/01 09:09:09', 'YYYY/MM/DD HH24:MI:SS'), null, 'ドライバー1', '受付');
INSERT INTO t_delivery_order (delivery_no, delivery_type_id, sender_name, sender_address, reciever_name, reciever_address, accept_datetime, completion_datetime, delivery_driver, delivery_status) VALUES (2, 1, '送り主名2', '送り主住所2', '送り先名2', '送り先住所2', TO_TIMESTAMP('2014/01/02 10:10:10', 'YYYY/MM/DD HH24:MI:SS'), null, 'ドライバー2', '受付');
INSERT INTO t_delivery_order (delivery_no, delivery_type_id, sender_name, sender_address, reciever_name, reciever_address, accept_datetime, completion_datetime, delivery_driver, delivery_status) VALUES (3, 1, '送り主名3', '送り主住所3', '送り先名3', '送り先住所3', TO_TIMESTAMP('2014/01/03 11:11:11', 'YYYY/MM/DD HH24:MI:SS'), null, 'ドライバー3', '受付');
INSERT INTO t_delivery_order (delivery_no, delivery_type_id, sender_name, sender_address, reciever_name, reciever_address, accept_datetime, completion_datetime, delivery_driver, delivery_status) VALUES (4, 1, '送り主名4', '送り主住所4', '送り先名4', '送り先住所4', TO_TIMESTAMP('2014/01/04 12:12:12', 'YYYY/MM/DD HH24:MI:SS'), null, 'ドライバー4', '受付');
INSERT INTO t_delivery_order (delivery_no, delivery_type_id, sender_name, sender_address, reciever_name, reciever_address, accept_datetime, completion_datetime, delivery_driver, delivery_status) VALUES (5, 1, '送り主名5', '送り主住所5', '送り先名5', '送り先住所5', TO_TIMESTAMP('2014/01/05 13:13:13', 'YYYY/MM/DD HH24:MI:SS'), null, 'ドライバー5', '受付');