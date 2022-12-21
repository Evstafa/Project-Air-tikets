public class Main {
    public static void main(String[] args) {
        long tiket = 4000; // стоимости билета
        int miles = 20; // количество рублей для одной бонусной мили
        int i = (int) tiket / miles;
        System.out.println("Количество бонусных миль: " + i + " руб.");
    }
}
