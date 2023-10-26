import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;



class Panel extends javax.swing.JPanel{
private int x = 10;
private int y = 10;

public Panel() {

this.size();

}

@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);


g.setColor(Color.yellow);
g.fillRect(0, 0, 500, 500);
g.setColor(Color.RED);
g.fillRect(x,10, 20, 20);

}
public void setX(int x)
{
this.x += x;
}

}

class Cambio extends JFrame{
private Timer tm;
private Panel p = new Panel();
public Cambio() {

this.setSize(500,500);
this.add(p);
this.setDefaultCloseOperation(3);

tm = new Timer(100, new ActionListener(){

@Override
public void actionPerformed(ActionEvent ae) {

p.repaint();
p.setX(10);
}


});

tm.start();
this.setVisible(true);

}



public static void main(String[] args) {

new Cambio();
}
}