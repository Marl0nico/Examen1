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
        //datos cliente 3
        Pasajero pasajero3=new Pasajero();
        pasajero3.setNombrePasajero("Carlos Benavides");
        pasajero3.setNcédula(1741203659);
        pasajero3.setMétodoPago("Transferencia");
        pasajero3.mostrarDatos();
        Ruta ruta3=new Ruta();
        ruta3.setNombreRuta("Quito-Puyo");
        ruta3.setCosto(15);
        ruta3.mostrarDatos();
        Ticket ticket3=new Ticket();
        ticket3.setTipoTicket("VIP");
        ticket3.setnPasajeros(4);
        double total1=(ruta3.getCosto()*1.3)*4;
        ticket3.setValorFinal(total1);
        ticket3.mostrarDatos();
        VIP vip2=new VIP();
        vip2.setServiciosAdicionales("Calefacción y wi-fi");
        vip2.setMaletas(1);
        vip2.setMaletAdicional(false);
        vip2.setCostoAdicional(0);
        vip2.setRecargo(ruta3.getCosto()*0.3);
        vip2.setRecargo(0);
        vip2.mostrarDatos();
        System.out.println("//////////////////////////////////////////");
        //datos cliente 4
        Pasajero pasajero4=new Pasajero("Karla Sánchez", 1759632008, "Tarjeta de débito");
        pasajero4.mostrarDatos();
        Ruta ruta4=new Ruta("Quito-Riobamba", 17.5);
        ruta4.mostrarDatos();
        double total3= ruta4.getCosto()*2;
        Ticket ticket4=new Ticket("Normal", total3, 2);
        ticket4.mostrarDatos();
        Normal normal2=new Normal("Pasillo", true, true, 5);
        normal2.mostrarDatos();
        System.out.println("//////////////////////////////////////////");
        //datos cliente 5
        Pasajero pasajero5=new Pasajero();
        pasajero5.setNombrePasajero("Marcela Guevara");
        pasajero5.setNcédula(1758759985);
        pasajero5.setMétodoPago("Tarjeta de crédito");
        pasajero5.mostrarDatos();
        Ruta ruta5=new Ruta();
        ruta5.setNombreRuta("Quito-Puyo");
        ruta5.setCosto(15);
        ruta5.mostrarDatos();
        Ticket ticket5=new Ticket();
        ticket5.setTipoTicket("Normal");
        ticket5.setnPasajeros(5);
        double total2=ruta5.getCosto()*5;
        ticket5.setValorFinal(total2);
        ticket5.mostrarDatos();
        Normal normal3=new Normal();
        normal3.setTipoAsiento("Adelante");
        normal3.setEspacioMaleta(true);
        normal3.setMaletAdicional(true);
        normal3.setCostoExtra(5);
        normal3.mostrarDatos();
        System.out.println("//////////////////////////////////////////");
        //datos cliente 6
        Pasajero pasajero6=new Pasajero("Adrián Gutierrez", 1758521140, "Efectivo");
        pasajero6.mostrarDatos();
        Ruta ruta6=new Ruta("Quito-Guayaquil", 20);
        ruta6.mostrarDatos();
        double total4=ruta6.getCosto()*1.3;
        Ticket ticket6=new Ticket("VIP", total4, 1);
        ticket6.mostrarDatos();
        double recargo2=ruta6.getCosto()*0.3;
        VIP vip3=new VIP("Calefacción y wi-fi", 2, true, 5, recargo2);
        vip3.mostrarDatos();
        System.out.println("//////////////////////////////////////////");
    }
}