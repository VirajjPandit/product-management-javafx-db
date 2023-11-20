package login;

import java.sql.ResultSet;
import java.sql.SQLException;
import db_operation.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {

	@FXML

	private TextField loginName;

	@FXML

	private TextField password;

	@FXML

	private Button loginButton;

	public void login(ActionEvent event) throws SQLException 
	{

		System.out.println(loginName.getText());
		System.out.println(password.getText());

		boolean loginStatus = LoginScreenController.ValidateUserAndPassword(loginName.getText(), password.getText());

		if (loginStatus) 
		{
			HomeScreen.showHomeScreen();
		
		} else {
			System.out.println("Login unsuccessfull");
		}
	}

	public static boolean ValidateUserAndPassword(String LoginName, String password) throws SQLException {
		String query = " Select * from User where LoginName='" + LoginName + "' and password = '" + password + "' ";

		ResultSet rs = DBUtils.executeQueryGetResult(query);

		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
