package edu.poniperro.org.foobarspam.cotxox.carrera;

import java.util.Optional;

import edu.poniperro.org.foobarspam.cotxox.conductores.*;
import edu.poniperro.org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
    private Conductor conductor;
    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public double getCosteEsperado() {
        double costeTotal = Tarifa.getCosteTotalEsperado(this);
        this.costeTotal = costeTotal;
        return costeTotal;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void asignarConductor(PoolConductores conductores) {
        Optional<Conductor> conductor = conductores.asignarConductor();
        if (conductor.isPresent()) {
            setConductor(conductor.get());
            getConductor().setOcupado(true);
        } else {
            System.out.println("No hay conductores disponibles");
        }
    }

    public void realizarPago(double pago) {
        System.out.println(
                pago >= getCosteTotal() ? "Has pagado correctamente" : "no hay sunficiente dinero");
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public int getPropina() {
        return this.propina;
    }

    public void liberarConductor() {
        conductor = getConductor();
        conductor.setOcupado(false);
        this.conductor = null;
    }
}
