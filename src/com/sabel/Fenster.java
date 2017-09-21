package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {

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
        jbtnRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
            }
        });

        jbtnGelb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.YELLOW);
            }
        });

        jbtnBLau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });
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
