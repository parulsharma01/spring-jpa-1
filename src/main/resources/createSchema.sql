use mydb;

Create Table IF NOT EXISTS  employee(
  id int PRIMARY KEY AUTO_INCREMENT,
  fname varchar(20),
  lname varchar(20),
  age int,
  salary int
);


--Create Table IF NOT EXISTS role(
--  id int PRIMARY KEY AUTO_INCREMENT,
--  name varchar(20)
--);
--
--Create Table IF NOT EXISTS user_role(
--  user_id int,
--  role_id int,
--  FOREIGN KEY (user_id) REFERENCES user(id),
--  FOREIGN KEY (role_id) REFERENCES role(id)
--);



