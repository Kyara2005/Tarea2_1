public class Persona {
    String nombre;
    int edad;
    // Constructor sin parámetros
    Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }
    // Constructor con parámetros
    Persona(String nom, int edad1) {
        nombre = nom;
        edad = edad1;
    }
    //Metodo correr
    void correr() {
        System.out.println(nombre + " está corriendo y tiene "+edad);
    }
}

