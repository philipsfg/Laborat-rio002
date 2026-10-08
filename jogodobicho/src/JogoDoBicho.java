import java.util.*;

public class JogoDoBicho {
    Random random = new Random();
    private int[] aposta;

    String[] bixos = {"Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo",
            "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão",
            "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca"};

    public String pegarBicho(String num){
        int numero = Integer.parseInt(num);

        if(numero > 25 || numero < 0){
            System.out.println("O número não está entre o esperado!");
            return "Nada";
        }
        else{
            return bixos[numero - 1];
        }
    }

    public int[] fazAposta(){
        int num1 = random.nextInt(1, 25);
        int num2 = random.nextInt(1, 25);
        int num3 = random.nextInt(1, 25);
        int num4 = random.nextInt(1, 25);
        int num5 = random.nextInt(1, 25);
        int[] apostarandom = {num1, num2, num3, num4, num5};
        Arrays.sort(apostarandom);

        this.aposta = apostarandom;
        return apostarandom;
    }


    public String[] imprimeAposta(int[] aposta) {
        int[] naoRepetido = new int[5];
        int quantidade = 0;

        for (int i = 0; i < aposta.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (aposta[i] == aposta[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                naoRepetido[quantidade] = aposta[i];
                quantidade++;
            }
        }

        String[] resultados = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            resultados[i] = bixos[naoRepetido[i] - 1];
        }

        return resultados;
    }




}
