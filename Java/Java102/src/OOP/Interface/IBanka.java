package OOP.Interface;

public interface IBanka { // interface tanımlarken başta 'I' karakteri ile başlanır.
    //interface aslında sınıf şablonu diyebiliriz.
    //genelde method isim tanımlamaları yapılır.
    final String hostIpAddress = "127.0.0.1";
    //interface tanımlanan metotların içeriğini yazamazsın!.
    //Interface'i kullanan sınıflar içerisindeki metotları oluşturmak zorunda !
    boolean connect(String ipAddress);

    boolean payment(double price, String cardNumber, String expireDate, String CVC);
}
