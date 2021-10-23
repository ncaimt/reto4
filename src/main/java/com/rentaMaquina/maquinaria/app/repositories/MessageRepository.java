
package com.rentaMaquina.maquinaria.app.repositories;

import com.rentaMaquina.maquinaria.app.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nacai
 */
public interface MessageRepository extends JpaRepository<Message,Integer> {
    
}
