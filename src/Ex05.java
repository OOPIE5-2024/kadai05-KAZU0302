

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ex05 {

  private JFrame frame;
  private JPanel panel_1;
  private JButton btnNewButton_6;
  private JButton btnNewButton_7;
  private JButton btnNewButton_8;
  private SuperCurrentColor color = new SuperCurrentColor();
  
//  private CurrentColor crrntBckColor = new CurrentColor();
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex05 window = new Ex05();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex05() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    frame.getContentPane().add(panel, BorderLayout.NORTH);
    
    
   
    btnNewButton_6 = new JButton("Red");
    btnNewButton_6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        color.changeRed();
      }
    });
    panel.add(btnNewButton_6);
    
    
    btnNewButton_7 = new JButton("Blue");
    btnNewButton_7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        color.changeBlue();
      }
    });
    
    panel.add(btnNewButton_7);
    
    btnNewButton_8 = new JButton("Green");
    btnNewButton_8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        color.changeGreen();
      }
    });
    panel.add(btnNewButton_8);
    
    panel_1 = new JPanel();
    color.setPanel(panel_1);
    frame.getContentPane().add(panel_1, BorderLayout.CENTER);
  }

}
