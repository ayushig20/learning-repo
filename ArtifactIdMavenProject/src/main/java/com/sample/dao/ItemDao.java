package com.sample.dao;

import com.sample.model.Item;

public interface ItemDao {
	void save(Item item);
	void update(Item item);
	void delete(Item item);
	Item findByStockCode(String itemCode);
}
