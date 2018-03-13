package com.winterbin.greenhouse.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GHSplash {
  
  JPanel pnlCentro = null;
  JPanel pnlImagen = null;

  public GHSplash(){
    JFrame splash = new JFrame("Green House");
    splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    splash.setUndecorated(true);
    splash.setSize(600, 350);
    splash.setLocationRelativeTo(null);
    splash.getContentPane().setLayout(new BorderLayout());
    splash.setBackground(new Color(71, 145, 120));

    pnlCentro();
    pnlDerecho();

    splash.getContentPane().add(pnlImagen, BorderLayout.EAST); 
    splash.getContentPane().add(pnlCentro, BorderLayout.CENTER);

    splash.setVisible(true);
    try {
      Thread.sleep (3000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    splash.dispose();
  }
  void pnlCentro(){
    pnlCentro = new JPanel();
    pnlCentro.setBackground(new Color(71, 145, 120));
    pnlCentro.setLayout(new BorderLayout());
    
    JPanel pnlNombre = new JPanel();
    pnlNombre.setBackground(new Color(71, 145, 120));
    pnlNombre.setPreferredSize(new Dimension(400, 150));
    pnlNombre.setLayout(new BoxLayout(pnlNombre, BoxLayout.Y_AXIS));
   
    JLabel nombre = new JLabel("Green House");
    nombre.setAlignmentX(Component.RIGHT_ALIGNMENT);
    nombre.setFont(new Font("URW Gothic L", Font.PLAIN ,56));
    nombre.setForeground(new Color(221, 232, 216));
    JLabel desarrolladores = new JLabel("By CBT-Devs");
    desarrolladores.setAlignmentX(Component.RIGHT_ALIGNMENT);
    desarrolladores.setForeground(new Color(221, 232, 216));

    pnlNombre.add(nombre);
    pnlNombre.add(desarrolladores);

    pnlCentro.add(pnlNombre, BorderLayout.SOUTH);

  }
  void pnlDerecho(){
    pnlImagen = new JPanel();
    pnlImagen.setPreferredSize(new Dimension(200, 350));
    pnlImagen.setLayout(new BoxLayout(pnlImagen, BoxLayout.Y_AXIS));
    pnlImagen.setBackground(new Color(71, 145, 120));
    
    JPanel pnlHoja = new JPanel();
    pnlHoja.setBackground(new Color(71, 145, 120));
    pnlHoja.setPreferredSize(new Dimension(200,225));
    
    JPanel pnlEspera = new JPanel();
    pnlEspera.setBackground(new Color(71,145,120));
    pnlEspera.setPreferredSize(new Dimension(200,75));

    JLabel logo = new JLabel();
    Image icono = new ImageIcon("src/main/resources/logo.png").getImage();
    Image iconoScaled = icono.getScaledInstance(150,200,Image.SCALE_SMOOTH);
    logo.setIcon(new ImageIcon(iconoScaled));

    JLabel espera = new JLabel(){
      int i = 0;
      public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        AffineTransform aT = g2.getTransform();
        Shape oldshape = g2.getClip();
        double x = getWidth()/2.0;
        double y = getHeight()/2.0;
        try {
          Thread.sleep (1);
        } catch (Exception e) {
          e.printStackTrace();
        }
        aT.rotate(Math.toRadians(i++), x, y);
        g2.setTransform(aT);
        g2.setClip(oldshape);
        repaint();
        super.paintComponent(g);
      }
    };
    Image icon = new ImageIcon("src/main/resources/spinner.png").getImage();
    Image iconScaled = icon.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    espera.setIcon(new ImageIcon(iconScaled));
    
    espera.setHorizontalAlignment(SwingConstants.CENTER);
    espera.setVerticalAlignment(SwingConstants.CENTER);
    
    pnlHoja.add(logo);
    pnlEspera.add(espera);

    pnlImagen.add(pnlHoja);
    pnlImagen.add(pnlEspera);
  }
}

