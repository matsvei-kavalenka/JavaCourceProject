package com.example.javacourceproject.fxController;

import com.example.javacourceproject.model.Cases;
import com.example.javacourceproject.model.Headphones;
import com.example.javacourceproject.model.Product;
import com.example.javacourceproject.model.Smartphones;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindow {
    public ListView<Product> productAdminList;
    public TextField priceSmartphoneField;
    public TextField priceHeadphonesField;
    public TextField priceCaseField;
    @FXML
    private RadioButton smartphoneRadioButton;
    public RadioButton headphonesRadioButton;
    public RadioButton caseRadioButton;
    public TextField productTitleField;
    public TextArea productDescriptionField;
    public TextField quantityField;
    public TextField priceField;
    public TextField smartphoneMemoryCapacityField;
    public TextField smartphoneColorField;
    @FXML
    private TextField smartphoneDiagonalField;
    @FXML
    private TextField smartphoneBatteryCapacityField;
    public TextField headphonesTypeField;
    public TextField headphonesBatteryCapacityField;
    public TextField headphonesColorField;
    public TextField caseTypeField;
    public TextField caseMaterialField;
    public TextField caseColorField;

    @FXML
    private void radioButtonWidgetsActivation() {
        if (smartphoneRadioButton.isSelected()) {
            smartphoneDiagonalField.setVisible(true);
            smartphoneBatteryCapacityField.setVisible(true);
            smartphoneMemoryCapacityField.setVisible(true);
            smartphoneColorField.setVisible(true);
            priceSmartphoneField.setVisible(true);
        } else {
            smartphoneDiagonalField.setVisible(false);
            smartphoneBatteryCapacityField.setVisible(false);
            smartphoneMemoryCapacityField.setVisible(false);
            smartphoneColorField.setVisible(false);
            priceSmartphoneField.setVisible(false);
        }

        if (headphonesRadioButton.isSelected()) {
            headphonesTypeField.setVisible(true);
            headphonesBatteryCapacityField.setVisible(true);
            headphonesColorField.setVisible(true);
            priceHeadphonesField.setVisible(true);
        } else {
            headphonesTypeField.setVisible(false);
            headphonesBatteryCapacityField.setVisible(false);
            headphonesColorField.setVisible(false);
            priceHeadphonesField.setVisible(false);
        }

        if (caseRadioButton.isSelected()) {
            caseTypeField.setVisible(true);
            caseMaterialField.setVisible(true);
            caseColorField.setVisible(true);
            priceCaseField.setVisible(true);
        } else {
            caseTypeField.setVisible(false);
            caseMaterialField.setVisible(false);
            caseColorField.setVisible(false);
            priceCaseField.setVisible(false);
        }
    }

    public void addRecord() {
        if (smartphoneRadioButton.isSelected()) {
            Smartphones smartphone = new Smartphones(productTitleField.getText(),
                    productDescriptionField.getText(),
                    Integer.parseInt(quantityField.getText()),
                    Float.parseFloat(priceField.getText()),
                    Float.parseFloat(smartphoneDiagonalField.getText()),
                    Integer.parseInt(smartphoneBatteryCapacityField.getText()),
                    Integer.parseInt(smartphoneMemoryCapacityField.getText()),
                    smartphoneColorField.getText());
            productAdminList.getItems().add(smartphone);
        } else if (headphonesRadioButton.isSelected()) {
            Headphones headphones = new Headphones(productTitleField.getText(),
                    productDescriptionField.getText(),
                    Integer.parseInt(quantityField.getText()),
                    Float.parseFloat(priceField.getText()),
                    headphonesTypeField.getText(),
                    Integer.parseInt(headphonesBatteryCapacityField.getText()),
                    smartphoneColorField.getText());
            productAdminList.getItems().add(headphones);
        } else if (caseRadioButton.isSelected()) {
            Cases cases = new Cases(productTitleField.getText(),
                    productDescriptionField.getText(),
                    Integer.parseInt(quantityField.getText()),
                    Float.parseFloat(priceField.getText()),
                    caseTypeField.getText(),
                    caseMaterialField.getText(),
                    caseColorField.getText());
            productAdminList.getItems().add(cases);
        }
    }

    public void updateRecord() {
        Product product = productAdminList.getSelectionModel().getSelectedItem();
        if (product instanceof Smartphones) {
            Smartphones smartphones = (Smartphones) product;
            smartphones.setTitle(productTitleField.getText());
            smartphones.setDescription(productDescriptionField.getText());
            smartphones.setPrice(Float.parseFloat(priceField.getText()));
            smartphones.setQty(Integer.parseInt(quantityField.getText()));
            smartphones.setDisplayDiagonal(Float.parseFloat(smartphoneDiagonalField.getText()));
            smartphones.setBatteryCapacity(Integer.parseInt(smartphoneBatteryCapacityField.getText()));
            smartphones.setMemoryCapacity(Integer.parseInt(smartphoneMemoryCapacityField.getText()));
            smartphones.setColor(smartphoneColorField.getText());
        } else if (product instanceof Headphones) {
            Headphones headphones = (Headphones) product;
            headphones.setTitle(productTitleField.getText());
            headphones.setDescription(productDescriptionField.getText());
            headphones.setPrice(Float.parseFloat(priceField.getText()));
            headphones.setQty(Integer.parseInt(quantityField.getText()));
            headphones.setType(smartphoneBatteryCapacityField.getText());
            headphones.setBatteryCapacity(Integer.parseInt(smartphoneMemoryCapacityField.getText()));
            headphones.setColor(headphonesColorField.getText());
        } else if (product instanceof Cases) {
            Cases cases = (Cases) product;
            cases.setTitle(productTitleField.getText());
            cases.setDescription(productDescriptionField.getText());
            cases.setPrice(Float.parseFloat(priceField.getText()));
            cases.setQty(Integer.parseInt(quantityField.getText()));
            cases.setType(smartphoneBatteryCapacityField.getText());
            cases.setMaterial(smartphoneMemoryCapacityField.getText());
            cases.setColor(caseColorField.getText());
        }
    }

    public void deleteRecord() {
        Product product = productAdminList.getSelectionModel().getSelectedItem();
        productAdminList.getItems().remove(product);
    }

}
