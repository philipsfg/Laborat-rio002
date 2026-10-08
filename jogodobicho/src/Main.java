import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String bixo;
        int[] aposta;
        JogoDoBicho my = new JogoDoBicho();

        String numeroAposta = input.nextLine();

        bixo = my.pegarBicho(numeroAposta);

        if(!bixo.equals("Nada")) {
            System.out.println(bixo);
        }

        aposta = my.fazAposta();
        System.out.println(Arrays.toString(aposta));

        String[] resultado = my.imprimeAposta(aposta);
        System.out.println(Arrays.toString(resultado));
    }
}