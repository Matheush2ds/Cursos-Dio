public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        //Métodos Volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        //Métodos TV (Ligada ou Desligada, VOlume e Canal)
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        System.out.println("Tv ligada?: " + smartTv.ligada);

        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada?: " + smartTv.ligada);

    }  
}
