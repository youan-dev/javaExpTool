package com.example.coding;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CodingController {
    @FXML
    public Label versionLabel;
    @FXML
    private Button loginBtn;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField passWd;

    @FXML
    void login(ActionEvent event) {
        String name = userName.getText();
        String passwd = passWd.getText();
        option(name+"\n"+passwd);
    }



    /**
     * 消息弹窗
     * @param message
     */
    public void option(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.titleProperty().set("提示信息");
        alert.headerTextProperty().set(message);
        alert.showAndWait();
    }
}
