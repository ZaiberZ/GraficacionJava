
import java.awt.*;
import javax.swing.*;

public class Practica2 extends JFrame {

    Practica2() {
        super("P r a c t i c a  2 ");
        setSize(600, 600);

        repaint();

        setLocation(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int a = 0, b = 0,aa,bb;
        float x = 0, y = 0,c = 0;
        int t = 4, p=5;
        
        float i=Integer.parseInt(JOptionPane.showInputDialog("Introduce la "
                + "Medida de un Lado del Triangulo"));;

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
        
        
        //Primera Linea
        g.setColor(Color.green);
        System.out.println("\nPrimera Funcion");        
        x = -20;                
        for (a=100; a <= 500; a++) {            
            y = 0;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x>=0 && x<=i){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            System.out.println("x=" + x + " y=" + y +" a=" + a + " b=" + b);            
            x=(float) (x+0.1);            
        }
        
        //Segunda Linea
        g.setColor(Color.blue);                    
        x = -20;        
        b=500;
        c=i/2;
        for (a=100; a <= 500; a++) {            
            y = (float) (Math.tan(Math.PI/3) *x);
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x>=0 && x<=c){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }                
            }
            x=(float) (x+0.1);            
        }
        
        //Tercer Linea
        g.setColor(Color.red);        
        x = -20;        
        b=500;
        for (a=100; a <= 500; a++) {            
            y = (float) (0-(Math.tan(Math.PI/3))*(x-i));
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<=i && x>=(i/2)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }                
            }            
            x=(float) (x+0.1);            
        }



    }
    
    //float pi(int i)

    public static void main(String args[]) {
        new Practica2();
    }
}
