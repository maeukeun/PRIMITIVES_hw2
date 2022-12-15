public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int check = 250;
        int sumCash = 2300;
        int summary = check + sumCash;
        int bonus;
        if (summary > 1000) {
            bonus = sumCash / 100;
            System.out.println("Количество накопленных бонусов: " + bonus);
            System.out.println("Итоговый счет: " + summary + " рублей");
        } else {
            System.out.println("Количество накопленных бонусов: 0");
            System.out.println("Итоговый счет: " + summary + " рублей");
        }
    }
}