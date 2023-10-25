package academy.devdojo.maratonajava;

import javax.swing.*;

public class ExemploSwing extends JFrame {

    public ExemploSwing() {
    JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("<html><body><h1>Olá, Mundo!</h1></body></html>");

    getContentPane().add(new JScrollPane(editorPane));

    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExemploSwing());
    }
}
