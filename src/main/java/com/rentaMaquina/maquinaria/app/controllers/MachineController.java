
package com.rentaMaquina.maquinaria.app.controllers;

import com.rentaMaquina.maquinaria.app.entities.Machine;
import com.rentaMaquina.maquinaria.app.services.MachineService;
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
@RequestMapping("Machine")
public class MachineController {
    
    @Autowired
    private MachineService service;
    
    @GetMapping("/all")
    public List<Machine> findAllMachines(){
        return service.getMachines();
    }
    
    @PostMapping("/save")
    public ResponseEntity addMachine(@RequestBody Machine machine){
        service.saveMachine(machine);
        return ResponseEntity.status(201).build();
    }
    @PutMapping("/update")
    public ResponseEntity updateMachine(@RequestBody Machine machine){
        service.updateMachine(machine);
        return ResponseEntity.status(201).build();
    }
    /*
    @DeleteMapping("/delete")
    public ResponseEntity deleteMachine(@RequestBody Machine machine){
        service.deleteMachine(machine.getId());
        return ResponseEntity.status(204).build();
    }
    */
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMachine(@PathVariable int id){
        service.deleteMachine(id);
        return ResponseEntity.status(204).build();
    }
    
    
  
    
}
