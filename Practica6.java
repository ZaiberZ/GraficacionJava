
import java.awt.*;
import javax.swing.*;

public class Practica6 extends JFrame{

    Practica6() {
        super("P r a c t i c a   6");
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
        float x = 0, y = 0;
        int ra = 0, t = 4, p=3;
        int r=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));

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
        //Mitad de Arriva
        g.setColor(Color.black);        
        ra = 0;        
        x = -20;
        a=300;
        b=500;
        for (a=100; a <= 500; a++) {            
            //Mitad de Arriva
            y = (float) Math.sqrt((r*r)-x*x);
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r && x>(0-r)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            //Mitad de Abajo
            y = 0 - (float) Math.sqrt((r*r)-x*x);
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r && x>(0-r)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            x=(float) (x+0.1);            
        }
        
        
        //Circulo c1        
        g.setColor(Color.BLUE);        
        ra = 10;        
        x = -20;                
        for (a=100; a <= 500; a++) {            
            //Mitad de Arriva
            y = (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))+ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            //Mitad de Abajo
            y = 0 - (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))+ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }                        
            x=(float) (x+0.1);            
        }
        
        //Circulo c3
        g.setColor(Color.CYAN);
        ra = 0-10;        
        x = -20;                
        for (a=100; a <= 500; a++) {            
            //Mitad de Arriva
            y = (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))+ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            //Mitad de Abajo
            y = 0 - (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))+ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }                        
            x=(float) (x+0.1);            
        }
        
        //Circulo c4
        g.setColor(Color.DARK_GRAY);
        ra = 10;        
        x = -20;                
        for (a=100; a <= 500; a++) {            
            //Mitad de Arriva
            y = (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))-ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            //Mitad de Abajo
            y = 0 - (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))-ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }                        
            x=(float) (x+0.1);            
        }
        
        
        //Circulo c2
        g.setColor(Color.GRAY);
        ra = 0-10;        
        x = -20;                
        for (a=100; a <= 500; a++) {            
            //Mitad de Arriva
            y = (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))-ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }
            //Mitad de Abajo
            y = 0 - (float) (Math.sqrt((r*r)-Math.pow(x-ra, 2)))-ra;
            b = 300 - (int) (y*10);            
            if(b<500 && b>100 && x<r+ra && x>(0-r+ra)){
                g.fillOval(a, b, t, t);
                try {
                    Thread.sleep(p);    
                } catch(InterruptedException e){ }
            }                        
            x=(float) (x+0.1);            
        }
        
        
        


    }

    public static void main(String args[]) {
        new Practica6();
    }
}
