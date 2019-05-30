package Nucleo;

import java.time.LocalDate;

public class Turismos extends Automovil{

    private int puertas;

    public Turismos(String matricula, String marca, String modelo, int potencia, String color,  int km_recorridos, int precio, String combustible, String cambio, int plazas, int puertas) {
        super(matricula, marca, modelo, potencia, color, km_recorridos, precio, combustible, cambio, plazas);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
