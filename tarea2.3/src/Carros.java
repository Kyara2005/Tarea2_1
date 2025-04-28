public class Carros {
    String color;
    String marca;
    public Carros(String color, String marca){
        this.color = color;
        this.marca = marca;
    }
    public void mostrarInfo(){
        System.out.println("Color del carro: "+color+ " y su marca es "+marca);
    }
}


