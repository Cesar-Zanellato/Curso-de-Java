import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OlaMundoSwing extends JFrame {

    private static JLabel labelNome = new JLabel("Digite seu nome:");
    private static JLabel outputLabel = new JLabel();
    private static JTextField inputNome = new JTextField(25);
    private static JButton buttonNome = new JButton("Enviar");

    public static void main(String[] args) throws Exception {
        OlaMundoSwing window = new OlaMundoSwing();

        // Propriedades básicas da janela;
        window.setSize(500, 500);
        window.setVisible(true);
        window.setTitle("Olá Mundo");

        // Definindo posição;
        window.setLayout(new FlowLayout());
        // window.setLayout(new GridLayout(3,2)); // Linhas e Colunas;

        window.getContentPane().setBackground(new Color(100, 100, 200));
        inputNome.setForeground(new Color(0, 0, 0));

        labelNome.setFont(new Font("Calibri", Font.ITALIC, 18));

        window.getContentPane().add(labelNome);
        window.getContentPane().add(inputNome);
        // Linha Branca;
        // window.getContentPane().add(new JLabel());
        window.getContentPane().add(buttonNome);
        window.getContentPane().add(outputLabel);

        //configurando o Button;
        buttonNome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ){
                // função que trata o evento; 
                buttonClick(e);
            };
        });

        // Deixa do tamanho necessario para os itens;
        // window.pack(); 

        // Adicionando swing objetos;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Fim do main;
    };

    public static void buttonClick(ActionEvent e ){
        // Evento que acontece quando chamado o Botão;
        //JOptionPane.showMessageDialog(null, "Botão Funciona", "Oi", JOptionPane.INFORMATION_MESSAGE);

        String seuNome = inputNome.getText();
        String outputMensagem = "Olá " + seuNome;
        outputLabel.setText(outputMensagem);
    }
}
