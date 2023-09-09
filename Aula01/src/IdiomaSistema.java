import java.util.Locale;

public class IdiomaSistema {
   public static void main(String[] args) {
        Locale localizacao = Locale.getDefault();
        System.out.println("O idioma do sistema é");
        System.out.println(localizacao.getDisplayLanguage()); // Imprime "Português"
    };
};
