package ExercícioHerança;

public class Veiculo {
    private String Marca;
    private String Modelo;

    public Veiculo(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
}
