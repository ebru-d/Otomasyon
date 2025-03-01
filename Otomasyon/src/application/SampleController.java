package application;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/* Login Sayfası */

public class SampleController {
	
	public SampleController() {
		baglanti = VeritabaniUtil.Baglan();		
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_cikis;

    @FXML
    private Button btn_giris;

    @FXML
    private Label lbl_1;

    @FXML
    private Label lbl_11;

    @FXML
    private Label lbl_baslik;

    @FXML
    private Label lbl_mesaj;

    @FXML
    private TextField txt_kul;
 
    @FXML
    private PasswordField txt_sifre;
    
    Connection baglanti=null;
    PreparedStatement sorguifadesi=null;
    ResultSet getirilen=null;
    String sql;

    @FXML
    void btn_cikis_Click(ActionEvent event) {
    	 Stage stage = (Stage) btn_cikis.getScene().getWindow();
    	    stage.close();

    }

    @FXML
    void btn_giris_Click(ActionEvent event) {
    	sql = "select * from login where kul_adi=? and sifre=?";
        try {
            sorguifadesi = baglanti.prepareStatement(sql);
            sorguifadesi.setString(1, txt_kul.getText().trim());
            sorguifadesi.setString(2, txt_sifre.getText().trim());

            ResultSet getirilen = sorguifadesi.executeQuery();
            if (getirilen.next()) {
            	 try {
            		 
            		 System.out.println(getClass().getResource("Sample2.fxml"));
                 	FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample2.fxml"));
                     Parent root = loader.load();
                     Scene scene = new Scene(root);
                     Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                     stage.setScene(scene);
                     stage.show();
            	      }
                  catch (Exception e) {
                     e.printStackTrace();
                      }
                    }       
            	 else {
                     lbl_mesaj.setText("Kullanıcı Adı veya Şifre Hatalı");
                 } 
            }
            	 catch (Exception e) {
					// TODO: handle exception
            		 lbl_mesaj.setText(e.getMessage().toString());
                     e.printStackTrace();
				}
    }

    @FXML
    void initialize() {
       
    }

}


