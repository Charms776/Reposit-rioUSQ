package ExercícioHerança;

import ExercícioHerança.Carro;
import ExercícioHerança.Moto;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 4);
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + ", Número de Portas: " + carro.getNumeroPortas());

        Moto moto = new Moto("Honda", "CBR 1000RR", 1000);
        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo() + ", Cilindrada: " + moto.getCilindrada() + "cc");
    }
}
