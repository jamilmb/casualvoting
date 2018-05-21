package Source;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller class for the voting application.
 * @author Simon Curtis
 */
public class LoginController implements Initializable{
	/*
	 * Instance variables:
	 */
	
	/* The GUI components from the FXML file */
	@FXML
	private Button login$loginbutton;
	@FXML
	private Button login$registerButton;
	@FXML
	private TextField login$usernameTextField;
	@FXML
	private TextField login$passwordTextField;
	@FXML
	private ComboBox login$titleDropdown;
	@FXML
	private TextField login$firstnameTextField;
	@FXML
	private TextField login$surnameTextField;
	@FXML
	private TextField login$dobTextField;
	@FXML
	private TextField login$emailTextField;
	@FXML
	private TextField login$otherUsernameTextField;
	@FXML
	private TextField login$otherPasswordTextField;
	@FXML
	private TextField login$repeatPasswordTextField;
	@FXML
	private Button homeButton;
	@FXML
	private Button logoutButton;
	@FXML
	private Button backButton;
	
	
	/**
	 * A method to handle the GUI initialisation.
	 * 
	 * @param location The location of the root object.
	 * @param resources The resources to localise the root.
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		handleloginActions();
	}
	
	/*
	 * A method to create all of the button handlers for the login scene.
	 */
	private void handleloginActions(){
		login$loginbutton.setOnAction(verifyAndLogin());
		login$registerButton.setOnAction(register());
	}

	/*
	 * Checks if the login details are correct and if so, changes the screen to the home screen
	 */
	private EventHandler<ActionEvent> verifyAndLogin(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				try {
					Parent p = FXMLLoader.load(getClass().getResource("accountHome.fxml"));
					Scene nextScene = new Scene(p);
					
					Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
					
					window.setScene(nextScene);
					window.show();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		return event;
	}
	
	/*
	 * Registers an account with the details in thetextfields
	 */
	private EventHandler<ActionEvent> register(){
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				
			}
		};
		return event;
	}
	
	
}