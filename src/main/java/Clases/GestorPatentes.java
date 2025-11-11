package Clases;
import java.util.ArrayList;

public class GestorPatentes {
    private ArrayList<Vehiculo> listVehiculos;

    public GestorPatentes(){
        listVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        listVehiculos.add(vehiculo);
    }

    public String mostrarVehiculos(){
        StringBuilder info = new StringBuilder();
        info.append("-----Vehiculos Registrados-----\n");

        for(Vehiculo v : listVehiculos){
            info.append(v.mostrarInfo()).append("\n");
        }

        return info.toString();
    }

    public void calcularPorCategoria(String categoria){

        double totalUtilidad = 0, totalDiseño = 0,
                totalPlanta = 0, totalInvencion = 0;

        // foreach para recorrer la lista de vehiculos
        for(Vehiculo v : listVehiculos){
            String opcionCategoria = v.getCategoria();
            double Importe = v.getImporte();

            switch(opcionCategoria){
                case "Utilidad" -> totalUtilidad = totalUtilidad + Importe;
                case "Diseño" -> totalDiseño = totalDiseño + Importe;
                case "Planta" -> totalPlanta = totalPlanta + Importe;
                case "Invención" -> totalInvencion = totalInvencion + Importe;
            }
        }

        
    }

}
