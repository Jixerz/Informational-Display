
package informational.display;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
/**
 *
 * @author Jixer
 */
public class InformationalDisplay extends Application {
    
    @Override
    public void start(Stage primaryStage) {

       
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image = new Image("image/game.jpg");
        
        
        Button btn = new Button();
        btn.setText("Click Me");
        btn.setPrefWidth(100);
        btn.setPrefHeight(15);
        btn.setTranslateX(0);
        btn.setTranslateY(200);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Label label = new Label(" -JavaFX- ");
        label.setFont(Font.font("Courier", FontWeight.BOLD, 32));
        label.setTranslateX(0);
        label.setTranslateY(-200);
            
        pane.setPadding(new Insets(5, 5, 5, 5));
        Text text1 = new Text(50, 50, "Pew Pew Pew Pew Pew Pew Pew Pew Pew Pew Pew Pew");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 10));
        text1.setFill(Color.WHITE);
        text1.setTranslateX(0);
        text1.setTranslateY(100);
        
        StackPane layout = new StackPane();       
        layout.getChildren().add(new ImageView(image));
        layout.getChildren().add(btn);
        layout.getChildren().add(label);
        Scene scene = new Scene(layout, 750, 500);
        layout.getChildren().add(text1);
        
        primaryStage.setTitle("Info Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
