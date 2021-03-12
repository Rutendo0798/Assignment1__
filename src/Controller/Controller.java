package Controller;
import Models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;




public class Controller implements Initializable {

    @FXML
    private Label FirstName,LastName,getStuID;
    @FXML
    private TextArea textArea;


    @FXML
    private ImageView imageView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Student student = new Student("rutendo", "mauto", 200468527);

        /*
        setting the label text to be equal to the first name
         */
        FirstName.setText(student.getFirst_name());
    /*
    setting the label text will contain the last name
     */
        LastName.setText(student.getLast_name());

        /*
        Convert type long into string
         */
        String s = String.valueOf(student.getStu_id());

        /*
        insert the value of s onto label getStuID
         */
        getStuID.setText(s);

    /*
    iterate the getActivities method through the for loop, which will pass values stored
    in the ArrayList
     */
        int i;
        for (i = 0; i < student.getActivities().size(); i++) {
            /*
            a space is inserted after a value is inserted in the areaText
             */
            textArea.appendText((" "+student.getActivities().get(i)+"\n"));
        }

        imageView.setImage(student.getStu());







    }
    }




