package com.sabel;

import javax.swing.*;

public class Fenster extends JFrame {

    private JPanel jPanel;
    private JButton jbtnRot;
    private JButton jbtnGelb;
    private JButton jbtnBLau;


    public Fenster() {


        super("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.initComonents();

        this.setSize(300, 300);
        this.setVisible(true);

    }



    private void initComonents() {
        jPanel = new JPanel();
        jbtnRot = new JButton("Rot");
        jbtnGelb = new JButton("Gelb");
        jbtnBLau = new JButton("Blau");
        jPanel.add(jbtnRot);
        jPanel.add(jbtnGelb);
        jPanel.add(jbtnBLau);

        this.add(jPanel);


    }






}
