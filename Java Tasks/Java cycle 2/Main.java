public class Main {
    public static void main(String[] args){

        int x = 0;

        for(int i = 1; i <= 30; i++){       //цикл 32 итерации
            int a = (int)Math.floor(Math.random() * 100);  //случайные целые значения до 100
            if (x > a){
                System.out.println(x + ">" + a);
            } else if (x < a){
                System.out.println(x + "<" + a);
            } else {
                System.out.println(x + "==" + a);
            }
            x = a;    //прошлое число сравнивается с текущим
        }
    }
}
