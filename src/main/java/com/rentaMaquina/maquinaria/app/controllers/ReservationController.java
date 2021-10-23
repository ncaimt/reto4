
package com.rentaMaquina.maquinaria.app.controllers;


import com.rentaMaquina.maquinaria.app.entities.Reservation;
import com.rentaMaquina.maquinaria.app.services.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nacai
 */
@RestController
@RequestMapping("Reservation")
public class ReservationController {
    
    @Autowired
    private ReservationService service;
    
    @GetMapping("/all")
    public List<Reservation> findAllReservation(){
        return service.getReservations();
    }
    
    @PostMapping("/save")
    public ResponseEntity addReservation(@RequestBody Reservation reservation){
        service.saveReservation(reservation);
        return ResponseEntity.status(201).build();
    }
    @PutMapping("/update")
    public ResponseEntity updateClient(@RequestBody Reservation reservation){
        service.updateReservation(reservation);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteClient(@RequestBody Reservation reservation){
        service.deleteReservation(reservation.getIdReservation());
        return ResponseEntity.status(204).build();
    }
    
}
