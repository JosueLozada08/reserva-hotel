package com.hotel.reserva_hotel.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reserva {

    @Id
    private Long id;
    private String cliente;
    private String fecha;

    // Constructor vacío
    public Reserva() {}

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
