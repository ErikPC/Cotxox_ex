package edu.poniperro.org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return calcularValoracionMedia();
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void setValoracion(Byte valoracion) {
        this.valoraciones.add(valoracion);
    }

    private double calcularValoracionMedia() {
        double valoracionMedia = 0.0;
        for (int i = 0; i < getNumeroValoraciones(); i++) {
            valoracionMedia = valoracionMedia + this.valoraciones.get(i);
        }
        return valoracionMedia / getNumeroValoraciones();
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean getOcupado() {
        return this.ocupado;
    }

}
