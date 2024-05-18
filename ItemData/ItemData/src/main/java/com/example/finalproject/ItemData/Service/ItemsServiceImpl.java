package com.example.finalproject.ItemData.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finalproject.ItemData.Exceptions.DataIncorrectException;
import com.example.finalproject.ItemData.Model.Items;
import com.example.finalproject.ItemData.Repository.ItemsDao;

@Service
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	ItemsDao dao;

	@Override
	public Items addItems(Items item) {
		
		if(item. getPack().equals("Yes"))
		{
			item.setContents(item.getContents());
		}
		if(item. getPack().equals("No"))
		{
			item.setContents(0);
		}
		return dao.save(item);
	}
	
	@Override
	public Items searchItems(int itemid) {
		Items searcheditem = dao.findById(itemid).orElseThrow(()->new DataIncorrectException());
		 return searcheditem;
	}
		

	@Override
	public Items updateItems(int itemid, Items item) {
		Items existingitem = dao.findById(itemid).orElseThrow(()->new DataIncorrectException());
	    existingitem.setName(item.getName());
	    existingitem.setCost(item.getCost());
		existingitem.setPack(item.getPack());
		existingitem.setContents(item.getContents());
		existingitem.setDimensions(item.getDimensions());
		existingitem.setOrigin(item.getOrigin());
		existingitem.setShipping(item.shipping);
		existingitem.setCompany(item.getCompany());

		return dao.save(existingitem);
	}
	
	

	@Override
	public boolean deleteItems(int itemid) {
		Items item = dao.findById(itemid).orElseThrow(()->new DataIncorrectException());
	      dao.deleteById(itemid);
		return true;
	}

	@Override
	public List<Items> findAll() {
		
		return dao.findAll();
	}	

}

	