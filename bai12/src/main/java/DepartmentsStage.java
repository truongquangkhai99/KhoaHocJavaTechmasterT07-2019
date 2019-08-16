import com.sun.rowset.internal.Row;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import models.Department;

import java.util.Observable;

public class DepartmentsStage extends Stage implements IMyStage{
    private EditDepartmentStage editDepartmentStage;
    private Header header;
    private Scene scene ;
    private VBox vBox = new VBox();
    private Label lblTitle = new Label("List of Departments");

    private TableView<Department> tableView = new TableView<Department>();
    private TableColumn columnDepartmentId = new TableColumn("ID");
    private TableColumn columnDepartmentName = new TableColumn("Tên phòng");
    private TableColumn columnDepartmentDescription = new TableColumn("Mô tả");

    private ContextMenu contextMenu = new ContextMenu();
    private MenuItem menuItemAdd = new MenuItem("Add");
    private MenuItem menuItemDelete = new MenuItem("Delete");
    private MenuItem menuItemProperties = new MenuItem("Properties");

    private ObservableList<Department> departments
            = FXCollections.observableArrayList();

    private Button btnInsertDepartment = new Button("Add new Department");


    private LoginStage loginStage;//relation
    DepartmentsStage(LoginStage loginStage) {
        this.loginStage = loginStage;
        departments = Database.getInstance().getDepartments();
        setupUI();
    }

    @Override
    public void setupUI() {
        scene = new Scene(vBox, 500, 500);
        this.setScene(scene);
        header = new Header(this);
        vBox.getChildren().addAll(header, lblTitle, tableView, btnInsertDepartment);
        lblTitle.setFont(Font.font(20));
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10,10, 10, 10));
        tableView.getColumns().addAll(columnDepartmentId,
                columnDepartmentName, columnDepartmentDescription);
        tableView.setItems(departments);

        columnDepartmentId.setMinWidth(150);
        columnDepartmentId.setStyle( "-fx-alignment: CENTER-LEFT;");
        columnDepartmentId.setCellValueFactory(new PropertyValueFactory<>("id"));

        columnDepartmentName.setMinWidth(100);
        columnDepartmentName.setStyle( "-fx-alignment: CENTER;");
        columnDepartmentName.setCellValueFactory(new PropertyValueFactory<>("name"));

        columnDepartmentDescription.setMinWidth(200);
        columnDepartmentDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        this.setOnHiding(event -> {
            this.editDepartmentStage.close();
            this.editDepartmentStage = null;
        });
        tableView.setRowFactory(tv ->{
            final TableRow<Department> row = new TableRow<Department>();
            row.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    //System.out.println("click");
                    if(event.getClickCount() == 2) {
                        System.out.println("double click");
                    } else if(event.getButton() == MouseButton.SECONDARY) {
                        System.out.println("right click");
                        contextMenu.show(tableView, event.getScreenX(), event.getScreenY());
                    }
                }
            });
            return row;
        });
        menuItemAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (editDepartmentStage == null) {
                    editDepartmentStage = new EditDepartmentStage(DepartmentsStage.this);
                }
                editDepartmentStage.show();
            }
        });
        btnInsertDepartment.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (editDepartmentStage == null) {
                    editDepartmentStage = new EditDepartmentStage(DepartmentsStage.this);
                }
                editDepartmentStage.show();
            }
        });
        contextMenu.getItems().addAll(menuItemAdd, menuItemDelete, menuItemProperties);
    }
    public boolean insertDepartment(Department newDepartment) {
        //check identity, identity constraints...
        for(Department department: departments) {
            if(department.getName().equals(newDepartment.getName())){
                return false;
            }
        }
        this.departments.add(newDepartment);
        //reload tableview.
        tableView.refresh();
        this.editDepartmentStage.close();
        this.editDepartmentStage = null;
        return true;
    }

}

