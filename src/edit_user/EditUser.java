package edit_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditUser {
	public static void showEditUserScreen() throws Exception {
		Parent actorGroup = FXMLLoader.load(new URL(
				"file:///C:\\Users\\pandi\\eclipse-workspace\\ShopeManagementJavaFxDB\\src\\edit_user\\Edit_User.fxml"));
		StageFactory.stage.setTitle("Edit User");
		StageFactory.stage.setFullScreen(true);

		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();

	}

}
