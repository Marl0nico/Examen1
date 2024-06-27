package Sistema_Transporte;
public class Ruta extends Sistema_de_transportes{
    String nombreRuta;
    double costo;
    public Ruta(String nombreRuta, double costo) {
        this.nombreRuta = nombreRuta;
        this.costo = costo;
    }
    public Ruta() {
    }
    public String getNombreRuta() {
        return nombreRuta;
    }
    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Información de la ruta");
        System.out.println("Ruta escogida:"+this.getNombreRuta());
        System.out.println("Costo de la ruta:"+this.getCosto());
        System.out.println("-----------------------------------");
    }
}
