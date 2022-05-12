package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaV1 extends JFrame implements MouseListener {
    JFrame ventana;
    int n;
    public VentanaV1(int n) {
        this.n = n;
        ventana = new JFrame(String.valueOf(n));
        ventana.setSize(200,200);
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.addMouseListener(this);
        ventana.setVisible(true);


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed en Ventana numero " + n + " en X:" + e.getX() + " Y:" + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased en Ventana numero " + n + " en X:" + e.getX() + " Y:" + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void setLocation(int x, int y) {
        ventana.setLocation(x,y);
    }
}
