/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudando;

/**
 *
 * @author cesar
 */
public class ManipulandoTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declarando um tipo int
        int idadeInt = 17;
        
        // Alterando o tipo int para string
        String valorString = Integer.toString(idadeInt);
        
        // Mostrando o resultado
        System.out.println(valorString);
        
   /* ------------------------------------------------------ */        
        
        // Declarando um tipo string
        String idadeString = "17";
        
        // Alterando o tipo string para int
        int valorInt = Integer.parseInt(idadeString);
        
        // Mostrando o resultado
        System.out.println(valorInt);
                
   /* ------------------------------------------------------ */
        
        // Declarando um tipo string
        String dado = "17.6";
        
        // Alterando o tipo string para float
        float vlr = Float.parseFloat(dado);
        
        // Mostrando o resultado
        System.out.println(vlr);
    }
    
}
