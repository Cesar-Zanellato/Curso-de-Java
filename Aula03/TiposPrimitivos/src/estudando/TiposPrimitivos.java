/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudando;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando as Variaveis;
        Scanner teclado = new Scanner(System.in);
        String nome;
        float nota;
        int idade;
        
        // Pegando os dados
        System.out.print("Digite o nome do aluno: ");
        nome = teclado.nextLine();
        System.out.print("Digite a idade do aluno: ");
        idade = teclado.nextInt();
        System.out.print("Digite a nota do aluno: ");
        nota = teclado.nextFloat();
        
        // Mostrando na tela
        System.out.printf("O aluno %s de %d anos, teve a nota: %.2f \n", nome, idade, nota);
    }
    
}
