// src/main/java/com/hotel/controller/ReservaController.java
package com.hotel.reserva_hotel.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.reserva_hotel.model.Reserva;
import com.hotel.reserva_hotel.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

    private final ReservaService servicio;

    public ReservaController(ReservaService servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public void agregar(@RequestBody Reserva r) {
        servicio.agregar(r);
    }

    @GetMapping("/{id}")
    public Reserva obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }
}
