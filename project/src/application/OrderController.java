package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OrderController {
	
	@FXML
	private Label lblOrder;
	
	public void Order(ActionEvent event) throws Exception{
		lblOrder.setText("Hamburger and Water is being prepared");
	}

}
