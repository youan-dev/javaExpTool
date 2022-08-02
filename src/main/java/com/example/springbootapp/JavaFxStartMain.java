package com.example.springbootapp;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXDrawersStack;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static javafx.scene.input.MouseEvent.MOUSE_PRESSED;
import static javax.swing.JSplitPane.*;


public class JavaFxStartMain extends Application {

    public static void startMain(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("==========daffdffs");
        Parent root = FXMLLoader.load(getClass().getResource("/example/coding/admin_main.fxml"));
        Scene scene1 = new Scene(root);

        stage.setScene(scene1);
        stage.setTitle("JAVA漏洞扫描工具");
        stage.getIcons().add(new Image("/Image/huc.jpg"));
        //stage.setScene(new Scene(new Group()));
        stage.setResizable(false);
        stage.show();

        //创建树项
//        TreeItem root1 = new TreeItem("Programming Languages");
//        TreeItem item1 = new TreeItem("Java");
//        TreeItem item2 = new TreeItem("Python");
//        TreeItem item3 = new TreeItem("C++");
//        //将元素添加到root1-
//        root1.getChildren().addAll(item1, item2, item3);
//        TreeItem root2 = new TreeItem("NoSQL Databases");
//        TreeItem item4 = new TreeItem("Neo4j");
//        TreeItem item5 = new TreeItem("HBase");
//        TreeItem item6 = new TreeItem("Cassandra");
//        //将元素添加到root2-
//        root2.getChildren().addAll(item4, item5, item6);
//        TreeItem root3 = new TreeItem("Bigdata & Analytics");
//        TreeItem item7 = new TreeItem("Hadoop");
//        TreeItem item8 = new TreeItem("Mahout");
//        TreeItem item9 = new TreeItem("Hive");
//        //将元素添加到root2-
//        root3.getChildren().addAll(item7, item8, item9);
//        //列表查看学历
//        TreeItem<String> base = new TreeItem<String>("Technologies");
//        base.setExpanded(true);
//        base.getChildren().addAll(root1, root2, root3);
//        //创建一个TreeView项目
//        TreeView view = new TreeView(base);
//        view.setPrefHeight(300);
//        VBox pane = new VBox(10);
//        pane.setPadding(new Insets(5, 5, 5, 50));
//        pane.getChildren().addAll(view);
//        //设置舞台
//        Group node = new Group(pane);
//        Scene scene = new Scene(node, 595, 320, Color.BEIGE);
//        stage.setTitle("List View Example");
//        stage.setScene(scene);
//        stage.show();
//        FlowPane content = new FlowPane();
//        JFXButton leftButton = new JFXButton(LEFT);
//        JFXButton topButton = new JFXButton(TOP);
//        JFXButton rightButton = new JFXButton(RIGHT);
//        JFXButton bottomButton = new JFXButton(BOTTOM);
//        content.getChildren().addAll(leftButton, topButton, rightButton, bottomButton);
//        content.setMaxSize(200, 200);
//
//
//        JFXDrawer leftDrawer = new JFXDrawer();
//        StackPane leftDrawerPane = new StackPane();
//        leftDrawerPane.getStyleClass().add("red-400");
//        leftDrawerPane.getChildren().add(new JFXButton("Left Content"));
//        leftDrawer.setSidePane(leftDrawerPane);
//        leftDrawer.setDefaultDrawerSize(150);
//        leftDrawer.setResizeContent(true);
//        leftDrawer.setOverLayVisible(false);
//        leftDrawer.setResizableOnDrag(true);
//
//
//        JFXDrawer bottomDrawer = new JFXDrawer();
//        StackPane bottomDrawerPane = new StackPane();
//        bottomDrawerPane.getStyleClass().add("deep-purple-400");
//        bottomDrawerPane.getChildren().add(new JFXButton("Bottom Content"));
//        bottomDrawer.setDefaultDrawerSize(150);
//        bottomDrawer.setDirection(JFXDrawer.DrawerDirection.BOTTOM);
//        bottomDrawer.setSidePane(bottomDrawerPane);
//        bottomDrawer.setResizeContent(true);
//        bottomDrawer.setOverLayVisible(false);
//        bottomDrawer.setResizableOnDrag(true);
//
//
//        JFXDrawer rightDrawer = new JFXDrawer();
//        StackPane rightDrawerPane = new StackPane();
//        rightDrawerPane.getStyleClass().add("blue-400");
//        rightDrawerPane.getChildren().add(new JFXButton("Right Content"));
//        rightDrawer.setDirection(JFXDrawer.DrawerDirection.RIGHT);
//        rightDrawer.setDefaultDrawerSize(150);
//        rightDrawer.setSidePane(rightDrawerPane);
//        rightDrawer.setOverLayVisible(false);
//        rightDrawer.setResizableOnDrag(true);
//
//
//        JFXDrawer topDrawer = new JFXDrawer();
//        StackPane topDrawerPane = new StackPane();
//        topDrawerPane.getStyleClass().add("green-400");
//        topDrawerPane.getChildren().add(new JFXButton("Top Content"));
//        topDrawer.setDirection(JFXDrawer.DrawerDirection.TOP);
//        topDrawer.setDefaultDrawerSize(150);
//        topDrawer.setSidePane(topDrawerPane);
//        topDrawer.setOverLayVisible(false);
//        topDrawer.setResizableOnDrag(true);
//
//
//        JFXDrawersStack drawersStack = new JFXDrawersStack();
//        drawersStack.setContent(content);
//
//        leftDrawer.setId(LEFT);
//        rightDrawer.setId(RIGHT);
//        bottomDrawer.setId(BOTTOM);
//        topDrawer.setId(TOP);
//
//        leftButton.addEventHandler(MOUSE_PRESSED, e -> drawersStack.toggle(leftDrawer));
//        bottomButton.addEventHandler(MOUSE_PRESSED, e -> drawersStack.toggle(bottomDrawer));
//        rightButton.addEventHandler(MOUSE_PRESSED, e -> drawersStack.toggle(rightDrawer));
//        topButton.addEventHandler(MOUSE_PRESSED, e -> drawersStack.toggle(topDrawer));
//
//
//        final Scene scene = new Scene(drawersStack, 800, 800);
//        final ObservableList<String> stylesheets = scene.getStylesheets();
////        stylesheets.addAll(DrawerDemo.class.getResource("/css/jfoenix-components.css").toExternalForm(),
////                DrawerDemo.class.getResource("/css/jfoenix-design.css").toExternalForm());
//
//        stage.setTitle("JFX Drawer Demo");
//        stage.setScene(scene);
//        stage.setResizable(true);
//        stage.show();

    }
}
