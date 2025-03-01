package application;

import java.sql.Date;


public class kursiyerkayit {
	private int kID;
	private String TC_kimlik;
	private String Ad;
	private String Soyad;
	private String Baba_Ad;
	private String Anne_Ad;
	private String Cinsiyet;
	private String Doğum_Yeri;
	private Date Doğum_Tarihi;
	private String Cep_Tel;
	private Date Kayıt_Tarih;
	private String Kan_Grubu;
	private String Sınıf;
	private String Belge; 
	private int Kayıt_Ücret;
	public int getKayıt_Ücret() {
		return Kayıt_Ücret;
	}

	public void setKayıt_Ücret(int kayıt_Ücret) {
		Kayıt_Ücret = kayıt_Ücret;
	}

	public kursiyerkayit( String TC_kimlik, String Ad, String Soyad,
			String Baba_Ad,String Anne_Ad, String Cinsiyet, String Doğum_Yeri,
			Date Doğum_Tarihi, String Cep_Tel, 
			Date Kayıt_Tarih,String Kan_Grubu, String Sınıf,String Belge,int Kayıt_Ücret) {
		// TODO Auto-generated constructor stub
		
		this.TC_kimlik = TC_kimlik;
		this.Ad = Ad;
		this.Soyad = Soyad;
		this.Baba_Ad=Baba_Ad;
		this.Anne_Ad=Anne_Ad;
		this.Cinsiyet=Cinsiyet;
	    this.Doğum_Tarihi=Doğum_Tarihi;
		this.Doğum_Yeri=Doğum_Yeri;
		this.Cep_Tel = Cep_Tel;
		this.Kayıt_Tarih=Kayıt_Tarih;
		this.Kan_Grubu=Kan_Grubu;
		this.Sınıf=Sınıf;
		this.Belge = Belge;
		this.Kayıt_Ücret=Kayıt_Ücret;
}

public int getkID() {
	return kID;
}
public void setkID(int kID) {
	this.kID = kID;
}
public String getTC_kimlik() {
	return TC_kimlik;
}
public void setTC_kimlik(String tC_kimlik) {
	TC_kimlik = tC_kimlik;
}
public String getAd() {
	return Ad;
}
public void setAd(String ad) {
	Ad = ad;
}
public String getSoyad() {
	return Soyad;
}
public void setSoyad(String soyad) {
	Soyad = soyad;
}
public String getBaba_Ad() {
	return Baba_Ad;
}
public void setBaba_Ad(String baba_Ad) {
	Baba_Ad = baba_Ad;
}
public String getAnne_Ad() {
	return Anne_Ad;
}
public void setAnne_Ad(String anne_Ad) {
	Anne_Ad = anne_Ad;
}
public String getDoğum_Yeri() {
	return Doğum_Yeri;
}
public void setDoğum_Yeri(String doğum_Yeri) {
	Doğum_Yeri = doğum_Yeri;
}
public Date getDoğum_Tarihi() {
	return Doğum_Tarihi;
}
public void setDoğum_Tarihi(Date doğum_Tarihi) {
	Doğum_Tarihi = doğum_Tarihi;
}
public String getCinsiyet() {
	return Cinsiyet;
}
public void setCinsiyet(String cinsiyet) {
	Cinsiyet = cinsiyet;
}
public Date getKayıt_Tarih() {
	return Kayıt_Tarih;
}
public void setKayıt_Tarih(Date kayıt_Tarih) {
	Kayıt_Tarih = kayıt_Tarih;
}
public String getKan_Grubu() {
	return Kan_Grubu;
}
public void setKan_Grubu(String kan_Grubu) {
	Kan_Grubu = kan_Grubu;
}
public String getSınıf() {
	return Sınıf;
}
public void setSınıf(String sınıf) {
	Sınıf = sınıf;
}
public String getCep_Tel() {
	return Cep_Tel;
}
public void setCep_Tel(String cep_Tel) {
	Cep_Tel = cep_Tel;
}
public String getBelge() {
	return Belge;
}
public void setBelge(String belge) {
	Belge = belge;
}
}
