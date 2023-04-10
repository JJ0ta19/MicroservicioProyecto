package com.example.ejonespringboot.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "Trabajo")

public class Trabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    private String empresa;
    private String lugar;
    private String cargo;
    private String horasTrabajadas;
    private String sueldo;


    public Trabajo(Long id, String empresa, String lugar, String cargo, String horasTrabajadas,
                   String sueldo){

        this.id=id;
        this.empresa=empresa;
        this.lugar=lugar;
        this.cargo=cargo;
        this.horasTrabajadas=horasTrabajadas;
        this.sueldo=sueldo;
    }
    public Trabajo(){ }



}
