package springexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class ButtonListener implements ActionListener {
    @Value("${message}")
    String message;

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, message);
    }
}