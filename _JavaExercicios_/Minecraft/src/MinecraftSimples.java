import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinecraftSimples extends JFrame implements ActionListener {
    private final int larguraJanela = 800;
    private final int alturaJanela = 600;
    private Timer timer;

    public MinecraftSimples() {
        setTitle("Minecraft Simples");
        setSize(larguraJanela, alturaJanela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        timer = new Timer(1000 / 60, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int x = 0; x < larguraJanela; x += 32) {
            for (int y = 0; y < alturaJanela; y += 32) {
                g.setColor(Color.GRAY);
                g.fillRect(x, y, 32, 32);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, 32, 32);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MinecraftSimples minecraft = new MinecraftSimples();
            minecraft.setVisible(true);
        });
    }
}