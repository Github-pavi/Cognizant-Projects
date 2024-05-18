package com.example.finalproject.ItemData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalproject.ItemData.Model.Items;
import com.example.finalproject.ItemData.Service.ItemsService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/items")
public class ItemsController {
	
	@Autowired
	ItemsService service;
	
	@PostMapping("/additem")
	@ResponseStatus(HttpStatus.CREATED)
	public Items addItems(@Valid @RequestBody Items item) {
		return service.addItems(item);
	}
	
	@GetMapping("/all")
	public List<Items> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/viewitem")
	@ResponseStatus(HttpStatus.OK)
	public Items searchItems(@RequestParam int itemid)
	{
		return service.searchItems(itemid);
	}
	
	@PutMapping("/updateitem/{itemid}")
	@ResponseStatus(HttpStatus.CREATED)
	public Items updateItems(@PathVariable int itemid,@RequestBody Items item)
	{
		return service.updateItems(itemid, item);
	}
	
	@DeleteMapping("/deleteitem/{itemid}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteItems(@PathVariable int itemid)
	{
		service.deleteItems(itemid);
	}
	

}
