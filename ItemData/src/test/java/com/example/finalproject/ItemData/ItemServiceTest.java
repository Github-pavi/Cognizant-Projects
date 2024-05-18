package com.example.finalproject.ItemData;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.finalproject.ItemData.Model.Items;
import com.example.finalproject.ItemData.Service.ItemsService;



@SpringBootTest
class ItemServiceTest {
		
		@Autowired
		ItemsService service;
			
		Items item ;		
		
		@BeforeEach
		public void createObject()
		{
			item = new Items(1,"Box","1300",4,"Yes",3,16,"kol",false,"kart");
		}
		@AfterEach
		public void destroyObject()
		{
			item = null;
		}
			
		@Test
		public void addItemTest()
		{
			Items itemobeadded = service.addItems(item);
			assertNotNull( itemobeadded);
			assertEquals(item.getName(), itemobeadded.getName());
			assertEquals("1300", itemobeadded.getCost());
		}
		
		
		
		@Test
		public void searchItemTest()
		{
			service.addItems(item);
			Items searcheditem = service.searchItems(item.getItemid());
			assertNotNull(searcheditem.getItemid());
			assertEquals("Box", searcheditem.getName());
			}


	 
		@Test
		public void updateItemTest()
		{
			
			Items addeditem = service.addItems(item);
			Items existingitem = service.searchItems(addeditem.getItemid());
			existingitem.setName("Crates");
			service.updateItems(addeditem.getItemid(), existingitem);
			assertEquals("Crates", existingitem.getName());
			assertEquals("1300", existingitem.getCost());
			}
		
		@Test
		public void deleteItemTest()
		{
	       Items addeditem = service.addItems(item);
			boolean itemdeleted = service.deleteItems(addeditem.getItemid());
			assertTrue(itemdeleted);
		}
		


}
