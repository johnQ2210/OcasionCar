package Nucleo;

import java.time.LocalDate;

public class Todoterrenos extends Automovil {

    private String traccion;

    public Todoterrenos(String matricula, String marca, String modelo, int potencia, String color,  int km_recorridos, int precio, String combustible, String cambio, int plazas, String traccion) {
        super(matricula, marca, modelo, potencia, color,  km_recorridos, precio, combustible, cambio, plazas);
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
