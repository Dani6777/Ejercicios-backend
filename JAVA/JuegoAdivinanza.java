import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JuegoAdivinanza extends JFrame {
    private int numeroAdivinanza;
    private JTextField campoTexto;
    private JTextArea areaTexto;

    public JuegoAdivinanza() {
        super("Juego de Adivinanza");

        // Generar número aleatorio
        Random random = new Random();
        numeroAdivinanza = random.nextInt(100) + 1;

        // Configurar la interfaz gráfica
        campoTexto = new JTextField(10);
        areaTexto = new JTextArea(10, 30);
        areaTexto.setEditable(false);

        JButton botonAdivinar = new JButton("Adivinar");
        botonAdivinar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adivinarNumero();
            }
        });

        // Configurar el diseño de la interfaz
        setLayout(new FlowLayout());
        add(new JLabel("Adivina el número (1-100):"));
        add(campoTexto);
        add(botonAdivinar);
        add(new JScrollPane(areaTexto));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    private void adivinarNumero() {
        try {
            int intento = Integer.parseInt(campoTexto.getText());

            if (intento == numeroAdivinanza) {
                areaTexto.append("¡Correcto! Has adivinado el número.\n");
                reiniciarJuego();
            } else if (intento < numeroAdivinanza) {
                areaTexto.append("Demasiado bajo. Inténtalo de nuevo.\n");
            } else {
                areaTexto.append("Demasiado alto. Inténtalo de nuevo.\n");
            }
        } catch (NumberFormatException e) {
            areaTexto.append("Por favor, ingresa un número válido.\n");
        }

        campoTexto.setText("");
    }

    private void reiniciarJuego() {
        Random random = new Random();
        numeroAdivinanza = random.nextInt(100) + 1;
        areaTexto.append("Nuevo juego iniciado. Adivina un nuevo número.\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JuegoAdivinanza();
            }
        });
    }
}