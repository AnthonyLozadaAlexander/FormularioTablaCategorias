package Clases;

public class Vehiculo {
    private String idAuto;
    private String marca;
    private String propietario;
    private String numeroPatente;
    private String categoria;
    private double importePagar;

    public Vehiculo(String idAuto, String marca, String propietario, String numeroPatente, String categoria,
                    double importePagar) {
        this.idAuto = idAuto;
        this.marca = marca;
        this.propietario = propietario;
        this.numeroPatente = numeroPatente;
        this.categoria = categoria;
        this.importePagar = importePagar;
    }

    public String getIdAuto() {
        return idAuto;
    }

    public String getMarca() {
        return marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getNumeroPatente() {
        return numeroPatente;
    }

    public double getImportePagar() {
        return importePagar;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getImporte(){
        return importePagar;
    }

    public String mostrarInfo(){
        return "ID Auto: " + idAuto + "\n" +
               "Marca: " + marca + "\n" +
               "Propietario: " + propietario + "\n" +
               "Número de Patente: " + numeroPatente + "\n" +
               "Categoría: " + categoria + "\n" +
               "Importe a Pagar: $" + importePagar + "\n";
    }
}
