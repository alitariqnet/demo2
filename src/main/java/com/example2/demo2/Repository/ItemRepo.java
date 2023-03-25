package com.example2.demo2.Repository;

import com.example2.demo2.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
