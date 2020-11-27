/**
 * Classe principal utilizando o padrão Strategy para formatação de textos
 * 
 * @author Thalyta Barbosa do Nascimento
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.println();
        
        //Imprimi texto em caixa alta
        Texto textoCA = new CaixaAlta(texto);
        System.out.println(textoCA.getTexto());

        //Imprimi texto em caixa baixa
        Texto textoCB = new CaixaBaixa(texto);
        System.out.println(textoCB.getTexto());
        
        //Imprimi texto em caixa baixa
        Texto textoN = new Negrito(texto);
        System.out.println(textoN.getTexto());        

        //Imprimi texto em caixa baixa
        Texto textoI = new Italico(texto);
        System.out.println(textoI.getTexto());        


    }
}
