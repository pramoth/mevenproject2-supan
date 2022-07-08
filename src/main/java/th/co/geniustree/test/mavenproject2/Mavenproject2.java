package th.co.geniustree.test.mavenproject2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author pramoth
 */
public class Mavenproject2 {
    //composition ( has-a )
    // Generalization (is-a )

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        Container contentPane = f.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("A"));
        contentPane.add(new JButton("B"));
        contentPane.add(new JButton("CCC"));

        Car car1 = new Car("Hello car1",Color.BLUE);
        contentPane.add(car1); // instanciate
        car1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click on car 1");
            }
            
        });
        

        Car car2 = new Car("Hello car2",Color.RED);
        car2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("click on car 2");
            }
            
        });
        contentPane.add(car2); // instanciate
        f.setVisible(true);
    }
}
