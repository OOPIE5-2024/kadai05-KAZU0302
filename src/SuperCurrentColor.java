

import java.awt.Color;

import javax.swing.JPanel;

public class SuperCurrentColor {
   private int red = 0;
   private int blue = 0;
   private int green = 0;
   private int[] vals = {0, 128, 255};
   private JPanel colorPanel = new JPanel();
   
   public void changeRed() {
     red = nextBright(red);
     colorPanel.setBackground(new Color(vals[red], vals[blue], vals[green]));
   }
   public void changeBlue() {
     blue = nextBright(blue);
     colorPanel.setBackground(new Color(vals[red], vals[blue], vals[green]));
   }
   public void changeGreen() {
     green = nextBright(green);
     colorPanel.setBackground(new Color(vals[red], vals[blue], vals[green]));
   }
   public int nextBright(int b) {
     int z = -1;
     if (b == 0) z = 1;
     if (b == 1) z = 2;
     if (b == 2) z = 0;
     
     return z;   
   }
   public void setPanel(JPanel p) {
     colorPanel = p;
   }
}
