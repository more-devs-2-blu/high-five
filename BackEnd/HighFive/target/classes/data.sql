INSERT INTO `highfive`.`customer` (`height`, `name`, `weight`) VALUES (180, 'João', 75);
INSERT INTO `highfive`.`customer` (`height`, `name`, `weight`) VALUES (160, 'Maria', 55);
INSERT INTO `highfive`.`customer` (`height`, `name`, `weight`) VALUES (175, 'Marcos', 80);

INSERT INTO `highfive`.`product` (`calculated_fit`, `comunity_fit`, `description`) VALUES (80, 90, 'Calça AA');
INSERT INTO `highfive`.`product` (`calculated_fit`,`comunity_fit`, `description`) VALUES (100, 90, 'Calça bb');
INSERT INTO `highfive`.`product` (`calculated_fit`,`comunity_fit`, `description`) VALUES (60, 70, 'Calça cc');

INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (50, 36, 65, 1);
INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (60, 38, 75, 1);
INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (70, 40, 85, 1);

INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (40, 36, 55, 2);
INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (50, 38, 65, 2);
INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (60, 40, 75, 2);

INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (50, 36, 55, 3);
INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (60, 38, 75, 3);
INSERT INTO `highfive`.`size` (`length`,`size`,`waist`,`product_id`) VALUES (70, 40, 85, 3);

INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0101', 1, 1);
INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0102', 2, 1);
INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0103', 3, 1);

INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0104', 1, 2);
INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0105', 2, 2);
INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0106', 3, 2);

INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0107', 1, 3);
INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0108', 2, 3);
INSERT INTO `highfive`.`request` (`ref_request`,`customer_id`,`product_id`) VALUES ('REF-0109', 3, 3);

INSERT INTO `highfive`.`customer_review` (`elasticity`,`length`,`modeling`,`ref_review`,`waist`,`product_id`) VALUES ('Boa', 60, 'Bom', 'REF-0201', 60, 1);
INSERT INTO `highfive`.`customer_review` (`elasticity`,`length`,`modeling`,`ref_review`,`waist`,`product_id`) VALUES ('Boa', 60, 'Bom', 'REF-0202', 60, 2);
INSERT INTO `highfive`.`customer_review` (`elasticity`,`length`,`modeling`,`ref_review`,`waist`,`product_id`) VALUES ('Boa', 60, 'Bom', 'REF-0203', 60, 3);
