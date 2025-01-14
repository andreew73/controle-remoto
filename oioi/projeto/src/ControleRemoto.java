public class ControleRemoto implements Controlador {
    //variaveis
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    //gets e sets
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //coisas que não sei, provavelmente metodos

    @Override
    public void ligar() {
        this.setLigado(true);
    }


    @Override
    public void desligar() {
        this.setLigado(false);
    }


    @Override
    public void abrirMenu() {
        System.out.println("--------menu--------");
        System.out.println("está ligado? "+ this.getLigado());
        System.out.println("está tocando?"+ this.getTocando());
        System.out.print("volume :" + this.getVolume() +" ");
        for (int i = 0; i < this.getVolume(); i+=10){
            System.out.print("|");
        }System.out.println();
    }



    @Override
    public void fecharMenu() {
        System.out.println("fechando menu.......");
    }


    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }


    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
    }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0 ){
            this.setVolume(0);
        }
    }


    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }


    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }


    @Override
    public void pause() {
        if(this.getLigado() && getTocando()){
            this.setTocando(false);
        }
    }


}
