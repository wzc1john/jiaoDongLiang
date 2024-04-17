SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `ordinary`;
CREATE TABLE `ordinary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `height` int(11) DEFAULT NULL,
	`speed` int(11) DEFAULT NULL,
	`angle` int(11) DEFAULT NULL,
	`weight` int(11) DEFAULT NULL,
	`cishu` int(11) DEFAULT NULL,
	`user_id` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;