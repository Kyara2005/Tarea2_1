public class PruebaPelicula {
    public static void main(String[] args){
        Pelicula peli1= new Pelicula();
        Pelicula peli2 = new Pelicula("La princesa y el sapo",2009);
        System.out.println("Pelicula 1: ");
        peli1.mostrarInfo();
        System.out.println("Pelicula 2: ");
        peli2.mostrarInfo();


    }
}
