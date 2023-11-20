package shop_management_main;

import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;

public class ApplicationMain extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		LoginScreen.showLoginScreen(stage);
		
	}

}
