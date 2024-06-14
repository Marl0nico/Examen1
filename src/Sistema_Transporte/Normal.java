package Sistema_Transporte;
public class Normal extends Servicio{
    String tipoAsiento;
    boolean espacioMaleta, maletAdicional;
    double costoExtra;
    public Normal(String tipoAsiento, boolean espacioMaleta, boolean maletAdicional, double costoExtra) {
        this.tipoAsiento = tipoAsiento;
        this.espacioMaleta = espacioMaleta;
        this.maletAdicional = maletAdicional;
        this.costoExtra = costoExtra;
    }
    public Normal() {
    }
    public String getTipoAsiento() {
        return tipoAsiento;
    }
    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }
    public boolean isEspacioMaleta() {
        return espacioMaleta;
    }
    public void setEspacioMaleta(boolean espacioMaleta) {
        this.espacioMaleta = espacioMaleta;
    }
    public boolean isMaletAdicional() {
        return maletAdicional;
    }
    public void setMaletAdicional(boolean maletAdicional) {
        this.maletAdicional = maletAdicional;
    }
    public double getCostoExtra() {
        return costoExtra;
    }
    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Detalles del servicio normal");
        System.out.println("Tipo de asiento escogido:"+this.getTipoAsiento());
        System.out.println("¿Trae consigo una maleta?:"+this.isEspacioMaleta());
        System.out.println("¿Trae consigo una maleta adicional?:"+this.isMaletAdicional());
        System.out.println("Costo extra por servicio:"+this.getCostoExtra());
        System.out.println("------------------------------------------------------------");
    }
}
