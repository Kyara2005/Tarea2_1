public class Producto {
    String nombre;
    double precio;
    int cantidad;
    // Constructor sin parámetros
    public Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.cantidad = 0;
    }
    // Constructor con parámetros
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}


