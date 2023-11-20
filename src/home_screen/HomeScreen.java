package home_screen;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class HomeScreen {

public static void showHomeScreen()throws Exception {
	try {
		Parent actorGroup = FXMLLoader.load(new URL(
				"file:/C:|\\Users\\pandi\\eclipse-workspace\\ShopeManagementJavaFxDB\\src\\home_screen\\Home_Screen2.fxml"));
		StageFactory.stage.setTitle("Customer Login");
		Scene scene = new Scene(actorGroup, 600, 400);
		StageFactory.stage.setScene(scene);
		StageFactory.stage.setFullScreen(true);
		StageFactory.stage.show();
	} catch (Exception e) {
		e.printStackTrace();

	}
}
}