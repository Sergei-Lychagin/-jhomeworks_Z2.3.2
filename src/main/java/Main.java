public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        // вызываем целевой метод
        long bonus = service.calculate(1000_60, true);

        // выводим результат
        System.out.println(bonus);

    }
}
