import java.util.Scanner;

public class Automato {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean pMoeda;

        iniciar();
        System.out.println("\nInsira a moeda, basta escrever 'true' dessa forma\nMoeda: ");
        pMoeda = input.nextBoolean();
        q0(pMoeda);
    }
    
    public static void iniciar(){
        System.out.println("\n[INICIO]\n\n -----| Maquina de Lavar Roupas |-----\n");
    }

    public static void q0(Boolean palavraMoeda){
        Scanner inputMoeda = new Scanner(System.in);
        System.out.println("\n -> Estado q0 (MOEDA)");
        if(palavraMoeda == true){
           q1(palavraMoeda);
        }else{
            System.out.println("\nPor favor, insira a moeda:");
            Boolean coin;
            coin = inputMoeda.nextBoolean();
            palavraMoeda = coin;
            q0(palavraMoeda);
        }
    }

    public static void q1(Boolean palavraSabao){
        Scanner inputSabao = new Scanner(System.in);
        System.out.println("\n Estado q0 [MOEDA] -> Estado q1 (SABAO)");
        System.out.println("\nInsira o sabao, basta escrever 'true' dessa forma\nSabao: ");
        palavraSabao = inputSabao.nextBoolean();

        if(palavraSabao == true){
            q2();
        }else{
            System.out.println("\nPor favor, insira o sabao:");
            Boolean coin2;
            coin2 = inputSabao.nextBoolean();
            if(coin2 == false){
                q1(palavraSabao);
            }else if(coin2 == true){
                q2();
            }
        }
    }

    public static void q2(){
        System.out.println("\nEstado q0 [MOEDA] -> Estado q1 [SABAO] -> Estado q2 (LAVAR)");
        q3();
    }

    public static void q3(){
        System.out.println("\nEstado q0 [MOEDA] -> Estado q1 [SABAO] -> Estado q2 [LAVAR] -> Estado q3 (CENTRIFUGAR)");
        qF();
    }

    public static void qF(){
        System.out.println("\nEstado q0 [MOEDA] -> Estado q1 [SABAO] -> Estado q2 [LAVAR] -> Estado q3 [CENTRIFUGAR]-> Estado qF (SECAR/FINAL)");
        System.out.println("\n\n[FINAL]\n");
    }
}