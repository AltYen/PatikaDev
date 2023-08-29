package OOP.Interface;

public class BBanka implements IBanka {
    private String bankaAd;
    private String terminalId;
    private String password;

    public BBanka(String bankaAd, String terminalId, String password) {
        this.bankaAd = bankaAd;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankaAd() {
        return bankaAd;
    }

    public void setBankaAd(String bankaAd) {
        this.bankaAd = bankaAd;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip : " + ipAddress);
        System.out.println("Makina ip : " + this.hostIpAddress);
        System.out.println(this.getBankaAd() + " Bağlanıldı !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expireDate, String CVC) {
        System.out.println("Bankadan Cevap Bekleniyor !");
        System.out.println("İşlem Başarılı !");
        return true;
    }
}
