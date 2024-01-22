/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estudando.idiomasistema;

import java.util.Locale;

/**
 *
 * @author cesar
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale localizacao = Locale.getDefault();
        System.out.println("O idioma do Sistema é ");
        System.out.println(localizacao.getDisplayLanguage());
    }
}
