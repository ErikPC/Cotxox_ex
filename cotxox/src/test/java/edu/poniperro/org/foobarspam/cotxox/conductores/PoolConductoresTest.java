package edu.poniperro.org.foobarspam.cotxox.conductores;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Test;

public class PoolConductoresTest {
    @Test
    public void asignarCopnductorTest() {
        ArrayList<Conductor> samuele = new ArrayList<Conductor>() {
            {
                add(new Conductor("Samuele"));
                add(new Conductor("Jorge"));
                add(new Conductor("David"));
                add(new Conductor("Falopio"));
            }
        };
        PoolConductores mejoresConductores = new PoolConductores(samuele);
        Optional<Conductor> condutorElejido = mejoresConductores.asignarConductor();
        assertTrue(condutorElejido.isPresent());
        assertTrue(
                condutorElejido.get().getNombre() == "Samuele"
                        || condutorElejido.get().getNombre() == "Falopio"
                        || condutorElejido.get().getNombre() == "Jorge"
                        || condutorElejido.get().getNombre() == "David");

    }
}
