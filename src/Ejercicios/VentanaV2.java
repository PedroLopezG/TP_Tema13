package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaV2 extends MouseAdapter{
    JFrame ventana;
    int n;

    public VentanaV2(int n) {
        this.n = n;
        ventana = new JFrame(String.valueOf(n));
        ventana.setSize(200,200);
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed en Ventana numero " + n + " en X:" + e.getX() + " Y:" + e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased en Ventana numero " + n + " en X:" + e.getX() + " Y:" + e.getY());
            }
        });
        ventana.setVisible(true);
    }

    public void setLocation(int x, int y) {
        ventana.setLocation(x,y);
    }
}
