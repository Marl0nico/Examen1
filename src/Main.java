import Sistema_Transporte.*;
import javax.imageio.stream.ImageOutputStream;
public class Main {
    public static void main(String[] args) {
        //datos cliente 1
        //objeto sistema_de_transportes
        Sistema_de_transportes sistema1 = new Sistema_de_transportes("El búho", "Viajando con alas");
        sistema1.mostrarDatos();
        //objetos pasajeros
        Pasajero pasajero1 = new Pasajero();
        pasajero1.setNombrePasajero("Bernardo Silva");
        pasajero1.setNcédula(1709070856);
        pasajero1.setMétodoPago("Efectivo");
        pasajero1.mostrarDatos();
        //objeto ruta
        Ruta ruta1=new Ruta();
        ruta1.setNombreRuta("Quito-Guayaquil");
        ruta1.setCosto(20);
        ruta1.mostrarDatos();
        //objeto ticket
        Ticket ticket1=new Ticket();
        ticket1.setTipoTicket("Normal");
        ticket1.setnPasajeros(1);
        ticket1.setValorFinal(20);
        ticket1.mostrarDatos();
        //objeto normal
        Normal normal1=new Normal();
        normal1.setTipoAsiento("Ventana");
        normal1.setEspacioMaleta(true);
        normal1.setMaletAdicional(false);
        normal1.setCostoExtra(0);
        normal1.mostrarDatos();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        //datos cliente 2
        Pasajero pasajero2=new Pasajero("Juan Fernandez", 1574230231, "Efectivo");
        pasajero2.mostrarDatos();
        Ruta ruta2=new Ruta("Quito-Tulcán", 17.5);
        ruta2.mostrarDatos();
        double total=(ruta2.getCosto()*1.3)*2;
        Ticket ticket2=new Ticket("VIP", total, 2);
        ticket2.mostrarDatos();
        double recargo=ruta2.getCosto()*0.3;
        VIP vip1=new VIP("Calefacción y wi-fi", 2, true, 5, recargo);
        vip1.mostrarDatos();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
    }
}