
import java.awt.*;
import javax.swing.*;

public class Practica1 extends JFrame {

    Practica1() {
        super("P r a c t i c a  1");
        setSize(600, 600);

        repaint();

        setLocation(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);        
        int a = 0, b = 0;
        float x = 0, y = 0;
        int t = 4, p=5,c;

        //Plano Cartesiano        
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
        
        
        //Primera Funcion
        g.setColor(Color.black);
        System.out.println("\nPrimera Funcion");
        x = -20;
        for (a=100; a <= 500; a++) {            
            y = x;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            System.out.println("x=" + x + " y=" + y +" a=" + a + " b=" + b);            
            x=(float) (x+0.1);            
        }

        //Segunda Funcion
        g.setColor(Color.green);
        x = -20;                
        for (a=100; a <= 500; a++) {            
            y = 3*x+5;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            System.out.println("x=" + x + " y=" + y +" a=" + a + " b=" + b);            
            x=(float) (x+0.1);            
        }
        
        
        
        //Tercera Funcion
        g.setColor(Color.red);
        x = -20;                
        for (a=100; a <= 500; a++) {            
            y = ((0-1)*x/3)-8;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            System.out.println("x=" + x + " y=" + y +" a=" + a + " b=" + b);            
            x=(float) (x+0.1);            
        }

        //Adicional Funcion
        g.setColor(Color.blue);
                c = 0;        
        x = -20;
        a=300;
        b=500;
        for (a=100; a <= 500; a++) {            
            y = x*x;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            System.out.println("x=" + x + " y=" + y +" a=" + a + " b=" + b);            
            x=(float) (x+0.1);            
        }
        
        //Adicional Funcion
        g.setColor(Color.ORANGE);
                c = 0;        
        x = -20;
        a=300;
        b=500;
        for (a=100; a <= 500; a++) {            
            y = 1/x;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            System.out.println("x=" + x + " y=" + y +" a=" + a + " b=" + b);            
            x=(float) (x+0.1);            
        }
        
        //Adicional Funcion
        g.setColor(Color.magenta);
                c = 0;        
        x = -20;
        a=300;
        b=500;
        for (a=100; a <= 500; a++) {            
            y = (5/(x-5))+5;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            System.out.println("x=" + x + " y=" + y +" a=" + a + " b=" + b);            
            x=(float) (x+0.1);            
        }


    }

    public static void main(String args[]) {
        new Practica1();
    }
}
