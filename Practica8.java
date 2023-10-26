import java.awt.*;
import javax.swing.*;

public class Practica8 extends JFrame implements Runnable{
    float m=0;
    int j,k,l,r;
    Boolean e=true;
    Practica8() {
        super("P r a c t i c a   8");
        setSize(600, 600);
        r=(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Diametro del circulo")))*10;
        k=r/2;
        repaint();        
        setLocation(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                 
        new Thread(this).start();
    }
    
    public void run() {
        while(e){     
            try {
                    Thread.sleep(14);    
                } catch(InterruptedException e){}
            if(k==(r/2) && m==0){
                k++;
                m=0;
            }
            if(k<200 && m==0){                
                k++;
            }
            if(k==200){
                m=1;
                k--;
            }
            if(k>(0-(200-r)) && m==1){                
                k--;
            }
            if(k==(0-(200-r)) ){
                m=0;
                k++;
            }
            
            repaint();            
            
            //System.out.println("m = "+m);
        }
    }
    
    public void update(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int a = 0, b = 0,aa,bb;
        float x = 0, y = 0;
        int ra = 0, t = r, p=3;        

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
        
        g.setColor(Color.blue);
        j = 300-(r/2);
        //y = (float) (Math.sin(x/4)*4);
        g.fillOval(j, 300-k, t, t);                
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int a = 0, b = 0,aa,bb;
        float x = 0, y = 0;
        int ra = 0, t = r, p=3;        

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
        
        g.setColor(Color.blue);
        j = 300-(r/2);
        //y = (float) (Math.sin(x/4)*4);
        g.fillOval(j, 300-k, t, t);                
        
    }

    public static void main(String args[]) {
        new Practica8();
    }
}
