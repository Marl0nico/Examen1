import Sistema_Transporte.*;

import javax.imageio.stream.ImageOutputStream;

public class Main {
    public static void main(String[] args) {
        //datos cliente 1
        //objeto sistema_de_transportes
        Sistema_de_transportes sistema1=new Sistema_de_transportes("El búho", "Viajando con alas");
        sistema1.mostrarDatos();
        //objetos pasajeros
        Pasajero pasajero1=new Pasajero();
        pasajero1.setNombrePasajero("Bernardo Silva");
        pasajero1.setNcédula(1709070856);
        pasajero1.setMétodoPago("Efectivo");
        pasajero1.mostrarDatos();
        //objeto ruta
        Ruta ruta1=new Ruta("Quito-Guayaquil", 20);
        Ruta ruta2=new Ruta();
        Ruta ruta3=new Ruta();
        Ruta ruta4=new Ruta("Quito-Riobamba", 17.5);
        ruta2.setNombreRuta("Quito-Tulcán");
        ruta2.setCosto(17.5);
        ruta2.mostrarDatos();
        ruta3.setNombreRuta("Quito-Puyo");
        ruta3.setCosto(15);
        ruta1.mostrarDatos();
        ruta3.mostrarDatos();
        ruta4.mostrarDatos();
        //objeto ticket
        Ticket ticket1=new Ticket("Normal", 92, 4);
        ticket1.mostrarDatos();
        //objeto normal
        Normal normal1=new Normal("Ventana", false, false, 0);
        normal1.mostrarDatos();
        Pasajero pasajero2=new Pasajero("Juan", 1574230231, "Efectivo");
        pasajero2.mostrarDatos();
        ruta2.mostrarDatos();
        Ticket ticket2=new Ticket("VIP",22.75, 1);
        ticket2.mostrarDatos();
    }
}