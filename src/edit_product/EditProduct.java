package edit_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditProduct {
	public static void showEditProductScreen() throws Exception {
		Parent actorGroup = FXMLLoader.load(new URL(
				"file:///C|/Users//tambe//eclipse-workspace//ShopManagementJavaFxDB//src//edit_product//editProductScreen.fxml"));
		StageFactory.stage.setTitle("Edit Peoduct");

		StageFactory.stage.setFullScreen(true);
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();

	}

}
