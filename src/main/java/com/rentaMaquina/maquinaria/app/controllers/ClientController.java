
package com.rentaMaquina.maquinaria.app.controllers;

import com.rentaMaquina.maquinaria.app.entities.Client;
import com.rentaMaquina.maquinaria.app.services.ClientService;
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
@RequestMapping("Client")
public class ClientController {
    
    @Autowired
    private ClientService service;
    
    @GetMapping("/all")
    public List<Client> findAllClient(){
        return service.getClients();
    }
    
    @PostMapping("/save")
    public ResponseEntity addClient(@RequestBody Client client){
        service.saveClient(client);
        return ResponseEntity.status(201).build();
    }
    @PutMapping("/update")
    public ResponseEntity updateClient(@RequestBody Client client){
        service.updateClient(client);
        return ResponseEntity.status(201).build();
    }
    /*
    @DeleteMapping("/delete")
    public ResponseEntity deleteClient(@RequestBody Client client){
        service.deleteClient(client.getIdClient());
        return ResponseEntity.status(204).build();
    }
     */
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteClient(@PathVariable int id){
        service.deleteClient(id);
        return ResponseEntity.status(204).build();
    }
    
}
