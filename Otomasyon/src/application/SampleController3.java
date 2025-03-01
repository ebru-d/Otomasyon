package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.IsteMySQL.Util.VeritabaniUtil;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
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

/* Kursiyer Liste */ 

public class SampleController3 {
	public SampleController3() {

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
    private TableColumn<kursiyerkayit, String> Tab_Soyad;

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
    private Button btn_guncelle;

    @FXML
    private Button btn_sil;
    
    @FXML
    private Button btn_cikis;
    
    @FXML
    private Button btn_yonetici;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_AD;
    @FXML
    private TableColumn<kursiyerkayit, String> tab_Belge;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_Cepno;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_Cinsiyet;

    @FXML
    private TableColumn<kursiyerkayit, Date> tab_Dogumtarihi;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_Dogumyeri;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_Kan;

    @FXML
    private TableColumn<kursiyerkayit, Date> tab_Kayıttarih;

    @FXML
    private TableColumn<kursiyerkayit, Integer> tab_Kayıtucret;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_Sınıf;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_TC;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_anAd;

    @FXML
    private TableColumn<kursiyerkayit, String> tab_bAd;

    @FXML
    private TableView<kursiyerkayit> tbl_kursiyer;
    Connection baglanti = null;
	PreparedStatement sorguIfadesi = null;
	ResultSet getirilen = null;
	String sql;
	
	public void DegerleriGetir(TableView<?> tablo) {
		sql = "select * from kursiyer";
		ObservableList<kursiyerkayit> kayıtlarliste = FXCollections.observableArrayList();
		try {
			sorguIfadesi = baglanti.prepareStatement(sql);
			ResultSet getirilen = sorguIfadesi.executeQuery();
			while (getirilen.next()) {
				kayıtlarliste.add(new kursiyerkayit(getirilen.getString("TC_kimlik"), getirilen.getString("Ad"),
						getirilen.getString("Soyad"), getirilen.getString("Baba_Ad"), getirilen.getString("Anne_Ad"),
						getirilen.getString("Cinsiyet"), getirilen.getString("Doğum_Yeri"), getirilen.getDate("Doğum_Tarihi"), getirilen.getString("Cep_Tel"),
						getirilen.getDate("Kayıt_Tarih"), getirilen.getString("Kan_Grubu"),
						getirilen.getString("Sınıf"), getirilen.getString("Belge"), getirilen.getInt("Kayıt_Ücret")));
			}

			tab_TC.setCellValueFactory(new PropertyValueFactory<>("TC_kimlik"));
			tab_AD.setCellValueFactory(new PropertyValueFactory<>("Ad"));
			Tab_Soyad.setCellValueFactory(new PropertyValueFactory<>("Soyad"));
			tab_bAd.setCellValueFactory(new PropertyValueFactory<>("Baba_Ad"));
			tab_anAd.setCellValueFactory(new PropertyValueFactory<>("Anne_Ad"));
			tab_Cinsiyet.setCellValueFactory(new PropertyValueFactory<>("Cinsiyet")); 
			tab_Dogumyeri.setCellValueFactory(new PropertyValueFactory<>("Doğum_Yeri"));
			tab_Dogumtarihi.setCellValueFactory(new PropertyValueFactory<>("Doğum_Tarihi"));
			tab_Cepno.setCellValueFactory(new PropertyValueFactory<>("Cep_Tel"));
			tab_Kayıttarih.setCellValueFactory(new PropertyValueFactory<>("Kayıt_Tarih"));
			tab_Kan.setCellValueFactory(new PropertyValueFactory<>("Kan_Grubu"));
			tab_Sınıf.setCellValueFactory(new PropertyValueFactory<>("Sınıf"));
			tab_Belge.setCellValueFactory(new PropertyValueFactory<>("Belge"));
			tab_Kayıtucret.setCellValueFactory(new PropertyValueFactory<>("Kayıt_Ücret"));
			tbl_kursiyer.setItems(kayıtlarliste);
			

		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();		}
	}
	@FXML
	void btn_sil_Click(ActionEvent event) {
	    kursiyerkayit selectedKursiyer = tbl_kursiyer.getSelectionModel().getSelectedItem();
	    if (selectedKursiyer != null) {
	        sql = "DELETE FROM kursiyer WHERE TC_kimlik = ?";
	        try {
	            sorguIfadesi = baglanti.prepareStatement(sql);
	            sorguIfadesi.setString(1, selectedKursiyer.getTC_kimlik());
	            sorguIfadesi.executeUpdate();
	            tbl_kursiyer.getItems().remove(selectedKursiyer);
	            DegerleriGetir(tbl_kursiyer);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

    @FXML
    void btn_kursiyer_ekle_Click(ActionEvent event) {
    	goToPage(event, "Sample6.fxml");

    }
    @FXML
    void btn_guncelle_Click(ActionEvent event) {
    
    } 
    
    @FXML
    void btn_yonetici_Click(ActionEvent event) {

    }
    
    @FXML
    void btn_cikis_Click(ActionEvent event) {
    	Stage stage = (Stage) btn_cikis.getScene().getWindow();
	    stage.close();
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
    void menu_yardim_Click(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	DegerleriGetir(tbl_kursiyer);
    }

}
