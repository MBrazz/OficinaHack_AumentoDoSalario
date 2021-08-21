/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aumentosalario;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class AumentoSalario {

   /*
    INICIO
    ENTRADA DE DADOS
    float salarioInicial
    float aumento = (salarioInicial * 15.3)/100
    float salarioFinal = salarioInicial + aumento
    PROCESSAMENTO (calculo)
    IMPRIMIR salarioFinal
    FIM
    */
    public static void main(String[] args) {
        System.out.println("Qual é o seu salário?");
        Scanner lerSalario = new Scanner(System.in);
                
        float salarioInicial = lerSalario.nextFloat();
        float aumento = (salarioInicial * 15.3f) / 100;
        float salarioFinal = salarioInicial + aumento;
        
        System.out.println("Seu salário inicial era: R$" + salarioInicial);
        System.out.println("O valor do aumento é: R$" + aumento);
        System.out.println("Seu novo salário é: R$" + salarioFinal);
    }
    
}
