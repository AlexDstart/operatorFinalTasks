public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            System.out.println(" Установите версию клиента для Android ");
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию для Android ");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию клиента IOS ");
            } else {
                System.out.println(" Установите версию клиента IOS ");
            }
        }
    }
}