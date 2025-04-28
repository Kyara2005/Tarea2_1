public class PruebaCarro {
    public static void main(String[] args){
        Carros carro1 = new Carros("Amarillo","Nissan");
        Carros carro2 = new Carros("Negro","Hyunda");
        Carros carro3 = new Carros("Morado","Chevrolet");
        //Llamar al metodo sin problema
        carro1.mostrarInfo();
        carro2.mostrarInfo();
        carro3.mostrarInfo();
    }
}

