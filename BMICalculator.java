// standard javafx imports
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;

// imports for this application
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

// layouts
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;

public class BMICalculator extends Application {
	
	// declare components used
	Label lblWeight, lblHeight;
	
	TextField txtWeight, txtHeight, txtBMI;
	
	Button btnBMI;

	public BMICalculator() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init() {
		// create control instances
		lblWeight = new Label ("Weight in kg");
		lblHeight = new Label ("Height in m");
		
		txtWeight = new TextField ("");
		txtHeight = new TextField ("");
		txtBMI = new TextField ("");
		
		btnBMI = new Button ("BMI");
		
		// button size
		btnBMI.setMinWidth(70);
		
		// textfield size
		txtWeight.setMinWidth(70);
		txtHeight.setMinWidth(70);
		txtBMI.setMinWidth(70);
		
		// handle clicks on BMI button
		btnBMI.setOnAction(ae->{
			double weight = Double.parseDouble(txtWeight.getText());
			double height = Double.parseDouble(txtHeight.getText());
			double bMI = weight / (height * height);
			txtBMI.setText(String.format("%.2f", bMI));
			
			/*
			if (bMI < 18.5) {
				System.out.println("You are underweight");
			}
			else if 
			*/
			
		});
	}

	@Override
	public void start(Stage pStage) throws Exception {
		
		//Set the title.
		pStage.setTitle("BMI Calculator");
				
		//Create a layout.
		GridPane gp = new GridPane();
		
		gp.add(lblWeight, 0, 0);
		gp.add(txtWeight, 1, 0);
		gp.add(lblHeight, 0, 3);
		gp.add(txtHeight, 1, 3);
		gp.add(btnBMI, 0, 6);
		gp.add(txtBMI, 1, 6);
		
		//Layout.
		gp.setPadding(new Insets(15));
		gp.setHgap(10);
		gp.setVgap(10);
		
		//Create a vertical box layout component.
		HBox buttonBox = new HBox();
		buttonBox.setPadding(new Insets(10));
		buttonBox.setSpacing(8);
		buttonBox.setAlignment(Pos.BASELINE_LEFT);
		
		//Create a scene.
		Scene scene = new Scene(gp, 400,200);
				
		
		//Add the scene.
		pStage.setScene(scene);
						
		//Show the stage.
		pStage.show();				

	}
	
	@Override
	public void stop(){
		
	}

	public static void main(String[] args) {
		
		// launch the application
		launch(args);

	}

}
