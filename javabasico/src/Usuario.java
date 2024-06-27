public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada?: " + smartTv.ligada);
        System.out.println("Qual canal está?: " + smartTv.canal);
        System.out.println("Qual o volume da TV?: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume? " + smartTv.volume);

        /*Escolha um canal desejado*/
        smartTv.escolherCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

//        Mudar canal 1 por 1;
        smartTv.mudarCanal();
        System.out.println("Canal atual: " + smartTv.canal);






    }

}
