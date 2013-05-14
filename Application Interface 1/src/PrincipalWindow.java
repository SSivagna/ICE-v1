import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrincipalWindow extends Application
{
	private Scene scene;
	 
	public void start(Stage stage)
	{
		 BorderPane borderPane = new BorderPane();
	        
	        
	        borderPane.setId("appContainer");
	       
	        scene = new Scene(borderPane, 650,400);
	        
	        borderPane.setTop(createTitleBar());
	        borderPane.setCenter(createContentArea());
	        borderPane.setLeft(createImage());
	                
	        scene.getStylesheets().add(this.getClass().getResource("Blanc.css").toExternalForm());
	        
	        stage.setScene(scene);
	        
	        stage.setTitle("Intelligence Computer Espionnage");
	        stage.show();
	}
	
	public void init() throws Exception
	{
		super.init();
	}
	
	public static void main (String[] args)
	{
		launch(args);
	}
	
	private HBox createTitleBar() 
    {
        HBox titleBar = new HBox();
        titleBar.setId("appTitleBar");
        titleBar.setAlignment(Pos.CENTER);
        titleBar.setPrefHeight(75);
        
        Label titleLabel = new Label("Veuillez saisir votre code d'accès :");
        titleBar.getChildren().add(titleLabel);
        titleLabel.setId("appTitleText");
        
        return titleBar;
    }
	
	private GridPane createImage()
	{
		GridPane gridpane = new GridPane();
		
		ImageView mon_imageview = new ImageView(new Image(Image.class.getResourceAsStream("Images/prototype1.jpg")));
        mon_imageview.setFitHeight(10);
        mon_imageview.setPreserveRatio(true);
        gridpane.getChildren().add(mon_imageview);
        
		return gridpane;
	}
	
	private GridPane createContentArea() 
    {
        GridPane gp = new GridPane();
        
        gp.setVgap(15);     
        gp.setHgap(10);     
        gp.setAlignment(Pos.CENTER);
        
        gp.setId("appLoginContainer");
        
        PasswordField txtUsername = new PasswordField();
       
            
        HBox btnContainer = new HBox();
        Button btnLogin = new Button("Valider");
        Button btnCancel = new Button("Terminer");
        btnContainer.getChildren().addAll(btnCancel, btnLogin);
        
        btnContainer.setSpacing(15);
        btnContainer.setTranslateX(38);
        btnContainer.setAlignment(Pos.CENTER);
        
        gp.add(new Label("Code d'accès:"), 0,0);    //Row 0, Col 0
        gp.add(txtUsername, 1, 0);              //Row 0, Col 1  
        gp.add(btnContainer, 0, 2, 2, 1);       //Row 2, Col 0, Spans 2 cols.
        
        return gp;
    }
}