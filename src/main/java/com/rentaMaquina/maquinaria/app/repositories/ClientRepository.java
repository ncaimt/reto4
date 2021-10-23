
package com.rentaMaquina.maquinaria.app.repositories;

import com.rentaMaquina.maquinaria.app.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nacai
 */
public interface ClientRepository extends JpaRepository<Client,Integer> {
    
}