package Sistema_Transporte;
public class Pasajero extends Sistema_de_transportes{
    String nombrePasajero, métodoPago;
    int ncédula;
    public Pasajero() {
    }
    public Pasajero(String nombrePasajero, int ncédula, String métodoPago) {
        this.nombrePasajero = nombrePasajero;
        this.ncédula = ncédula;
        this.métodoPago = métodoPago;
    }
    public String getNombrePasajero() {
        return nombrePasajero;
    }
    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }
    public int getNcédula() {
        return ncédula;
    }
    public void setNcédula(int ncédula) {
        this.ncédula = ncédula;
    }
    public String getMétodoPago() {
        return métodoPago;
    }
    public void setMétodoPago(String métodoPago) {
        this.métodoPago = métodoPago;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Datos del pasajero");
        System.out.println("Nombre:"+this.getNombrePasajero());
        System.out.println("Número de cédula:"+this.getNcédula());
        System.out.println("Método de pago:"+this.getMétodoPago());
        System.out.println("-----------------------------------");
    }
}
