package ar.edu.centro8.daw.trabajo.practico.n2.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import lombok.AllArgsConstructor;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "autos")

public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private int precio;

    public Auto() {
    }

}
