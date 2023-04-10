public class Main {
    public static void main(String[] args) {

        int balance = 250;
        int payment = 1300;
        int bonus;
        if (payment>1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int result = balance + bonus + payment;

        System.out.println ("Ваш баланс: " + result);
        System.out.println ("Начислено бонусов: " + bonus);
    }
}