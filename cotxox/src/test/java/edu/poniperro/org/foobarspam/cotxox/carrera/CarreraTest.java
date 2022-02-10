package edu.poniperro.org.foobarspam.cotxox.carrera;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.org.foobarspam.cotxox.conductores.Conductor;
import edu.poniperro.org.foobarspam.cotxox.conductores.ConductorTest;
import edu.poniperro.org.foobarspam.cotxox.conductores.PoolConductores;

public class CarreraTest {
    Carrera carrera;
    String tarjetaCredito = "123456789LSD";

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
        assertEquals(3.6, carrera.getDistancia(), 0);
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
        Conductor juan = new Conductor("Juan");
        carrera.setConductor(juan);
        assertEquals("Juan", carrera.getConductor().getNombre());
    }

    @Test
    public void carreraPoolConductoresTest() {
        Conductor josep = new Conductor("Josep");
        PoolConductores conductores = new PoolConductores(new ArrayList<Conductor>() {
            {
                add(josep);
            }

        });
        carrera.asignarConductor(conductores);
        assertTrue(carrera.getConductor().getOcupado());
    }

    @Test
    public void carreraCosteEsperadoTest() {
        carrera.setDistancia(10);
        carrera.setTiempoEsperado(10);
        assertEquals(17, carrera.getCosteEsperado(), 0);
    }

    @Test
    public void realizarPagoTest() {
        carrera.realizarPago(8.9);
    }

    @Test
    public void getCosteTotalTest() {
        carrera.setDistancia(10);
        carrera.setTiempoEsperado(10);
        carrera.getCosteEsperado();
        assertEquals(17, carrera.getCosteTotal(), 0);
    }

    @Test
    public void carreraPropinaTest() {
        carrera.recibirPropina(1);
        assertEquals(1, carrera.getPropina());
    }

    @Test
    public void liberarConductorTest() {
        Conductor juan = new Conductor("Juan");
        carrera.setConductor(juan);
        assertEquals(juan, carrera.getConductor());
        carrera.liberarConductor();
        assertNull(carrera.getConductor());
    }
}
