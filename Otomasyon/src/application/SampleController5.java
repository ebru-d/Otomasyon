package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.IsteMySQL.Util.VeritabaniUtil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/* Personel Listele */

public class SampleController5 {
	public SampleController5() {

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
    private TableColumn<personelkayit, String> Tab_Soyad;
    
    @FXML
    private Button btn_ekle;

    @FXML
    private Label baslik_lbl;

    @FXML
    private Button btn_kursiyer_ekle;

    @FXML
    private Button btn_kursiyer_gncl;

    @FXML
    private Button btn_kursiyer_list;

    @FXML
    private Button btn_kursiyer_sil;

    @FXML
    private Button btn_personel_ekle;

    @FXML
    private Button btn_personel_gncl;

    @FXML
    private Button btn_personel_list;

    @FXML
    private Button btn_personel_sil;

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
    private Label lbl_menu;

    @FXML
    private Menu menu_anasayfa;

    @FXML
    private Menu menu_yardim;
    
    @FXML
    private Button btn_sil;
    
    @FXML
    private Button btn_guncelle;
    
    @FXML
    private Button btn_yonetici;
    
    @FXML
    private Button btn_cikis;


    @FXML
    private TableColumn<personelkayit, String> tab_AD;

    @FXML
    private TableColumn<personelkayit, String> tab_Belge;

    @FXML
    private TableColumn<personelkayit, String> tab_Cepno;

    @FXML
    private TableColumn<personelkayit, String> tab_Statü;

    @FXML
    private TableColumn<personelkayit, String> tab_TC;

    @FXML
    private TableView<personelkayit> tbl_personel;
    Connection baglanti = null;
	PreparedStatement sorguIfadesi = null;
	ResultSet getirilen = null;
	String sql;
	
	public void DegerleriGetir(TableView<?> tablo) {
		sql = "select * from personel";
		ObservableList<personelkayit> kayıtlarliste = FXCollections.observableArrayList();
		try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			ResultSet getirilen = sorguIfadesi.executeQuery();
			while (getirilen.next()) {
				kayıtlarliste.add(new personelkayit(getirilen.getString("TC"), getirilen.getString("Ad"),
						getirilen.getString("Soyad"), getirilen.getString("Statü"), getirilen.getString("Tel_No"), getirilen.getString("Belge")));
			}
			tab_TC.setCellValueFactory(new PropertyValueFactory<>("TC"));
			tab_AD.setCellValueFactory(new PropertyValueFactory<>("Ad"));
			Tab_Soyad.setCellValueFactory(new PropertyValueFactory<>("Soyad"));
			tab_Statü.setCellValueFactory(new PropertyValueFactory<>("Statü")); 
			tab_Cepno.setCellValueFactory(new PropertyValueFactory<>("Tel_No"));
			tab_Belge.setCellValueFactory(new PropertyValueFactory<>("Belge"));
			tbl_personel.setItems(kayıtlarliste);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage().toString());
	}
}
	  @FXML
	    void btn_guncelle_Click(ActionEvent event) {

	    }
	  @FXML
	    void btn_cikis_Click(ActionEvent event) {
		  Stage stage = (Stage) btn_cikis.getScene().getWindow();
		    stage.close();
	    }
	  
	  @FXML
	    void btn_yonetici_Click(ActionEvent event) {

	    }
	   @FXML
	    void btn_ekle_Click(ActionEvent event) {

	    }
	  @FXML
	    void btn_sil_Click(ActionEvent event) {
		  personelkayit selectedPersonel = tbl_personel.getSelectionModel().getSelectedItem();
		    if (selectedPersonel != null) {
		        sql = "DELETE FROM personel WHERE TC = ?";
		        try {
		            sorguIfadesi = baglanti.prepareStatement(sql);
		            sorguIfadesi.setString(1, selectedPersonel.getTC());
		            sorguIfadesi.executeUpdate();
		            DegerleriGetir(tbl_personel); // Tabloyu güncelle
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

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
         goToPage(event,"Sample4.fxml");
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
    void menu_yardim_Click(ActionEvent event) {

    }

    @FXML
    void initialize() {
       DegerleriGetir(tbl_personel);

    }

}
