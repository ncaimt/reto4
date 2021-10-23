
package com.rentaMaquina.maquinaria.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@Table(name="score")
public class Score implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idScore;
    private String mesageText;
    private int stars;
    
    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;
   
}
