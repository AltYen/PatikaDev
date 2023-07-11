package BasicOfJava;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 3;

        if(day==1){
            System.out.println("Bugun Pazartesi");
        } else if (day==2) {
            System.out.println("Bugun Salı");
        } else if (day==3) {
            System.out.println("Bugun Çarşamba");
        } else if (day==4) {
            System.out.println("Bugun Perşembe");
        } else if (day==5) {
            System.out.println("Bugun Cuma");
        } else if (day==6) {
            System.out.println("Bugun Cumartesi");
        } else if (day==7) {
            System.out.println("Bugun Pazar");
        } else{
            System.out.println("Hatali Giriş");
        }

        switch (day){
            case 1:
                System.out.println("Bugun Pazartesi");
                break;//break = durdur
            case 2:
                System.out.println("Bugun Salı");
                break;
            case 3:
                System.out.println("Bugun Çarşamba");
                break;
            case 4:
                System.out.println("Bugun Perşembe");
                break;
            case 5:
                System.out.println("Bugun Cuma");
                break;
            case 6:
                System.out.println("Bugun Cumartesi");
                break;
            case 7:
                System.out.println("Bugun Pazar");
                break;
            default:
                System.out.println("Hatali Giriş");
                break;
        }
    }
}
