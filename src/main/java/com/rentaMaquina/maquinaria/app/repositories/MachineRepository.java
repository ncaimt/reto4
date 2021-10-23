
package com.rentaMaquina.maquinaria.app.repositories;

import com.rentaMaquina.maquinaria.app.entities.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nacai
 */
public interface MachineRepository extends JpaRepository<Machine,Integer> {
    
}
