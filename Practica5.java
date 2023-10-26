//Revisa 511 de deitel
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Practica5 extends JFrame implements Runnable{
    
    Double ah=(Math.PI)/6, am=(Math.PI)/30, a=ah*3;;
    int lx=500,xh,yh=0,xm,ym=0,xs,ys=0;
    int h,hr,mi,se;
    JLabel ap;
    Calendar c;
    Practica5(){
        super("P r a c t i c a   5");
        setLayout(new FlowLayout());
        setSize(600, 550);
        ap=new JLabel("");
        add(ap);
        //h=Integer.parseInt(JOptionPane.showInputDialog("Longitud de la Linea: "));
        //x1=h*10;
                
        repaint();
        setLocation(400, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //System.out.println("x1="+xh+" y1="+yh+" a="+a+" sin="+Math.sin(a));
        new Thread(this).start();
    }
    
    public void run() {
        while(true){
            c=Calendar.getInstance();
            hr=c.getTime().getHours();
            mi=c.getTime().getMinutes();
            se=c.getTime().getSeconds();            
            
            //Hora
            if(hr>12){
                hr -=12;
                ap.setText("PM");
            }else{
                ap.setText("AM");
            }
            a=(Math.PI)/2-(hr*ah)-((mi*ah)/60);
            xh = (int) ((Math.cos(a)*10*5));                    
            yh = (int) ((Math.sin(a)*10*5));            
            //System.out.println("x1="+((Math.cos(a)*10*5))+" y1="+yh+" a="+a);
            
            //Minuto
            a=(Math.PI)/2-(mi*am)-((se*am)/60);
            xm = (int) ((Math.cos(a)*10*8));                    
            ym = (int) ((Math.sin(a)*10*8));            
            //System.out.println("Min="+mi);
            
            //Segundo
            a=(Math.PI)/2-(se*am);
            xs = (int) ((Math.cos(a)*10*12));                    
            ys = (int) ((Math.sin(a)*10*12));            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
            repaint();
        }        
    }
    
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int a = 0, b = 0;
        int x = 0, y = 0;
        int c = 0, t = 250, p=5;
        
        //Relog
        x=300;y=300;
        g.drawOval(x-(t/2), y-(t/2), t, t);        
        g.drawOval(x-(t/2)+1, y-(t/2)+1, t+2, t+2);        
        g.setFont(new Font( "Arial", Font.BOLD, 25 ));
        g.drawString("12", x-15, y-135);
        g.drawString("6" , x-7, y+150);
        g.drawString("9" , x-150, y+12);
        g.drawString("3" , x+135, y+12);
        
        
        //Hora
        x=300;y=300;
        g.setColor(Color.green);
        g.drawLine(x,y,x+xh,y-yh);
        g.drawLine(x+1,y,x+xh+1,y-yh);
        g.drawLine(x-1,y,x+xh-1,y-yh);
        g.setColor(Color.red);
        g.drawLine(x+1,y,x+xm+1,y-ym);
        g.drawLine(x,y,x+xm,y-ym);
        g.drawLine(x-1,y,x+xm-1,y-ym);
        g.setColor(Color.blue);
        g.drawLine(x+1,y,x+xs+1,y-ys);
        g.drawLine(x,y,x+xs,y-ys);
        g.drawLine(x-1,y,x+xs-1,y-ys);
        
        
        
        try {
                    Thread.sleep(1);    
                } catch(InterruptedException e){ }
        
        
    }

    public static void main(String args[]) {
        new Practica5();
    }
}
