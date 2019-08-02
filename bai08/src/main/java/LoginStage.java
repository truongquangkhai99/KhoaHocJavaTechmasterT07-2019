import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginStage extends Stage implements IMyStage{
    private Scene scene;
    private VBox vbox = new VBox();;
    private HBox hBox = new HBox();

    private Label lblWelcome = new Label("Welcome to my App");
    private TextField txtEmail = new TextField();
    private PasswordField txtPassword = new PasswordField();
    private Button btnLogin = new Button("Login");
    private Button btnCancel = new Button("Cancel");
    private Label lblInfo = new Label("");

    public LoginStage() {
        super();
        setupUI();
    }
    @Override
    public void setupUI() {
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 30, 10, 30));
        scene = new Scene(vbox, 250, 250);
        vbox.getChildren().addAll(lblWelcome, txtEmail, txtPassword, hBox, lblInfo);
        lblWelcome.setFont(Font.font(15));
        lblWelcome.setAlignment(Pos.BASELINE_CENTER);

        this.setScene(scene);
        hBox.getChildren().addAll(btnLogin, btnCancel);
        hBox.setSpacing(30);
        hBox.setAlignment(Pos.CENTER);
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(txtEmail.getText().equals("hoang@gmail.com") &&
                    txtPassword.getText().equals("123456")){
                    lblInfo.setText("Login successfully");
                    lblInfo.setTextFill(Color.web("#00ff00"));
                    DepartmentsStage departmentsStage = new DepartmentsStage(LoginStage.this);
                    departmentsStage.show();
                    LoginStage.this.hide();
                } else {
                    lblInfo.setTextFill(Color.web("#8D2A2B"));
                    lblInfo.setText("Login Failed");
                }
            }
        });
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lblInfo.setText("");
            }
        });
    }
}
