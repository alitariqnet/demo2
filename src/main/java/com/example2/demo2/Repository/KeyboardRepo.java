package com.example2.demo2.Repository;

import com.example2.demo2.Entity.Keyboard;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface KeyboardRepo extends JpaRepository<Keyboard, Integer> {

}
