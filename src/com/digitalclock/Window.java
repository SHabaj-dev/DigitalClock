package com.digitalclock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Window extends JFrame {

    private JLabel heading;
    private JLabel clock;

    Font font = new Font("", Font.BOLD, 35);

    public Window(){
        super.setTitle("Digital Clock");
        super.setSize(500, 400);
        super.setLocation(300, 50);
        this.CreateGUI();
        this.setClock();
        super.setVisible(true);
    }

    public  void CreateGUI(){
        heading = new JLabel("Digital Clock.");
        clock = new JLabel("clock");

        heading.setFont(font);
        clock.setFont(font);

        this.setLayout(new GridLayout(2, 1));

        this.add(heading);
        this.add(clock);
    }

    public void setClock(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toLocaleString();

                clock.setText(dateTime);
            }
        });

        timer.start();
    }
}
