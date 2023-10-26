import java.awt.*;
import javax.swing.*;

public class Practica9 extends JFrame implements Runnable{
    float m=0;
    int j,k,l,r;
    int a = 0, b = 0;
    float x = 0, y = 0;
    Boolean e=true;
    Practica9() {
        super("P r a c t i c a   9");
        setSize(600, 600);
        r=(Integer.parseInt(JOptionPane.showInputDialog("Introduce el diametro del circulo")))*10;
        //k=r/2;
        j=100;
        a=100;
        x = -20;
        repaint();        
        setLocation(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                 
        new Thread(this).start();
    }
    public void run() {
        while(e){     
            try {
                    Thread.sleep(13);    
                } catch(InterruptedException e){ }
            
            x=(float) (x+0.1);  
            
            a++;
            if (a==(500-r)){
                a=100;
                x = -20;
            }
            repaint();            

        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;               
        int t = r, p=3;        

        //Plano Cartesiano
        //x=110;
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
        g.setColor(Color.blue);        
        
        //x = -20;
        
        //a=300;
        //b=500;
        
            //Mitad de Arriva
            y = (float) (Math.sin((x+(r/30))*2/5)*9/2);
            b = 300 - (int) (y*10);  
            System.out.println("x = "+x+"  y = "+y);
            if(b<500 && b>100){
                g.fillOval(a, b-(r/2), t, t);                
                try {
                    Thread.sleep(25);    
                } catch(InterruptedException e){ }
            }
            
        
        
        
        
        

    }

    public static void main(String args[]) {
        new Practica9();
    }
}