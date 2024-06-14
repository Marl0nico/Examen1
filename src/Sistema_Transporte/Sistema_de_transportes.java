package Sistema_Transporte;
public class Sistema_de_transportes {
    //atributos
    String nombre;
    String eslogan;
    //constructor vacío
    public Sistema_de_transportes() {
    }
//constructor con parámetros
    public Sistema_de_transportes(String nombre, String eslogan) {
        this.nombre = nombre;
        this.eslogan = eslogan;
    }
    //setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEslogan() {
        return eslogan;
    }
    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }
    public void mostrarDatos(){
        System.out.println("Sistema de transportes El Búho");
        System.out.println("Nombre:"+this.getNombre());
        System.out.println("Eslogan:"+this.getEslogan());
        System.out.println("------------------------------");
    }
}
