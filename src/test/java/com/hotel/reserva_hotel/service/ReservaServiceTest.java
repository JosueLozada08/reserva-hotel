package com.hotel.reserva_hotel.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.hotel.reserva_hotel.model.Reserva;

class ReservaServiceTest {

    @Test
    void testAgregarYObtener() {
        ReservaService servicio = new ReservaService();
        Reserva r = new Reserva();
        r.setId(1L);
        r.setCliente("Pedro");
        r.setFecha("2025-06-01");

        servicio.agregar(r);
        Reserva resultado = servicio.obtener(1L);
        assertEquals("Pedro", resultado.getCliente());
    }
}
