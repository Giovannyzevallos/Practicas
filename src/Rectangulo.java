import javax.swing.*;
import java.awt.*;
public class Rectangulo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,10,20,30);
        JFrame window = new JFrame();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30,30,300,300);

        window.getContentPane().add(new JComponent() {
            Rectangle mybox = box;
            public void paint(Graphics g){
                g.drawRect(mybox.x, mybox.y, mybox.width, mybox.height);
            }
        });
        window.setVisible(true);

    }
}
