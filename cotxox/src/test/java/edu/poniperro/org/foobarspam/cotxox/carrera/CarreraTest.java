package edu.poniperro.org.foobarspam.cotxox.carrera;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.org.foobarspam.cotxox.conductores.Conductor;

public class CarreraTest {
    Carrera carrera;
    String tarjetaCredito = "123456789S";

    @Before
    public void setup() {
        this.carrera = new Carrera(tarjetaCredito);
    }

    @Test
    public void crearCarreraTest() {
        assertEquals(tarjetaCredito, carrera.getTarjetaCredito());
    }

    @Test
    public void carreraOrigenTest() {
        carrera.setOrigen("Manacor");
        assertEquals("Manacor", carrera.getOrigen());
    }

    @Test
    public void carreraDestinoTest() {
        carrera.setDestino("Bunyola");
        assertEquals("Bunyola", carrera.getDestino());
    }

    @Test
    public void carreraDistanciaTest() {
        carrera.setDistancia(3.6);
        assertEquals(3.6, carrera.getDistancia());
    }

    @Test
    public void carreraTiempoEsperadoTest() {
        carrera.setTiempoEsperado(3);
        assertEquals(3, carrera.getTiempoEsperado());
    }

    @Test
    public void carreraTiempoCarreraTest() {
        carrera.setTiempoCarrera(3);
        assertEquals(3, carrera.getTiempoCarrera());
    }

    @Test
    public void carreraConductorTest() {
        Conductor juan = new Conductor();
        carrera.setConductor(juan);
        assertEquals(juan, carrera.getConductor());
    }

    @Test
    public void carreraPoolConductoresTest() {
        Conductor josep = new Conductor();
        PoolConductores juan = new PoolConductores(new Conductor[] { josep });
        assertEquals(josep, carrera.getConductor());
    }

    @Test
    public void carreraCosteEsperadoTest() {
        carrera.setDistancia(10);
        carrera.setTiempoEsperado(10);
        assertEquals(17, carrera.getCosteEsperado());
    }

    @Test
    public void realizarPagoTest() {
        carrera.realizarPago(8.9);
    }

    @Test
    public void getCosteTotalTest() {
        carrera.setDistancia(10);
        carrera.setTiempoCarrera(10);
        assertEquals(17, carrera.getCosteTotal());
    }

    @Test
    public void carreraPropinaTest() {
        carrera.recibirPropina(1);
        assertEquals(1, carrera.getPropina());
    }

    @Test
    public void liberarConductorTest() {
        Conductor juan = new Conductor();
        carrera.setConductor(juan);
        assertEquals(juan, carrera.getConductor());
        carrera.liberarConductor();
        assertNull(carrera.getConductor());
    }
}
