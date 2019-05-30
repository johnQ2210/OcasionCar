import Nucleo.Aplicacion;
import Nucleo.Motocicleta;
import Nucleo.Turismos;
import Nucleo.Vehiculos;

public class Prueba_Comando {
    public static void main(String []args){

        Motocicleta moto1 = new Motocicleta( "1234ZJS", "Yamaha", "V3", 100, "negro", 124, 1200, "normal", 6);
        Turismos turismo1 = new Turismos("2345FSD", "Audi", "A5", 120, "negro", 2030, 24000,"Gasolina", "Manual", 5, 5);

        Aplicacion ap1 = new Aplicacion();

        ap1.añadirVehiculos(turismo1);
        ap1.añadirVehiculos(moto1);

        ap1.bajaVehiculos(turismo1);
        ap1.bajaVehiculos(turismo1);

        ap1.añadirVehiculosVendidos(turismo1);
        ap1.añadirVehiculosVendidos(turismo1);


    }
}
