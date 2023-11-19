package gui;

import Constants.CommonConstants;

import javax.swing.*;

public class LoginGUI extends JFrame {
    public LoginGUI(){
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
        setLocationRelativeTo(null);

        addGUIComponents();
    }
    public void addGUIComponents(){
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);

        //username
        JLabel usernameLabel = new JLabel("username: ");
        JTextField usernameField = new JTextField(CommonConstants.TEXTFIELD_SIZE);

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        this.getContentPane().add(loginPanel);
    }

}


// parei em 7:12 https://www.youtube.com/watch?v=UhsXtDm30cE&t=2s