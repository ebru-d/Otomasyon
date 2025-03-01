
package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
public class SampleController2 {
	
	public  void goToPage(ActionEvent event, String fileName ) {
	    try {

	        FXMLLoader loader = new FXMLLoader(getClass().getResource(fileName));
	        Parent root = loader.load();
	        Scene scene = new Scene(root);
	        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        stage.setScene(scene);
	        stage.show();
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	@FXML 
    private Label baslik_lbl; // Value injected by FXMLLoader

    @FXML 
    private Button btn_cikis; // Value injected by FXMLLoader

    @FXML 
    private Button btn_kursiyer; // Value injected by FXMLLoader

    @FXML 
    private Button btn_personel; // Value injected by FXMLLoader

    @FXML 
    private Button btn_sinav; // Value injected by FXMLLoader

    @FXML 
    private Button btn_sinif; // Value injected by FXMLLoader

    @FXML  
    private Button btn_yonetici; // Value injected by FXMLLoader

    @FXML  
    private Label lbl_altbaslik; // Value injected by FXMLLoader

    @FXML 
    private Menu menu_anasayfa; // Value injected by FXMLLoader

    @FXML 
    private Menu menu_yardim; // Value injected by FXMLLoader
    
    @FXML
    private ImageView image_araba; // Value injected by FXMLLoader
    

    @FXML
    void btn_cikis_Click(ActionEvent event) {
    	 Stage stage = (Stage) btn_cikis.getScene().getWindow();
    	    stage.close();

    }

    @FXML
    void btn_kursiyer_Click(ActionEvent event) {
    	 goToPage(event, "Sample3.fxml");
    }

    @FXML
    void btn_personel_Click(ActionEvent event) {
     	goToPage(event, "Sample5.fxml");
    }

    @FXML
    void btn_sinav_Click(ActionEvent event) {

    }

    @FXML
    void btn_yonetici_Click(ActionEvent event) {

    }

    @FXML
    void menu_anasayfa_Click(ActionEvent event) {

    }

    @FXML
    void menu_yardim_Click(ActionEvent event) {

    }
    
    @FXML
    void btn_sinif_Click(ActionEvent event) {

    }

 
 

}
