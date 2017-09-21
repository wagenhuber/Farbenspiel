package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame implements ActionListener {

    private JPanel jPanel;
    private JButton jbtnRot;
    private JButton jbtnGelb;
    private JButton jbtnBLau;


    public Fenster() {


        super("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.initComonents();
        this.initEvents();
        this.setSize(300, 300);
        this.setVisible(true);

    }

    private void initEvents() {
        jbtnRot.addActionListener(this);
        jbtnBLau.addActionListener(this);
        jbtnGelb.addActionListener(this);
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


    @Override
    public void actionPerformed(ActionEvent e) {
        //String command = e.getActionCommand();
        //System.out.println(command + " wurde geklickt!");

        switch (e.getActionCommand()) {
            case "Rot":
                jPanel.setBackground(Color.RED);
                System.out.println("Rot");
                break;
            case "Gelb":
                jPanel.setBackground(Color.YELLOW);
                System.out.println("Gelb");
                break;
            case "Blau":
                jPanel.setBackground(Color.BLUE);
                System.out.println("Blau");
                break;

        }


    }
}
