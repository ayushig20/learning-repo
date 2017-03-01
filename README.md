# learning-repo


drop database FirstDatabase;

create database FirstDatabase;

use FirstDatabase;

CREATE TABLE  `item` (
  `item_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_CODE` varchar(10) NOT NULL,
  `item_NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`item_ID`)) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

