//Revisa 511 de deitel
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Practica4 extends JFrame{
    JButton izq,der;
    double a=0.0;
    int lx=500,x1,y1=0;
    int h;
    Practica4(){
        super("P r a c t i c a   4");
        setLayout(new FlowLayout());
        setSize(600, 600);
        
        botones b=new botones();
        teclas te=new teclas();
        
        izq = new JButton("Giro Izquierdo");                
        der = new JButton("Giro Derecho");
        izq.addActionListener(b);
        der.addActionListener(b);
        izq.addKeyListener(te);
        der.addKeyListener(te);
        //this.addKeyListener(te);
        h=Integer.parseInt(JOptionPane.showInputDialog("Longitud de la Linea: "));
        x1=h*10;
        add(izq);
        add(der);
        izq.setBounds(100,100, 300, 80);
        der.setBounds(100,100, 300, 80);
        repaint();
        setLocation(400, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        System.out.println("x1="+x1+" y1="+y1+" a="+a+" sin="+Math.sin(a));
        
    }
    
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int a = 0, b = 0,aa,bb;
        int x = 0, y = 0;
        int c = 0, t = 2, p=5;
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
        
        //Recta
        x=300;y=300;
        g.drawLine(x,y,x+x1,y-y1);
        try {
                    Thread.sleep(1);    
                } catch(InterruptedException e){ }
        //g.dispose(); //Borrar Todo
        
    }

       
    private class botones implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==izq){
                    a=a+((Math.PI)/24);
                    x1 = (int) ((Math.cos(a)*10*h));                    
                    y1 = (int) ((Math.sin(a)*10*h));
                    System.out.println("x1="+((Math.sin(a)*10*h))+" y1="+y1+" a="+a+" sin="+Math.sin(a));
                    repaint();
            }
            if(e.getSource()==der){
                    a=a-((Math.PI)/24);
                    x1 = (int) ((Math.cos(a)*10*h));                    
                    y1 = (int) ((Math.sin(a)*10*h));
                    System.out.println("x1="+((Math.sin(a)*10*h))+" y1="+y1+" a="+a+" sin="+Math.sin(a));
                    repaint();
            }
        }
    }
    
    private class teclas implements KeyListener
    {               
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent evt) {
            //System.out.println("Tecla: "+evt.getKeyCode());
            if(evt.getKeyCode()==37){
                    a=a+((Math.PI)/24);
                    x1 = (int) ((Math.cos(a)*10*h));                    
                    y1 = (int) ((Math.sin(a)*10*h));
                    System.out.println("x1="+((Math.sin(a)*10*h))+" y1="+y1+" a="+a+" sin="+Math.sin(a));
                    repaint();
                }
                if(evt.getKeyCode()==39){
                    a=a-((Math.PI)/24);
                    x1 = (int) ((Math.cos(a)*10*h));                    
                    y1 = (int) ((Math.sin(a)*10*h));
                    System.out.println("x1="+((Math.sin(a)*10*h))+" y1="+y1+" a="+a+" sin="+Math.sin(a));
                    repaint();
                }
        }

        @Override
        public void keyReleased(KeyEvent e) {}
    }
            
    
    
    public static void main(String args[]) {
        new Practica4();
    }
}
