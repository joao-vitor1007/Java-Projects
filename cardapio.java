import javax.swing.JOptionPane;

public class ExemploWhile {
    public static void main(String[] args) {
        String cardapio = "1 - Hamburguer/n" + "2 - Cachorro quente/n" + "3 - Pizza/n" + "4 - Linguiça toscana/n" + "5 - Pão De alho/n" + "6 - Tchau/n";

        int op = 0;
        
        while(op !=6){
            op = Integer.parseInt((JOptionPane.showInputDialog(cardapio)));
            switch (op){
            case 1: JOptionPane.showMessageDialog(null, "Hamburguer"); break;
            case 2: JOptionPane.showMessageDialog(null, "Cachorro quente");break;
            case 3: JOptionPane.showMessageDialog(null, "Pizza");break;
            case 4: JOptionPane.showMessageDialog(null, "Linguiça toscana");break;
            case 5: JOptionPane.showMessageDialog(null, "Pão De alho");break;
            case 6: JOptionPane.showMessageDialog(null, "Tchau");break;
            }
        }

    }
}
