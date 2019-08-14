import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Header extends MenuBar {
    private Stage parent;
    private Menu menuFile = new Menu("File");
    private MenuItem menuFileNew = new MenuItem("New");
    private MenuItem menuFileEdit = new MenuItem("Edit");

    private Menu menuAbout = new Menu("About");
    private MenuItem menuAboutAbout = new MenuItem("About");

    Header(Stage parent) {
        this.parent = parent;
        this.getMenus().addAll(menuFile, menuAbout);
        menuFile.getItems().addAll(menuFileNew, menuFileEdit);
        menuAbout.getItems().addAll(menuAboutAbout);
        menuFileNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Click New. myparent ="+parent.getClass().getName());
            }
        });
    }
}
