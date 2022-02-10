package edu.poniperro.org.foobarspam.cotxox.tarifa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.poniperro.org.foobarspam.cotxox.carrera.Carrera;

public class TarifaTest {
    @Test
    public void getCosteDistanciaTest() {
        assertEquals(13.5, Tarifa.getCosteDistancia(10), 0);
    }

    @Test
    public void getCosteTiempoTest() {
        assertEquals(3.5, Tarifa.getCosteTiempo(10), 0);
    }

    @Test
    public void getCosteTotalEsperadoMinimoTest() {
        Carrera carrera = new Carrera("132132131645LSD");
        assertEquals(5.0, Tarifa.getCosteTotalEsperado(carrera), 0);
    }

    public void getCosteTotalEsperadoTest() {
        Carrera carrera = new Carrera("132132131645LSD");
        assertEquals(17.0, Tarifa.getCosteTotalEsperado(carrera), 0);
    }
}
