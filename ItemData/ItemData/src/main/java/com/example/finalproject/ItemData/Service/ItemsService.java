package com.example.finalproject.ItemData.Service;

import java.util.List;

import com.example.finalproject.ItemData.Model.Items;

public interface ItemsService {
	
	public Items addItems(Items item);
	public Items searchItems(int itemid);
	public Items updateItems(int itemid,Items item);
	public boolean deleteItems(int itemid);
	public List<Items> findAll();
	

}
