
package com.rentaMaquina.maquinaria.app.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author nacai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class Admin implements Serializable{
    
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idAdmin;
   
   private String email;
   private String password;
   private String name;
 
}
