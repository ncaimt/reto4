
package com.rentaMaquina.maquinaria.app.controllers;

import com.rentaMaquina.maquinaria.app.entities.Message;
import com.rentaMaquina.maquinaria.app.services.MessageService;
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
@RequestMapping("Message")
public class MessageController {
    
    @Autowired
    private MessageService service;
    
    @GetMapping("/all")
    public List<Message> findAllMessages(){
        return service.getMessages();
    }
    
    @PostMapping("/save")
    public ResponseEntity addMessage(@RequestBody Message message){
        service.saveMessage(message);
        return ResponseEntity.status(201).build();
    }
    @PutMapping("/update")
    public ResponseEntity updateMessage(@RequestBody Message message){
        service.updateMesage(message);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteMachine(@RequestBody Message message){
        service.deleteMessage(message.getIdMessage());
        return ResponseEntity.status(204).build();
    }
    
}
