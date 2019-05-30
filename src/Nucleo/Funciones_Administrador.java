package Nucleo;

import java.util.ArrayList;

public class Funciones_Administrador {

    private ArrayList<Vehiculos> vehiculos_ocasion;
    private ArrayList<Vehiculos> vehiculos_venta;
    private ArrayList<Usuario> clientes_registrados;

    public Funciones_Administrador() {
        vehiculos_ocasion = new ArrayList<>();
        vehiculos_venta = new ArrayList<>();
        clientes_registrados = new ArrayList<>();
    }

    public ArrayList<Vehiculos> getVehiculos_ocasion() {
        return vehiculos_ocasion;
    }

    public void setVehiculos_ocasion(ArrayList<Vehiculos> vehiculos_ocasion) {
        this.vehiculos_ocasion = vehiculos_ocasion;
    }

    public ArrayList<Vehiculos> getVehiculos_venta() {
        return vehiculos_venta;
    }

    public void setVehiculos_venta(ArrayList<Vehiculos> vehiculos_venta) {
        this.vehiculos_venta = vehiculos_venta;
    }

    public ArrayList<Usuario> getClientes_registrados() {
        return clientes_registrados;
    }

    public void setClientes_registrados(ArrayList<Usuario> clientes_registrados) {
        this.clientes_registrados = clientes_registrados;
    }


    //Añadir vehiculos al Array de vehiculos que están de ocasión
    public void añadirVehiculos(Vehiculos vh){
        if (vehiculos_ocasion.contains(vh)){
            System.out.println("Ya está registrado el vehiculo");
        } else {
            vehiculos_ocasion.add(vh);
            System.out.println("Registrado el vehiculo");
        }
    }

    //Eliminar vehiculos del Array de vehiculos que están de ocasión
    public void bajaVehiculos(Vehiculos vh){
        if(vehiculos_ocasion.contains(vh)){
            vehiculos_ocasion.remove(vh);
            System.out.println("Se ha eliminado el vehiculo");
        } else {
            System.out.println("No existe este vehiculo para eliminar");
        }
    }

    public void mostrarVehiculos(){
        for(int i = 0; i<vehiculos_ocasion.size(); i++){
            System.out.println(vehiculos_ocasion);
        }
    }

    //Añadir vehiculos que se han vendido
    public void añadirVehiculosVendidos(Vehiculos vh){
        if(vehiculos_venta.contains(vh)){
            System.out.println("Este vehículo ya ha sido vendido anteriormente");
        } else {
            vehiculos_venta.add(vh);
            System.out.println("Se ha vendido el vehiculo");
        }
    }

    public void registrarcliente(Usuario u){
        if(clientes_registrados.contains(u)){
            System.out.println("El usuario ya estaba registrado. No puede registrarse otra vez.");
        } else {
            clientes_registrados.add(u);
            System.out.println("Se ha registrado correctamente.");
        }
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "vehiculos_ocasion=" + vehiculos_ocasion + '}';
    }
}
