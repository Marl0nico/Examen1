package Sistema_Transporte;
public class Ticket extends Ruta{
    String tipoTicket;
    double valorFinal;
    int nPasajeros;
    public Ticket(String tipoTicket, double valorFinal, int nPasajeros) {
        this.tipoTicket = tipoTicket;
        this.nPasajeros = nPasajeros;
        this.valorFinal = valorFinal;
    }
    public Ticket() {
    }
    public String getTipoTicket() {
        return tipoTicket;
    }
    public void setTipoTicket(String tipoTicket) {
        this.tipoTicket = tipoTicket;
    }
    public int getnPasajeros() {
        return nPasajeros;
    }
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }
    public double getValorFinal() {
        return valorFinal;
    }
    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    public void mostrarDatos(){
        System.out.println("Detalles de ticket comprado");
        System.out.println("Tipo de ticket:"+this.getTipoTicket());
        System.out.println("Valor final a pagar:"+this.getValorFinal());
        System.out.println("Número de pasajeros válidos para este ticket:"+this.getnPasajeros());
        System.out.println("------------------------------------------------------------------");
    }

}
