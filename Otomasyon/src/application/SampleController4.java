package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.IsteMySQL.Util.VeritabaniUtil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/* Personel Ekle */

public class SampleController4 { 
	public SampleController4() {

	baglanti = VeritabaniUtil.Baglan();
}
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
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label baslik_lbl;

    @FXML
    private Button btn_Ekle;

    @FXML
    private Button btn_Temizle;

    @FXML
    private Button btn_kursiyer_ekle;


    @FXML
    private Button btn_kursiyer_list;


    @FXML
    private Button btn_personel_ekle;

    @FXML
    private Button btn_personel_list;


    @FXML
    private Button btn_sinifolustur;

    @FXML
    private Button btn_sinifsil;

    @FXML
    private Button btn_usinav_ekle;

    @FXML
    private Button btn_usinav_list;

    @FXML
    private Button btn_ysinav_ekle;

    @FXML
    private Button btn_ysinav_list;

    @FXML
    private Label lbl_Mesaj;

    @FXML
    private Label lbl_menu;

    @FXML
    private Menu menu_anasayfa;

    @FXML
    private Menu menu_yardim;

    @FXML
    private TextField txt_AD;

    @FXML
    private TextField txt_Belge;

    @FXML
    private TextField txt_Cepno;

    @FXML
    private TextField txt_Soyad;

    @FXML
    private TextField txt_Statü;

    @FXML
    private TextField txt_TC;
    Connection baglanti = null;
	PreparedStatement sorguIfadesi = null;
	ResultSet getirilen = null;
	String sql;
	


    @FXML
    void btn_Temizle_Click(ActionEvent event) {

    }


    @FXML
    void btn_kursiyer_ekle_Click(ActionEvent event) {
    	goToPage(event,"Sample6.fxml");
    }

    @FXML
    void btn_kursiyer_list_Click(ActionEvent event) {
    	goToPage(event, "Sample3.fxml");
    }


    @FXML
    void btn_personel_ekle_Click(ActionEvent event) {
    	goToPage(event, "Sample4.fxml");
    }


    @FXML
    void btn_personel_list_Click(ActionEvent event) {
    	goToPage(event, "Sample5.fxml");
    }

    @FXML
    void btn_sinifolustur_Click(ActionEvent event) {

    }

    @FXML
    void btn_sinifsil_Click(ActionEvent event) {

    }

    @FXML
    void btn_usinav_ekle_Click(ActionEvent event) {

    }

    @FXML
    void btn_usinav_list_Click(ActionEvent event) {

    }

    @FXML
    void btn_ysinav_ekle_Click(ActionEvent event) {

    }

    @FXML
    void btn_ysinav_list_Click(ActionEvent event) {

    }

    @FXML
    void menu_anasayfa_Click(ActionEvent event) {
    	goToPage(event, "Sample2.fxml");
    }

    @FXML
    void btn_Ekle_Click(ActionEvent event) {
    	
    	 sql = "insert into personel(Ad, Soyad, TC, Statü ,Tel_No, Belge) values(?,?,?,?,?,?)";
         try {
             sorguIfadesi = baglanti.prepareStatement(sql);
             sorguIfadesi.setString(1, txt_AD.getText().trim());
             sorguIfadesi.setString(2, txt_Soyad.getText().trim());
             sorguIfadesi.setString(3, txt_TC.getText().trim());
             sorguIfadesi.setString(4, txt_Statü.getText().trim());
             sorguIfadesi.setString(5, txt_Cepno.getText().trim());
             sorguIfadesi.setString(6, txt_Belge.getText().trim()); 
             sorguIfadesi.executeUpdate();
             lbl_Mesaj.setText("Kaydedildi.");
         } catch (Exception e) {
             e.printStackTrace();
             lbl_Mesaj.setText("HATA: " + e.getMessage().toString());
         }
    }

    @FXML
    void menu_yardim_Click(ActionEvent event) {

    }

    @FXML
    void initialize() {
     
    }


}

