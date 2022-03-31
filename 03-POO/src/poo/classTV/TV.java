package poo.classTV;

public class TV {
    private int tamanho;
    private int canal;
    private int volume;
    private boolean ligada;

    public TV(int tamanho) {
        this.tamanho = tamanho;
        this.canal = canal;
        this.volume = volume;
        this.ligada = false;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void aumentarVolume(int volume) {
        this.volume += volume;
    }

    public void diminuirVolume(int taxa) {
        this.volume -= taxa;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }

}

