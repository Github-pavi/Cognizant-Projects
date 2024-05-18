package com.example.finalproject.ItemData.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.finalproject.ItemData.Model.Items;

@Repository
public interface ItemsDao extends JpaRepository<Items, Integer> {

}
