package com.daichi.repository;

import com.daichi.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository {

    List<Menu> findAll(int page, int limit);

    int count();

    Menu findById(Integer id);

    void save(Menu menu);

    void update(Menu menu);

    void deleteById(Long id);

}
