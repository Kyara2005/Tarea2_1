public class PruebaProducto {
    public static void main(String[] args) {
        //Sin parámtros
        Producto producto1 = new Producto();
        System.out.println("Producto 1:");
        producto1.mostrarInfo();

        // Instancia con parámetros
        Producto producto2 = new Producto("Laptop", 1200.99, 5);
        System.out.println();
        System.out.println("Producto 2:");
        producto2.mostrarInfo();

    }
}

