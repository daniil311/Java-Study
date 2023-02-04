public class Main {
    public static void main(String[] args){

        System.out.println(Singleton.singleton);

        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s.password);
        System.out.println(s2);
    }

}
