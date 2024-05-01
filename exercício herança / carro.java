package ExercícioHerança;

public class Carro extends Veiculo {
 private int NumeroPortas;

 public Carro(String marca, String modelo, int NumeroPortas) {
     super(marca, modelo);
     this.NumeroPortas = NumeroPortas;
 }

 public int getNumeroPortas() {
     return NumeroPortas;
 }

 public void setNumeroPortas(int NumeroPortas) {
     this.NumeroPortas = NumeroPortas;
 }
}
