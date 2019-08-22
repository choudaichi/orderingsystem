package com.daichi.feign;

import com.daichi.entity.MenuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{page}/{limit}")
    MenuVO findAll(@PathVariable("page") int page,
                   @PathVariable("limit") int limit);

    @DeleteMapping("/menu/deleteById/{id}")
    void deleteById(@PathVariable("id") Long id);
}
