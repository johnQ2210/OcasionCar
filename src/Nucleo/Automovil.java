package Nucleo;

import java.time.LocalDate;

public class Automovil extends Vehiculos {

    private String combustible;
    private String cambio;
    private int plazas;

    public Automovil(String matricula, String marca, String modelo, int potencia, String color,  int km_recorridos, int precio, String combustible, String cambio, int  plazas) {
        super(matricula, marca, modelo, potencia, color, km_recorridos, precio);
        this.combustible = combustible;
        this.cambio = cambio;
        this.plazas = plazas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
