/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estudando.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author cesar
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width + " X " + d.height);
    }
}
