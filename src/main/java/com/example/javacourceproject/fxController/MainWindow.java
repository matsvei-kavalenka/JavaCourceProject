package com.example.javacourceproject.fxController;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Getter
@Setter
public class MainWindow implements Initializable {
    @Getter
    @Setter
    private static MainWindow instance;

    @FXML
    Tab shopTab;
    @FXML
    Tab productTab;
    @FXML
    Tab warehouseTab;
    @FXML
    Tab userTab;

    private EntityManagerFactory entityManagerFactory;

    public MainWindow() {
        instance = this;
        entityManagerFactory = Persistence.createEntityManagerFactory("Shop");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FXMLLoader loader = new FXMLLoader();
        try {
            AnchorPane anchorPane = loader.load(getClass().getResource("/com/example/javacourceproject/userTab.fxml"));
            userTab.setContent(anchorPane);
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }

    public void openAllTabs(boolean isAdminNow) {
        shopTab.setDisable(false);

        FXMLLoader loader = new FXMLLoader();
        try {
            AnchorPane anch3 = loader.load(MainWindow.class.getResource("/com/example/javacourceproject/shopTab.fxml"));
            shopTab.setContent(anch3);
        } catch (IOException e) {
            System.out.println("File not found");
        }

        if (isAdminNow) {
            productTab.setDisable(false);
            warehouseTab.setDisable(false);

            loader = new FXMLLoader();
            try {
                AnchorPane anch1 = loader.load(MainWindow.class.getResource("/com/example/javacourceproject/productTab.fxml"));
                productTab.setContent(anch1);
            } catch (IOException e) {
                System.out.println("File not found");
            }

            loader = new FXMLLoader();
            try {
                AnchorPane anch4 = loader.load(MainWindow.class.getResource("/com/example/javacourceproject/warehouseTab.fxml"));
                warehouseTab.setContent(anch4);
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }


    }

    public void closeAllTabs() {
        shopTab.setDisable(true);
        productTab.setDisable(true);
        warehouseTab.setDisable(true);
    }

}
