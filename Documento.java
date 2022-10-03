import java.util.Scanner;

public class Documento {
    public void Documento(){
    System.out.println("Digite a string inicial: ");
    Scanner stringInicialScanner = new Scanner(System.in);
    String stringInicial = stringInicialScanner.nextLine();
    System.out.println("Digite a string desejada: ");
    Scanner stringDesejada = new Scanner(System.in);
    String stringDesejadas = stringDesejada.nextLine();
    System.out.println("Digite o número de operações: ");
    Scanner input = new Scanner(System.in);
    int number1;        //soma de number1 e number2
    number1 = input.nextInt();
    int contador = -1;
    int Tamanho;
    int possibilidade = 0;
    int Tamanhob;
    Tamanho = stringInicial.length();
    Tamanhob = stringDesejadas.length();

    if (stringInicial.length() <= stringDesejadas.length()){
        for (int i = 0; i < Tamanho; i++){
            contador = contador + 1;
    
                if (stringInicial.charAt(contador) == stringDesejadas.charAt(contador))
                {
    
                } else {
                    possibilidade = possibilidade + 1;
                }
    
                if (contador == (Tamanho - 1) && stringInicial.length() < stringDesejadas.length()){
                    possibilidade = possibilidade + (stringDesejadas.length() - stringInicial.length());
                } 
        }
        if (number1 == possibilidade){
            System.out.println(possibilidade + " possibilidades");
    
            System.out.println("sim"); }
        else {
            System.out.println(possibilidade + " possibilidades");
            System.out.println("não");
        }
    } else {

        for (int i = 0; i < Tamanhob; i++){
            contador = contador + 1;
    
                if (stringDesejadas.charAt(contador) == stringInicial.charAt(contador))
                {
    
                } else {
                    possibilidade = possibilidade + 1;
                }
    
                if (contador == (Tamanhob - 1) && stringDesejadas.length() < stringInicial.length()){
                    possibilidade = possibilidade + (stringInicial.length() - stringDesejadas.length());
                } 
        }
        if (number1 == possibilidade){
            System.out.println(possibilidade + " possibilidades");
    
            System.out.println("sim"); }
        else {
            System.out.println(possibilidade + " possibilidades");
            System.out.println("não");
        }

    }

}
}
