public class SmartTv {

    boolean ligada = false;
    int canal = 2;
    int volume = 30;

    //Métodos Canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void abaixarCanal(){
        canal--;
    }

    //MÈtodos do Volume
    public void aumentarVolume (){
        volume ++;
    }
    public void diminuirVolume (){
        volume --;
    }

    //Métodos de estado da televisãi
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
 
}