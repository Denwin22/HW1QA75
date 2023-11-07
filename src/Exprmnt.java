public class Exprmnt {
    public static void main(String[] args) {
        int a = 10;
        long b = 5;
        int x = (int) (a + b);
        if (a > b) {
            System.out.println("А больше Б");
        } else {
            System.out.println("А меньше Б");
        }
        System.out.println("A---: " + a);
        System.out.println("Б---: " + b);
        System.out.println("Складываем:" + a + b);
        System.out.println("Итого: " + x);


        /*long i = 10_000_000_000L;
        int a = (int) i;
        System.out.println(a);*/
    }
}