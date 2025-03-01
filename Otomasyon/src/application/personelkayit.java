package application;


	public class personelkayit {
		private int pID;
		private String TC;
		private String Ad;
		private String Soyad;
		private String Statü;
		private String Tel_No;
		private String Belge;
		public personelkayit(String TC, String Ad,String Soyad,String Statü, String Tel_No, String Belge) {
			
			this.TC = TC;
			this.Ad = Ad;
			this.Soyad = Soyad;
			this.Statü=Statü;
			this.Tel_No = Tel_No;
			this.Belge = Belge;
		}
		public int getpID() {
			return pID;
		}
		public void setpID(int pID) {
			this.pID = pID;
		}
		public String getTC() {
			return TC;
		}
		public void setTC(String tC) {
			TC = tC;
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
		public String getStatü() {
			return Statü;
		}
		public void setStatü(String statü) {
			Statü = statü;
		}
		public String getTel_No() {
			return Tel_No;
		}
		public void setTel_No(String tel_No) {
			Tel_No = tel_No;
		}
		public String getBelge() {
			return Belge;
		}
		public void setBelge(String belge) {
			Belge = belge;
		}
	}

