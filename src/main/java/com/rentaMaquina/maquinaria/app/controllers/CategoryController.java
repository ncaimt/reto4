package com.rentaMaquina.maquinaria.app.controllers;

import com.rentaMaquina.maquinaria.app.entities.Category;
import com.rentaMaquina.maquinaria.app.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nacai
 */
@RestController
@RequestMapping("Category")
public class CategoryController {
    
    @Autowired
    private CategoryService service;
    
    @GetMapping("/all")
    public List<Category> findAllCategory(){
        return service.getCategories();
    }
    
    @PostMapping("/save")
    public ResponseEntity addCategory(@RequestBody Category category){
        service.saveCategory(category);
        return ResponseEntity.status(201).build();
    }
    @PutMapping("/update")
    public ResponseEntity updateCategory(@RequestBody Category category){
        service.updateCategory(category);
        return ResponseEntity.status(201).build();
    }
    /*
    @DeleteMapping("/delete")
    public ResponseEntity deleteCategory(@RequestBody Category category){
        service.deleteCategory(category.getId());
        return ResponseEntity.status(204).build();
    }
    */
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCategory(@PathVariable int id){
        service.deleteCategory(id);
        return ResponseEntity.status(204).build();
    }
    
    
}
