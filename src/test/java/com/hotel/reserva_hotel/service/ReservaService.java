package com.hotel.reserva_hotel.service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hotel.reserva_hotel.model.Reserva;

@Service
public class ReservaService {
    private Map<Long, Reserva> reservas = new HashMap<>();

    public void agregar(Reserva r) {
        reservas.put(r.getId(), r);
    }

    public Reserva obtener(Long id) {
        return reservas.get(id);
    }
}
