/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aumentosalario;

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
        float salarioInicial = 2000f;
        float aumento = (salarioInicial * 15.3f) / 100;
        float salarioFinal = salarioInicial + aumento;
        
        System.out.println("Seu novo salário é: R$ " + salarioFinal);
    }
    
}
