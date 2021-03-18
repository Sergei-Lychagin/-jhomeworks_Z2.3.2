public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(1000_60, true);
        // сравниваем ожидаемый и фактический результат
        boolean passed = expected == actual;

        // выводим результат
        System.out.println(passed);

    }
}
