public class Singleton {
    public final String host = "127.0.0.1:8000";
    public final String login = "root";
    public final String password = "123456";

    public static Singleton singleton;

    public static Singleton getInstance(){
        if (singleton != null){
            return singleton;
        } else{
            singleton = new Singleton();
            return singleton;
        }
    }

    private Singleton(){}
}
