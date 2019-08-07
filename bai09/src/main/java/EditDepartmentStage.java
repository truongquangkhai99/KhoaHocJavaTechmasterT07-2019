import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EditDepartmentStage extends Stage implements IMyStage{
    private DepartmentsStage departmentsStage;
    private Scene scene;
    private GridPane gridPane = new GridPane();

    private Label lblTitle = new Label("Add new Department");
    private Label lblName = new Label("Name:");
    private TextField txtName = new TextField();
    private Label lblDescription = new Label("Description:");
    private TextField txtDescription = new TextField();
    private Button btnSave = new Button("Save");
    private Button btnCancel = new Button("Cancel");

    EditDepartmentStage(DepartmentsStage departmentsStage) {
        this.departmentsStage = departmentsStage;
        setupUI();
    }

    @Override
    public void setupUI() {
        scene = new Scene(gridPane, 300, 200);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10,10,10,10));
        this.setScene(scene);
        gridPane.add(lblTitle, 0,0,2, 1);
        gridPane.add(lblName, 0,1);
        gridPane.add(txtName, 1,1);
        gridPane.add(lblDescription, 0,2);
        gridPane.add(txtDescription, 1,2);
        gridPane.add(btnSave, 0,3);
        gridPane.add(btnCancel, 1,3);

    }
}
