package es.uv.eu.aplicacion1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Entornos de Usuario
 */
public class ListaPanel extends JPanel {

    private PeliculaModel peliculas;
    private JTextArea textArea;
    private JScrollPane scroll;

    public ListaPanel(PeliculaModel peliculas) {
        this.peliculas = peliculas;

        setLayout(new BorderLayout());
        textArea = new JTextArea(20, 60);
        textArea.setEditable(false);
        textArea.setBackground(Color.lightGray);
        textArea.setForeground(Color.black);
        textArea.setFont(new Font("Sans", Font.BOLD, 12));
        scroll = new JScrollPane(textArea);

        this.add(scroll, BorderLayout.CENTER);
        this.setVisible(true);

    }
    
    public void mostrar()
    {
        textArea.append(peliculas.toString());
    }
            

}
