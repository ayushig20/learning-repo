package com.sample.bo.impl;

import com.sample.bo.ItemBo;
import com.sample.dao.ItemDao;
import com.sample.model.Item;

public class ItemBoImpl implements ItemBo {

	ItemDao itemDao;

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void save(Item item) {
		itemDao.save(item);
	}

	public void update(Item item) {
		itemDao.update(item);
	}

	public void delete(Item item) {
		itemDao.delete(item);
	}

	public Item findByItemCode(String itemCode) {
		return itemDao.findByStockCode(itemCode);
	}

}
