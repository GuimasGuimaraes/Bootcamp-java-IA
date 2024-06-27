import java.util.Scanner;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;


    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume (){
        volume++;
    }

    public void diminuirVolume (){
        volume--;
    }

    public void mudarCanal(){
        canal++;
    }

    public void escolherCanal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o canal desejado: ");
        canal = scanner.nextInt();

    }

}
