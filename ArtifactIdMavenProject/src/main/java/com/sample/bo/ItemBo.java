package com.sample.bo;

import com.sample.model.Item;

public interface ItemBo {
	void save(Item item);
	void update(Item item);
	void delete(Item item);
	Item findByItemCode(String itemCode);
}
