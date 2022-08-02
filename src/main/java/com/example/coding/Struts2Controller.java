package com.example.coding;


import cn.hutool.core.util.StrUtil;
import com.example.hutool.SelectVulnerUtil;
import com.example.vulnerability.VulnerInterface;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.net.URL;
import java.util.ResourceBundle;

@Slf4j
public class Struts2Controller implements Initializable {
    @FXML
    private Button vulnerCheckButton;

    @FXML
    private Button exeCmdButton;

    @FXML
    private TextField exeCmdValue;  //命令框内容

    @FXML
    private ComboBox<String> modeValue; //漏洞模式值

    @FXML
    private ComboBox<String> vulCode; //漏洞编号值


    @FXML
    private TextArea baseInfoText;

    @FXML
    private TextArea vulnerabilityCheckResulte;

    @FXML
    private TextField addressValue;

    @FXML
    private TextArea exeCmdTextAreaID; // 命令执行tab下的textArea

    @FXML
    private TabPane mainPaneTab;

    @FXML
    private Tab handCheckTabID;

    @FXML
    private Tab oneDayCheckTabID;

    @FXML
    private Tab uploadTabID;

    @FXML
    private Tab vulnerabilityCheckTabID;  //漏洞验证tab

    @FXML
    private Tab cmdExecTabID;  //命令执行



    @Value("${Struts2.vulCode}")
    private String msg;

    //页面初始化
    public void initialize(URL location, ResourceBundle resources) {
        //初始化  漏洞模式 和  漏洞编号
        initModelVaule();
        initVulCodeValue();
        //初始化tabList监听器
        //initTabListListen();

        mainPaneTab.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {
            @Override
            public void changed(ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) {
                oldValue.setStyle(newValue.getStyle());
                newValue.setStyle("-fx-background-color:#9393FF");
            }
        });

    }

    /**
     * 点击按钮 漏洞验证
     * @param event
     */
    @FXML
    public void exeButtonAction(ActionEvent event) throws Exception {

        String vulCodeValue = vulCode.getValue();  //获取漏洞编号
        String modelValue = modeValue.getValue();
        String url = addressValue.getText();
        System.out.println("漏洞模式="+modelValue);
        System.out.println("漏洞编号="+vulCodeValue);
        System.out.println("地址="+url);


        //如果是靶场模式，则不加载绕过方式
        if(modelValue.equals("靶场模式")){
            if(vulCodeValue.equals("all")){ //不知版本情况下的盲打poc

            }else if(vulCodeValue.equals("0day")){ //0day情况下

            }else{ //单点漏洞打击
                VulnerInterface exploit = SelectVulnerUtil.getExploit(vulCodeValue);
                String result = exploit.executePOC(url);

                //把结果设置到命令执行处
                if(StrUtil.isBlank(vulnerabilityCheckResulte.getText())){
                    vulnerabilityCheckResulte.setText(result);
                }else{
                    vulnerabilityCheckResulte.appendText(result);
                }
            }
        }else if(modelValue.equals("实战模式")){  //如果是实战模式，则要加载waf绕过poc.

        }else{ //待扩展

        }

        //选中漏洞验证选项卡
        mainPaneTab.getSelectionModel().select(vulnerabilityCheckTabID);
    }

    /**
     * 命令执行 按钮 action
     * @param event
     */
    @FXML
    public void exeCmdAction(ActionEvent event) throws Exception {
        String vulCodeValue = vulCode.getValue();  //获取漏洞编号
        String modelValue = modeValue.getValue();  //模式
        String url = addressValue.getText();    // url值
        String exeCmdValueText = exeCmdValue.getText();  //命令

        VulnerInterface exploit = SelectVulnerUtil.getExploit(vulCodeValue);
        String result = exploit.executeCmd(url,exeCmdValueText);

        //把结果设置到命令执行处
        if(StrUtil.isBlank(exeCmdTextAreaID.getText())){
            exeCmdTextAreaID.setText(result);
        }else{
            exeCmdTextAreaID.appendText(result);
        }

    }

    //初始化漏洞模式
    public void initModelVaule(){
        ObservableList<String> model = FXCollections.observableArrayList("靶场模式", "实战模式");
        modeValue.setItems(model);
        modeValue.setValue("靶场模式");
        modeValue.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println("成功选中");
                System.out.println("上一个选中的值="+oldValue);
                System.out.println("选中的值="+newValue);

            }
        });
    }

    //初始化漏洞编号
    public void initVulCodeValue(){
        ObservableList<String> vulStruts2Code = FXCollections.observableArrayList("all","0day","s2-005", "s2-009","s2-016");
        vulCode.setItems(vulStruts2Code);
        vulCode.setValue("s2-005");

        vulCode.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println("成功选中");
                System.out.println("上一个选中的值="+oldValue);
                System.out.println("选中的值="+newValue);
            }
        });
    }




}
