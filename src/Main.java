public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1-2");
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
        System.out.println(" Задание 3 ");
        int year=1800;
        if(year%4==0&&year%100!=0 || year%400==0){
            System.out.println(year +" Является високосным ");
        }else{
            System.out.println(year +" Не является високосным ");
        }
        System.out.println(" Задание 4 ");
        int deliveryDistance = 50;
        int deliveryDays=1;
        if(deliveryDistance>20){
            deliveryDays++;
        }
        if(deliveryDistance>60){
            deliveryDays++;
        }
        System.out.println(" Потребуется дней " + deliveryDays);
        System.out.println(" Задание 5 ");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(" Зимний сезон ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весенний сезон ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Летний сезон ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осенний сезон ");
                break;
            default:
                System.out.println(" Такого месяца нет ");
        }
    }
}