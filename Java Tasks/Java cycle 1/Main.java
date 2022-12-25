public class Main {
    public static void main(String[] args){
        int x = 0;
        int i = 0;

        for (i = 0; i <= 25; i++) {

            if (i == 17){    //если 13 итерация то выполнить break
                break;
            }
            else if (i % 2 !=0){    //если остаток от деления не равно 0(не четное) то итерацию пропускаем с помощью continue
                continue;
            }
            System.out.println(i);
        }
    }
}
