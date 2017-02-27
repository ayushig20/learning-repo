package com.sample.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.bo.ItemBo;
import com.sample.model.Item;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext =
	    	  new ClassPathXmlApplicationContext("config/BeanLocations.xml");

	    	ItemBo itemBo = (ItemBo)appContext.getBean("itemBo");

	    	/** insert **/
	    	Item item = new Item();
	    	item.setItemCode("7669");
	    	item.setItemName("Aysuhi");
	    	itemBo.save(item);

	    	/** select **/
	    	Item item2 = itemBo.findByItemCode("7669");
	    	System.out.println(item2);

	    	/** update **/
	    	item2.setItemName("HAIO-1");
	    	itemBo.update(item2);

	    	/** delete **/
	    	//stockBo.delete(stock2);

	    	System.out.println("Done");
	}
}
