import java.awt.*;
import javax.swing.*;

public class Practica7 extends JFrame implements Runnable{
    float m=0;
    Boolean e=true;
    Practica7() {
        super("P r a c t i c a   7");
        setSize(600, 600);

        repaint();
        
        setLocation(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        try {
            Thread.sleep(4000);    
        } catch(InterruptedException e){ }                
        new Thread(this).start();
    }
    public void run() {
        while(e){
            m=(float) (m-0.1);
            repaint();
            try {
                    Thread.sleep(50);    
                } catch(InterruptedException e){ }
            if (m<(0-4)){
                //e=false;
                try {
                    Thread.sleep(4000);    
                } catch(InterruptedException e){ }
                m=0;                
            }
            //System.out.println("m = "+m);
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int a = 0, b = 0,aa,bb;
        float x = 0, y = 0;
        int ra = 0, t = 4, p=3;
        //int r=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));

        //Plano Cartesiano
        x=110;
        g.setColor(Color.black);        
        g.drawRect(90,90, 420, 420);
        g.drawRect(88,88, 424, 424);
        g.drawLine(300,100, 300, 500); //Eje Y
        g.drawLine(100,300, 500, 300); //Eje X                
        for(int yy=100;yy<=500;yy=yy+10){
            g.drawLine(295,yy, 305, yy);
        }        
        for(int xx=100;xx<=500;xx=xx+10){
            g.drawLine(xx,295, xx, 305);
        }        
        
        //Circulo 1        
        g.setColor(Color.black);        
        ra = 0;        
        x = -20;
        a=300;
        b=500;
        for (a=100; a <= 500; a++) {            
            //Mitad de Arriva
            y = (float) Math.sqrt(5-((x+2+m)*(x+2+m)))-(1+m);
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<((0-2-m)+Math.sqrt(5)) && x>((0-2-m)-Math.sqrt(5))){
                g.fillOval(a, b, t, t);                
            }
            //Mitad de Abajo
            y = (float) (0-Math.sqrt(5-((x+2+m)*(x+2+m)))-(1+m));
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<((0-2-m)+Math.sqrt(5)) && x>((0-2-m)-Math.sqrt(5))){
                g.fillOval(a, b, t, t);                
            }
            x=(float) (x+0.1);            
        }
        
        
        
        

    }

    public static void main(String args[]) {
        new Practica7();
    }
}
