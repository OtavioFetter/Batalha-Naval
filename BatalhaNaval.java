import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.function.Function;

public class BatalhaNaval {
    public static String[][] mostraMapaTime1(String time1, String[][] mapa1) {
        System.out.println(time1);
        for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                System.out.printf("%s ", mapa1[l][c]);
            }
            System.out.println();
        }
        return mapa1;
    }
    public static String[][] mostraMapaTime2(String time2, String[][] mapa2) {
        System.out.println(time2);
        for (int l = 0; l < 11; l++) {
            for (int c = 0; c < 11; c++) {
                System.out.printf("%s ", mapa2[l][c]);
            }
            System.out.println();
        }
        return mapa2;
    }
    public static String[][] barco1(String[][] mapa1, Scanner ler){
        boolean PortaAvioesB = false;
        boolean EncouracadosB = false;
        boolean CruzadoresB = false;
        boolean ContratorpedeirosB = false;
        for(int i=0; i<4; i++){
            System.out.println("\nQual barco deseja utilizar?\n \n1 - Porta-aviões(4 espaços)(1 unidade);\n2 - Encouraçados(3 espaços)(2 unidades);\n3 - Cruzadores(2 espaços)(3 unidades);\n4 - Contratorpedeiros(1 espaço)(4 unidades).\n");
            int barco = ler.nextInt();
            if(barco==1 && PortaAvioesB==false) {
                int cont=0;
                while (cont!=1) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10 && linha + 3 < 10) {
                            if (mapa1[linha][coluna].equals("B") || mapa1[linha + 1][coluna + 1].equals("B") || mapa1[linha + 2][coluna + 2].equals("B") || mapa1[linha + 3][coluna + 3].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                PortaAvioesB = true;
                                mapa1[linha][coluna] = "B";
                                mapa1[linha][coluna + 1] = "B";
                                mapa1[linha][coluna + 2] = "B";
                                mapa1[linha][coluna + 3] = "B";
                            }
                        } else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    } else if (orientacao == 2) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10 && linha + 3 < 10) {
                            if (mapa1[linha][coluna].equals("B") || mapa1[linha + 1][coluna + 1].equals("B") || mapa1[linha + 2][coluna + 2].equals("B") || mapa1[linha + 3][coluna + 3].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                PortaAvioesB = true;
                                mapa1[linha][coluna] = "B";
                                mapa1[linha+1][coluna] = "B";
                                mapa1[linha+2][coluna] = "B";
                                mapa1[linha+3][coluna] = "B";
                            }
                        } else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
            }
            else if(barco==2 && EncouracadosB==false) {
                int cont=0;
                while (cont!=2) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10) {
                            if (mapa1[linha][coluna].equals("B") || mapa1[linha + 1][coluna + 1].equals("B") || mapa1[linha + 2][coluna + 2].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa1[linha][coluna] = "B";
                                mapa1[linha][coluna+1] = "B";
                                mapa1[linha][coluna+2] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    } else if (orientacao == 2) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10) {
                            if (mapa1[linha][coluna].equals("B") || mapa1[linha + 1][coluna + 1].equals("B") || mapa1[linha + 2][coluna + 2].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa1[linha][coluna] = "B";
                                mapa1[linha+1][coluna] = "B";
                                mapa1[linha+2][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
                EncouracadosB = true;
            }
            else if(barco==3 && CruzadoresB==false) {
                int cont=0;
                while (cont!=3) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10) {
                            if (mapa1[linha][coluna].equals("B") || mapa1[linha + 1][coluna + 1].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa1[linha][coluna] = "B";
                                mapa1[linha][coluna+1] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                    else if(orientacao == 2){
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10) {
                            if (mapa1[linha][coluna].equals("B") || mapa1[linha + 1][coluna + 1].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa1[linha][coluna] = "B";
                                mapa1[linha+1][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
                CruzadoresB = true;
            }
            else if(barco==4 && ContratorpedeirosB==false) {
                int cont=0;
                while (cont!=4) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10) {
                            if (mapa1[linha][coluna].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa1[linha][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                    else if (orientacao == 2){
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10) {
                            if (mapa1[linha][coluna].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa1[linha][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
                ContratorpedeirosB = true;
            }
            else{
                i--;
            }
        }
        return mapa1;
    }

    public static String[][] barco2(String[][] mapa2, Scanner ler){
        boolean PortaAvioesB = false;
        boolean EncouracadosB = false;
        boolean CruzadoresB = false;
        boolean ContratorpedeirosB = false;
        for(int i=0; i<4; i++){
            System.out.println("\nQual barco deseja utilizar?\n \n1 - Porta-aviões(4 espaços)(1 unidade);\n2 - Encouraçados(3 espaços)(2 unidades);\n3 - Cruzadores(2 espaços)(3 unidades);\n4 - Contratorpedeiros(1 espaço)(4 unidades).\n");
            int barco = ler.nextInt();
            if(barco==1 && PortaAvioesB==false) {
                int cont=0;
                while (cont!=1) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10 && linha + 3 < 10) {
                            if (mapa2[linha][coluna].equals("B") || mapa2[linha + 1][coluna + 1].equals("B") || mapa2[linha + 2][coluna + 2].equals("B") || mapa2[linha + 3][coluna + 3].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                PortaAvioesB = true;
                                mapa2[linha][coluna] = "B";
                                mapa2[linha][coluna + 1] = "B";
                                mapa2[linha][coluna + 2] = "B";
                                mapa2[linha][coluna + 3] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    } else if (orientacao == 2) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10 && linha + 3 < 10) {
                            if (mapa2[linha][coluna].equals("B") || mapa2[linha + 1][coluna + 1].equals("B") || mapa2[linha + 2][coluna + 2].equals("B") || mapa2[linha + 3][coluna + 3].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                PortaAvioesB = true;
                                mapa2[linha][coluna] = "B";
                                mapa2[linha+1][coluna] = "B";
                                mapa2[linha+2][coluna] = "B";
                                mapa2[linha+3][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
            }
            else if(barco==2 && EncouracadosB==false) {
                int cont=0;
                while (cont!=2) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10) {
                            if (mapa2[linha][coluna].equals("B") || mapa2[linha + 1][coluna + 1].equals("B") || mapa2[linha + 2][coluna + 2].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa2[linha][coluna] = "B";
                                mapa2[linha][coluna + 1] = "B";
                                mapa2[linha][coluna + 2] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                    else if(orientacao == 2){
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10 && linha + 2 < 10) {
                            if (mapa2[linha][coluna].equals("B") || mapa2[linha + 1][coluna + 1].equals("B") || mapa2[linha + 2][coluna + 2].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa2[linha][coluna] = "B";
                                mapa2[linha+1][coluna] = "B";
                                mapa2[linha+2][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
                EncouracadosB = true;
            }
            else if(barco==3 && CruzadoresB==false) {
                int cont=0;
                while (cont!=3) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10) {
                            if (mapa2[linha][coluna].equals("B") || mapa2[linha + 1][coluna + 1].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa2[linha][coluna] = "B";
                                mapa2[linha][coluna+1] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                    else if (orientacao == 2) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10 && linha + 1 < 10) {
                            if (mapa2[linha][coluna].equals("B") || mapa2[linha + 1][coluna + 1].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa2[linha][coluna] = "B";
                                mapa2[linha+1][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
                CruzadoresB = true;
            }
            else if(barco==4 && ContratorpedeirosB==false) {
                int cont=0;
                while (cont!=4) {
                    System.out.println("Qual linha deseja posicionar seu barco? ");
                    int linha = ler.nextInt();
                    linha++;
                    System.out.println("Qual coluna deseja posicionar seu barco? ");
                    int coluna = ler.nextInt();
                    coluna++;
                    System.out.println("Deseja posicionar seu barco na horizontal(1) ou vertical(2)? ");
                    int orientacao = ler.nextInt();
                    if (orientacao == 1) {
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10) {
                            if (mapa2[linha][coluna].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa2[linha][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                    else if(orientacao == 2){
                        if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10) {
                            if (mapa2[linha][coluna].equals("B")) {
                                System.out.println("Local já escolhido");
                            } else {
                                mapa2[linha][coluna] = "B";
                                cont++;
                            }
                        }
                        else {
                            System.out.println("Local indisponivel");
                            cont--;
                        }
                    }
                }
                ContratorpedeirosB = true;
            }
            else{
                i--;
            }
        }
        return mapa2;
    }

    public static String[][] jogada1(String[][] mapa1, Scanner ler){
        String[][] mapa12 = {{" ","0","1","2","3","4","5","6","7","8","9"}, {"0", " "," "," "," "," "," "," "," "," "," "}, {"1", " "," "," "," "," "," "," "," "," "," "},{"2", " "," "," "," "," "," "," "," "," "," "},{"3", " "," "," "," "," "," "," "," "," "," "},{"4", " "," "," "," "," "," "," "," "," "," "},{"5", " "," "," "," "," "," "," "," "," "," "},{"6", " "," "," "," "," "," "," "," "," "," "},{"7", " "," "," "," "," "," "," "," "," "," "},{"8", " "," "," "," "," "," "," "," "," "," "},{"9"," "," "," "," "," "," "," "," "," "," "}};
        boolean validacao=false;
        while (validacao==false) {
            for (int l = 0; l < 11; l++) {
                for (int c = 0; c < 11; c++) {
                    System.out.printf("%s ", mapa12[l][c]);
                }
                System.out.println();
            }
            System.out.println("Qual linha deseja atacar? ");
            int linha = ler.nextInt();
            linha++;
            System.out.println("Qual coluna deseja atacar? ");
            int coluna = ler.nextInt();
            coluna++;
            if (linha >= 1 && linha < 10 && coluna >= 1 && coluna < 10) {
                if (mapa1[linha][coluna].equals("B")) {
                    System.out.println("Você atacou um barco!");
                    mapa12[linha][coluna]="!";
                    validacao=true;
                } else {
                    System.out.println("Você atacou a água!");
                    mapa12[linha][coluna]="X";
                    validacao=true;
                }
            } else {
                System.out.println("Local indisponivel");
            }
        }
        return mapa12;
    }

    public static void main(String[] args){
        String[][] mapa1 = {{" ","0","1","2","3","4","5","6","7","8","9"}, {"0", " "," "," "," "," "," "," "," "," "," "}, {"1", " "," "," "," "," "," "," "," "," "," "},{"2", " "," "," "," "," "," "," "," "," "," "},{"3", " "," "," "," "," "," "," "," "," "," "},{"4", " "," "," "," "," "," "," "," "," "," "},{"5", " "," "," "," "," "," "," "," "," "," "},{"6", " "," "," "," "," "," "," "," "," "," "},{"7", " "," "," "," "," "," "," "," "," "," "},{"8", " "," "," "," "," "," "," "," "," "," "},{"9"," "," "," "," "," "," "," "," "," "," "}};
        String[][] mapa2 = {{" ","0","1","2","3","4","5","6","7","8","9"}, {"0", " "," "," "," "," "," "," "," "," "," "}, {"1", " "," "," "," "," "," "," "," "," "," "},{"2", " "," "," "," "," "," "," "," "," "," "},{"3", " "," "," "," "," "," "," "," "," "," "},{"4", " "," "," "," "," "," "," "," "," "," "},{"5", " "," "," "," "," "," "," "," "," "," "},{"6", " "," "," "," "," "," "," "," "," "," "},{"7", " "," "," "," "," "," "," "," "," "," "},{"8", " "," "," "," "," "," "," "," "," "," "},{"9"," "," "," "," "," "," "," "," "," "," "}};
        Scanner ler = new Scanner(System.in);
        System.out.print("Deseja enfrentar o computador ou com outro jogador? Caso queira jogar com o computador clique C e caso outro jogador clique J: ");
        String resposta = ler.next();
        if(resposta.equals("c") || resposta.equals("C")){
            System.out.println("\nVocê possui os seguintes barcos:\n \n1 Porta-aviões(4 espaços);\n2 Encouraçados(3 espaços);\n3 Cruzadores(2 espaços);\n4 Contratorpedeiros(1 espaço).");
            System.out.println("\n Digite um nome para o seu time: ");
            String time1 = ler.next();
        }
        else if(resposta.equals("j") || resposta.equals("J")){
            System.out.println("\nVocês possuem os seguintes barcos:\n \n1 Porta-aviões(4 espaços);\n2 Encouraçados(3 espaços);\n3 Cruzadores(2 espaços);\n4 Contratorpedeiros(1 espaço).");
            System.out.println("\n Digite um nome para o primeiro time: ");
            String time1 = ler.next();
            System.out.println("\n Digite um nome para o segundo time: ");
            String time2 = ler.next();
            System.out.println("\nO primeiro a jogar é o "+time1);
            System.out.print("\nEstá pronto? Se sim digite qualquer letra: ");
            String respostaPronto = ler.next();
            System.out.println(" ");
            mostraMapaTime1(time1, mapa1);
            barco1(mapa1, ler);
            mostraMapaTime1(time1, mapa1);
            System.out.println("\nVez do jogador "+time2);
            System.out.print("\nEstá pronto? Se sim digite qualquer letra: ");
            respostaPronto = ler.next();
            mostraMapaTime2(time2, mapa2);
            barco2(mapa2, ler);
            mostraMapaTime2(time2, mapa2);
        }
    }
}