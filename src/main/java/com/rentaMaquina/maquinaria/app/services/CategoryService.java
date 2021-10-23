
package com.rentaMaquina.maquinaria.app.services;

import com.rentaMaquina.maquinaria.app.entities.Category;
import com.rentaMaquina.maquinaria.app.repositories.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nacai
 */
@Service
public class CategoryService {
    @Autowired 
    private CategoryRepository repository;
    
    // GET consultar todos los registros
    public List<Category> getCategories(){
        return repository.findAll();
    }
    
    // `POST crear or registrar
    public Category saveCategory(Category category){
        return repository.save(category);
        
    }
    // peticion put para actualizar  (PUT)
    public Category updateCategory(Category category){
        Category existingCategory = repository.findById(category.getId()).orElse(null);
        existingCategory.setName(category.getName());
        existingCategory.setDescription(category.getDescription());
        return repository.save(existingCategory);
    
    }
    
    // delete o eliminar
    public void deleteCategory(int id){
        repository.deleteById(id);
       
    }
}
