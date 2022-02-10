package edu.poniperro.org.foobarspam.cotxox.tarifa;

import edu.poniperro.org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final double COSTE_MINIMO = 5.0;
    static final byte PORCENTAJE_COMISION = 20;

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempo) {
        return tiempo * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double esperado = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        return esperado <= COSTE_MINIMO ? COSTE_MINIMO : esperado;
    }

}
