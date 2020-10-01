public class Bonus {
    public static void main(String[] args) {
        // Ввод значений в customerAccount и deposite выполнен с учетом,что последние 2 цифры - это копейки.
        int customerAccount = 360_63;
        int deposite = 2345_55;
        // Так же в значении  "если" добавленны копейки.
        if (deposite >= 1000_00) {
            int bonus = deposite/100/100;
            System.out.println(((double)(customerAccount + deposite)/100) + bonus);
        }
        else {
            System.out.println((double)(customerAccount + deposite)/100);
        }
    }
}
