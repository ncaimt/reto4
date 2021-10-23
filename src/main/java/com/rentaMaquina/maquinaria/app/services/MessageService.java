
package com.rentaMaquina.maquinaria.app.services;

import com.rentaMaquina.maquinaria.app.entities.Message;
import com.rentaMaquina.maquinaria.app.repositories.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nacai
 */
@Service
public class MessageService {
    
    @Autowired 
    private MessageRepository repository;
    
    // GET consultar todos los registros
    public List<Message> getMessages(){
        return repository.findAll();
    }
    
    // `POST crear or registrar
    public Message saveMessage(Message message){
        return repository.save(message);
        
    }
    // peticion put para actualizar  (PUT)
    public Message updateMesage(Message message){
        Message existingMessage = repository.findById(message.getIdMessage()).orElse(null);
        existingMessage.setMessageText(message.getMessageText());
        return repository.save(existingMessage);
    
    }
    
    // delete o eliminar
    public String deleteMessage(int id){
        repository.deleteById(id);
        return "Mensaje eliminado"+id;
    }
    
}
