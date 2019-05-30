package Nucleo;

import java.time.LocalDate;

public class Vehiculos {

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private String color;
    private LocalDate fecha_matricula;
    private int km_recorridos;
    private int precio;

    public Vehiculos(String matricula, String marca, String modelo, int potencia, String color, int km_recorridos, int precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        //this.fecha_matricula = fecha_matricula;
        this.km_recorridos = km_recorridos;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(LocalDate fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    public int getKm_recorridos() {
        return km_recorridos;
    }

    public void setKm_recorridos(int km_recorridos) {
        this.km_recorridos = km_recorridos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
