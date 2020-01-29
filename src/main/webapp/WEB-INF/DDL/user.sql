CREATE TABLE `t_users` (
	`num` INT NOT NULL AUTO_INCREMENT,
	`id` VARCHAR(30) NOT NULL,
	`password` VARCHAR(100) NOT NULL,
	`name` VARCHAR(50) NOT NULL,
	`email` VARCHAR(50) NOT NULL,	
	`phone` VARCHAR(11) NULL DEFAULT NULL,
	`img` VARCHAR(200) NULL DEFAULT '/res/img/man.png',
	`enabled` TINYINT NOT NULL DEFAULT 1,
	`regDate` DATETIME NOT NULL DEFAULT current_timestamp(),
	PRIMARY KEY (`num`)
);

CREATE TABLE t_authorities (
  num int NOT NULL,
  authority VARCHAR(50) NOT NULL DEFAULT 'ROLE_USER',
  FOREIGN KEY (num) REFERENCES t_users(num)
);

CREATE UNIQUE INDEX ix_auth_email on t_authorities (num,authority);


INSERT INTO t_users (`id`, `password`, `name`, `email`, `phone`) 
             VALUES ('admin','1234','관리자','admin@goodee.co.kr','');
             
SELECT * FROM t_users;

INSERT INTO t_authorities (num) VALUES (1);

SELECT * FROM t_authorities;


SELECT max(num) AS num FROM t_users;