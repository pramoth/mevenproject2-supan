/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th.co.geniustree.test.mavenproject2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JLabel;

/**
 *
 * @author pramoth
 */
public class Car extends JLabel {

    Color color;

    public Car(String text, Color color) {
        super(text);
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(color);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = new Rectangle(0, 0, 20, 20);
        g2.fill(r);
        g2.dispose();
    }

}
