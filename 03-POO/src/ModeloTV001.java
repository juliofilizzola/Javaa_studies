import poo.classTV.ControleRemoto;
import poo.classTV.TV;

public class ModeloTV001 extends TV implements ControleRemoto {
    public final String MODELO = "TV001";
    
    public ModeloTV001 (int tamanho) {
        super(tamanho);
    }

    public void mudarCanal(int canal) {
        super.mudarCanal(canal);
    }

    public void aumentarVolume(int taxa) {
        super.aumentarVolume(taxa);
    }

    public void diminuirVolume(int taxa) {
        super.diminuirVolume(taxa);
    }

    public void ligar() {
        super.setLigada(true);
    }

    public void desligar() {
        super.setLigada(false);
    }
}
