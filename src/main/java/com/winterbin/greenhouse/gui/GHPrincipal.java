package com.winterbin.greenhouse.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GHPrincipal {

  JPanel pnlTop = null;
  JPanel pnlLeft = null; 
  JPanel pnlCenter = null;

  public GHPrincipal(){
    JFrame frame = new JFrame("Green House");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.getContentPane().setLayout(new BorderLayout());
    frame.setMinimumSize(new Dimension(600,350));

    principalTop();
    principalLeft();
    principalCenter();

    frame.getContentPane().add(pnlTop,BorderLayout.NORTH);
    frame.getContentPane().add(pnlLeft,BorderLayout.WEST);
    frame.getContentPane().add(pnlCenter,BorderLayout.CENTER);

    frame.setVisible(true);
  }
  void principalTop(){
    pnlTop = new JPanel();
    pnlTop.setBackground(new Color(71, 145, 120));
    pnlTop.setPreferredSize(new Dimension(74,75));
    pnlTop.setLayout(new BorderLayout());

    JPanel pnlTopLeft = new JPanel();
    pnlTopLeft.setLayout(new BoxLayout(pnlTopLeft, BoxLayout.X_AXIS));
    pnlTopLeft.setBackground(new Color(71, 145, 120));
    
    JPanel pnlTopRight = new JPanel();
    pnlTopRight.setLayout(new BoxLayout(pnlTopRight, BoxLayout.X_AXIS));
    pnlTopRight.setBackground(new Color(71, 145, 120));

    // labels {

    JLabel perfil = new JLabel();
    Image perfilIcon = new ImageIcon("src/main/resources/perfil.png").getImage();
    Image perfilIconScaled = perfilIcon.getScaledInstance(70,70,Image.SCALE_SMOOTH);
    perfil.setIcon(new ImageIcon(perfilIconScaled));

    JLabel nombrePerfil = new JLabel("Loki Laufeyson");
    nombrePerfil.setFont(new Font("sans-serif", Font.PLAIN,32));
    nombrePerfil.setForeground(new Color(221, 232, 216));
    
    JLabel notification = new JLabel();
    Image notificationIcon = new ImageIcon("src/main/resources/notification.png").getImage();
    Image notificationIconScaled = notificationIcon.getScaledInstance(38,47,Image.SCALE_SMOOTH);
    notification.setIcon(new ImageIcon(notificationIconScaled));

    //}

    pnlTopLeft.add(Box.createRigidArea(new Dimension(15, 0)));
    pnlTopLeft.add(perfil); 
    pnlTopLeft.add(Box.createRigidArea(new Dimension(15, 0)));
    pnlTopLeft.add(nombrePerfil);
    pnlTopRight.add(notification);
    pnlTopRight.add(Box.createRigidArea(new Dimension(15, 0)));

    pnlTop.add(pnlTopLeft, BorderLayout.CENTER);
    pnlTop.add(pnlTopRight, BorderLayout.EAST);
  }
  void principalLeft(){
    pnlLeft = new JPanel();
    pnlLeft.setBackground(new Color(114, 177, 122));
    pnlLeft.setPreferredSize(new Dimension(225,225));
    pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
    
    JLabel lblHome = new JLabel();
    Image homeIcon = new ImageIcon("src/main/resources/home-white.png").getImage();
    Image homeIconScaled = homeIcon.getScaledInstance(40,35,Image.SCALE_SMOOTH);
    lblHome.setIcon(new ImageIcon(homeIconScaled));
    lblHome.setText("Inicio");
    lblHome.setFont(new Font("sans-serif", Font.PLAIN,28));
    lblHome.setForeground(new Color(221, 232, 216));
    lblHome.setIconTextGap(10);
    lblHome.setBorder(new EmptyBorder(10, 10, 10, 10));
    
    JLabel lblSeed = new JLabel();
    Image seedIcon = new ImageIcon("src/main/resources/seed-white.png").getImage();
    Image seedIconScaled = seedIcon.getScaledInstance(40, 35, Image.SCALE_SMOOTH);
    lblSeed.setIcon(new ImageIcon(seedIconScaled));
    lblSeed.setText("Siembra");
    lblSeed.setFont(new Font("sans-serif", Font.PLAIN, 28));
    lblSeed.setForeground(new Color(221, 232, 216));
    lblSeed.setIconTextGap(10);
    lblSeed.setBorder(new EmptyBorder(10, 10, 10, 10));

    JLabel lblCare = new JLabel();
    Image careIcon = new ImageIcon("src/main/resources/care-white.png").getImage();
    Image careIconScaled = careIcon.getScaledInstance(40, 35, Image.SCALE_SMOOTH);
    lblCare.setIcon(new ImageIcon(careIconScaled));
    lblCare.setText("Cuidado");
    lblCare.setFont(new Font("sans-serif", Font.PLAIN, 28));
    lblCare.setForeground(new Color(221, 232, 216));
    lblCare.setIconTextGap(10);
    lblCare.setBorder(new EmptyBorder(10, 10, 10, 10));

    JLabel lblStore = new JLabel();
    Image storeIcon = new ImageIcon("src/main/resources/store-white.png").getImage();
    Image storeIconScaled = storeIcon.getScaledInstance(40, 35, Image.SCALE_SMOOTH);
    lblStore.setIcon(new ImageIcon(storeIconScaled));
    lblStore.setText("tienda");
    lblStore.setFont(new Font("sans-serif", Font.PLAIN, 28));
    lblStore.setForeground(new Color(221, 232, 216));
    lblStore.setIconTextGap(10);
    lblStore.setBorder(new EmptyBorder(10, 10, 10, 10));

    pnlLeft.add(lblHome);
    pnlLeft.add(lblSeed);
    pnlLeft.add(lblCare);
    pnlLeft.add(lblStore);
  }
  void principalCenter(){
    pnlCenter = new JPanel();
    pnlCenter.setBackground(new Color(221,232,216));
    pnlCenter.setLayout(new BorderLayout());
    
    //pnlCenter.add(principalCenterBlank(), BorderLayout.CENTER);
    pnlCenter.add(principalCenterFormularioMS1(), BorderLayout.CENTER);
    //pnlCenter.add(principalCenterFormularioMS2(), BorderLayout.CENTER);
  }

  JPanel principalCenterBlank(){
    JPanel pnlBl = new JPanel();
    pnlBl.setBackground(new Color(221,232,216));
    pnlBl.setLayout(new BorderLayout());

    JLabel text = new JLabel("Primero agrega un modulo de siembra");
    text.setFont(new Font("sans-serif", Font.PLAIN, 28));
    text.setForeground(new Color(114, 177, 122));
    Image textIcon = new ImageIcon("src/main/resources/add.png").getImage();
    Image textIconScaled = textIcon.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
    text.setIcon(new ImageIcon(textIconScaled));
    text.setHorizontalTextPosition(JLabel.CENTER);
    text.setVerticalTextPosition(JLabel.TOP);
    text.setIconTextGap(10);

    text.setHorizontalAlignment(SwingConstants.CENTER);

    pnlBl.add(text, BorderLayout.CENTER);

    return pnlBl;
  }
  JPanel principalCenterFormularioMS1(){
    JPanel pnlForm = new JPanel();
    pnlForm.setBackground(new Color(221,232,216));
    pnlForm.setLayout(new BoxLayout(pnlForm,BoxLayout.Y_AXIS));
    
    JLabel formTitle = new JLabel("Crear nuevo modulo de siembra");
    formTitle.setFont(new Font("sans-serif", Font.PLAIN, 22));
    formTitle.setForeground(new Color(71, 145, 120));    
    formTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
    formTitle.setBorder(new EmptyBorder(10, 10, 10, 10));

    JLabel formInstructions1 = new JLabel("<html><p>Por favor para continuar "+ 
                                          "creando tu modulo de siembra indicanos "+ 
                                          "si deseas comenzar desde cero tu modulo "+ 
                                          "o registrar uno existente.</p></html>");
    formInstructions1.setFont(new Font("sans-serif", Font.PLAIN, 18));
    formInstructions1.setForeground(new Color(77, 77, 77));    
    formInstructions1.setAlignmentX(Component.LEFT_ALIGNMENT);
    formInstructions1.setBorder(new EmptyBorder(10, 10, 10, 10));

    JPanel imagen = new JPanel();
    imagen.setLayout(new FlowLayout());
    imagen.setBackground(new Color(221,232,216));

    JLabel imagenPasos = new JLabel();
    Image imagenPasosIcon = new ImageIcon("src/main/resources/pasos.png").getImage();
    Image imagenPasosIconScaled = imagenPasosIcon.getScaledInstance(400, 150, Image.SCALE_SMOOTH);
    imagenPasos.setIcon(new ImageIcon(imagenPasosIconScaled));
    imagen.add(imagenPasos);
     
    imagen.setMaximumSize(new Dimension(400,150));
    //:imagenPasos.setHorizontalAlignment(SwingConstants.CENTER);
    imagen.setAlignmentX(Component.LEFT_ALIGNMENT);

    JPanel formPnlModuloConfirm = new JPanel();
    formPnlModuloConfirm.setLayout(new FlowLayout());
    formPnlModuloConfirm.setBackground(new Color(221, 232, 216));

    JButton formButtonNuevoModulo = new JButton("Nuevo");
    formButtonNuevoModulo.setBackground(new Color(71,145,120));
    formButtonNuevoModulo.setForeground(new Color(221, 232, 216));
    // formButtonNuevoModulo.setBorder(new EmptyBorder(5,10,5,10));
    JButton formButtonRegistrarModulo = new JButton("Registrar");
    formPnlModuloConfirm.add(formButtonNuevoModulo);
    formPnlModuloConfirm.add(formButtonRegistrarModulo);

    formPnlModuloConfirm.setMaximumSize(new Dimension(8000,30));
    formPnlModuloConfirm.setAlignmentX(Component.LEFT_ALIGNMENT);
    
    pnlForm.add(formTitle);
    pnlForm.add(formInstructions1);
    pnlForm.add(imagen);
    pnlForm.add(formPnlModuloConfirm);
    return pnlForm;
  }
  JPanel principalCenterFormularioMS2(){
    JPanel pnlForm = new JPanel();
    pnlForm.setBackground(new Color(221,232,216));
    pnlForm.setLayout(new BoxLayout(pnlForm,BoxLayout.Y_AXIS));
    
    JLabel formTitle = new JLabel("Preparacion de modulo de siembra");
    formTitle.setFont(new Font("sans-serif", Font.PLAIN, 22));
    formTitle.setForeground(new Color(71, 145, 120));    
    formTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
    formTitle.setBorder(new EmptyBorder(10, 10, 10, 10));

    JLabel formInstructions1 = new JLabel("<html><p>Para continuar asegurate de "+ 
                                          "tener a tu dispocision los siguientes "+ 
                                          "materiales.</p></html>");
    formInstructions1.setFont(new Font("sans-serif", Font.PLAIN, 18));
    formInstructions1.setForeground(new Color(77, 77, 77));    
    formInstructions1.setAlignmentX(Component.LEFT_ALIGNMENT);
    formInstructions1.setBorder(new EmptyBorder(10, 10, 10, 10));

    JPanel formPnlModuloConfirm = new JPanel();
    formPnlModuloConfirm.setLayout(new FlowLayout());
    formPnlModuloConfirm.setBackground(new Color(221, 232, 216));

    JButton formButtonNuevoModulo = new JButton("Nuevo");
    formButtonNuevoModulo.setBackground(new Color(71,145,120));
    formButtonNuevoModulo.setForeground(new Color(221, 232, 216));
    // formButtonNuevoModulo.setBorder(new EmptyBorder(5,10,5,10));
    JButton formButtonRegistrarModulo = new JButton("Registrar");
    formPnlModuloConfirm.add(formButtonNuevoModulo);
    formPnlModuloConfirm.add(formButtonRegistrarModulo);

    formPnlModuloConfirm.setMaximumSize(new Dimension(8000,30));
    formPnlModuloConfirm.setAlignmentX(Component.LEFT_ALIGNMENT);
    
    pnlForm.add(formTitle);
    pnlForm.add(formInstructions1);
    pnlForm.add(Box.createRigidArea(new Dimension(0, 5)));
    pnlForm.add(formPnlModuloConfirm);

    return pnlForm;

  }
}

