package Generic.Methods;

// bir sınıf içerisinde generic method tanımlayacaksak, sınıfın generic olma zorunluluğu yok.
public class Print {
    public static <T> void printArray(T[] arr){ // generic method tanımlama
        for(T i: arr){
            System.out.println(i);
        }
    }
}
