package edu.poniperro.org.foobarspam.cotxox.conductores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConductorTest {
    Conductor samuele = new Conductor("Samuele");

    @Test
    public void getNombreTest() {
        assertEquals("Samuele", samuele.getNombre());
    }

    @Test
    public void conductorModeloTest() {
        samuele.setModelo("Toyota");
        assertEquals("Toyota", samuele.getModelo());
    }

    @Test
    public void conductorMatriculaTest() {
        samuele.setMatricula("4687 KYS");
        assertEquals("4687 KYS", samuele.getMatricula());
    }

    @Test
    public void getValoracionTest() {
        samuele.setValoraciones((byte) 1);
        samuele.setValoraciones((byte) 2);
        assertEquals(1.5, samuele.getValoracion(), 0);
    }

    @Test
    public void getNumeroValoracionesTest() {
        samuele.setValoraciones((byte) 1);
        samuele.setValoraciones((byte) 2);
        assertEquals(2, samuele.getNumeroValoraciones());
    }

    @Test
    public void setValoracionesTest() {
        samuele.setValoraciones((byte) 2);
        assertEquals(1, samuele.getNumeroValoraciones());
    }

    @Test
    public void conductorOcupadoTest() {
        samuele.setOcupado(true);
        assertEquals(true, samuele.getOcupado());
    }

}
