package edu.poniperro.org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.Optional;

public class PoolConductores {
    private ArrayList<Conductor> poolConductores = new ArrayList<>();

    public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public ArrayList<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Optional<Conductor> asignarConductor() {
        Optional<Conductor> condutorAsignado = getPoolConductores().stream().filter(c -> !c.getOcupado())
                .findAny();
        return condutorAsignado;
    }
}
