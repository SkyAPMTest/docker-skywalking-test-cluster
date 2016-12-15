CREATE TABLE IF NOT EXISTS `test`.`cache_table` (
  `id`    INT         NOT NULL AUTO_INCREMENT,
  `CACHE_KEY`   VARCHAR(30) NOT NULL,
  `CACHE_VALUE` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`)
);


DELETE FROM `test`.`cache_table`
WHERE id = '1';

INSERT INTO `test`.`cache_table` (`id`, `CACHE_KEY`, `CACHE_VALUE`) VALUES (1, "test", "test");
