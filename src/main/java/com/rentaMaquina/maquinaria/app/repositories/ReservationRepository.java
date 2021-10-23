
package com.rentaMaquina.maquinaria.app.repositories;

import com.rentaMaquina.maquinaria.app.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nacai
 */
public interface ReservationRepository extends JpaRepository<Reservation,Integer>{
    
}
