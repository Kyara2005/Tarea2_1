public class Pelicula{
    String titulo;
    int año_creacion;
    //Sin parametros
    public Pelicula(){
        this.titulo = "Desconocido";
        this.año_creacion =0;
    }
    //Parametros
    public Pelicula(String titulo, int Año_creacion){
        this.titulo = titulo;
        this.año_creacion = 2016;
    }
    public void mostrarInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("año de creación: "+año_creacion);
        System.out.println("-------------------");
    }

}
