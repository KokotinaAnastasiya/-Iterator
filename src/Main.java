public class Main {
    public static void main(String[] args) {

        for (int number: new Randoms(50,100)) {
            System.out.println("Случайное число: " + number);
            if (number == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}