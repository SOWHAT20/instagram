-- sql문은 해당 위치에 공유합니다.

use instagram;
CREATE TABLE user
(
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `email` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
    `password` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
    `created_at` datetime NOT NULL default CURRENT_TIMESTAMP,
    `updated_at` datetime NOT NULL default CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB;
DESCRIBE user;
