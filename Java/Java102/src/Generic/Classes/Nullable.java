package Generic.Classes;


public class Nullable <T>{ //<T> genellikle generic sınıf <> içerisindeki 'T' yerine herhangi birşey de yazılabilir bize bağlı ama genelde T yazılır

    // T bilinmeyeni temsil ediyor.

    private final T value;


    public Nullable(T value) {
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public boolean isNull(){
        return this.getValue()==null;
    }

    public void run(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        }else{
            System.out.println(this.getValue());
        }
    }
}
