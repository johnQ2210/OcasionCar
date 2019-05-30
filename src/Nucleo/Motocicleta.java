package Nucleo;

import java.time.LocalDate;

public class Motocicleta extends Vehiculos {

    private String tipo;
    private int cilindrada;

    public Motocicleta(String matricula, String marca, String modelo, int potencia, String color,  int km_recorridos, int precio, String tipo, int cilindrada) {
        super(matricula, marca, modelo, potencia, color,  km_recorridos, precio);
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "tipo='" + tipo + '\'' + ", cilindrada=" + cilindrada + '}';
    }
}
