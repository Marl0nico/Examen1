package Sistema_Transporte;
public class VIP extends Servicio{
    String serviciosAdicionales;
    int maletas;
    boolean maletAdicional;
    double costoAdicional, recargo;
    public VIP(String serviciosAdicionales, int maletas, boolean maletAdicional, double costoAdicional, double recargo) {
        this.serviciosAdicionales = serviciosAdicionales;
        this.maletas = maletas;
        this.maletAdicional = maletAdicional;
        this.costoAdicional = costoAdicional;
        this.recargo = recargo;
    }
    public VIP() {
    }
    public String getServiciosAdicionales() {
        return serviciosAdicionales;
    }
    public void setServiciosAdicionales(String serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
    public int getMaletas() {
        return maletas;
    }
    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }
    public boolean isMaletAdicional() {
        return maletAdicional;
    }
    public void setMaletAdicional(boolean maletAdicional) {
        this.maletAdicional = maletAdicional;
    }
    public double getCostoAdicional() {
        return costoAdicional;
    }
    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }
    public double getRecargo() {
        return recargo;
    }
    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
    public double recargoVIP(double valor){
        return valor*0.3;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Detalles del servicio VIP");
        System.out.println("Servicios adicionales escogidos para su confort durante el viaje:"+this.getServiciosAdicionales());
        System.out.println("Cantidad de maletas que posee (máximo 2):"+this.getMaletas());
        System.out.println("¿Trae consigo una maleta adicional?:"+this.isMaletAdicional());
        System.out.println("Costo adicional por el servicio:"+this.getCostoAdicional());
    }

}
