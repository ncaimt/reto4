
package com.rentaMaquina.maquinaria.app.repositories;

import com.rentaMaquina.maquinaria.app.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nacai
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
