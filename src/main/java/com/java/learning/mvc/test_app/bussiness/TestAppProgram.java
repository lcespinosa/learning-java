package com.java.learning.mvc.test_app.bussiness;

import com.java.learning.mvc.test_app.gui.MainWindow;

public class TestAppProgram {

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow("Copy Machine App");
        mainWindow.setVisible(true);
        mainWindow.setLocationRelativeTo(null);
    }
}
