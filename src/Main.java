public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static  void task1(){

        System.out.println("Демонстрация задачи 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Ваша операционная система не опознана");
        }
    }

    public static  void task2(){

        System.out.println("Демонстрация задачи 2");

        byte clientOS = 1;
        int clientDeviceYear = 2015;
        int clientCurrentDeviceYear = 2010;

        if (clientOS == 1) {
            System.out.println("Установите " + (clientCurrentDeviceYear > clientDeviceYear ? "": "облегченную") + " версию приложения для Android по ссылке");
        }
        else if (clientOS == 0) {
            System.out.println("Установите " + (clientCurrentDeviceYear > clientDeviceYear ? "": "облегченную") + " версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Ваша операционная система не опознана");
        }
    }

    public static  void task3(){

        System.out.println("Демонстрация задачи 3");

        int year = 2004;
        if ((( year % 4 == 0 ) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static  void task4(){

        System.out.println("Демонстрация задачи 4");

        int deliveryDistance  = 95;
        int days = 1;

        if ((deliveryDistance > 20 && deliveryDistance <= 60) || (deliveryDistance > 60 && deliveryDistance <= 100)){
            days ++;
        }
        else if (deliveryDistance > 100) {
            days = 0;
            System.out.println("Свыше 100 км доставки нет");
        }

        if (days > 0) System.out.println("Потребуется дней: " + days);
    }

    public static  void task5() {

        System.out.println("Демонстрация задачи 5");

        byte monthNumber = 4;

        if (monthNumber >= 1  && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь. Зимний месяц");
                    break;
                case 2:
                    System.out.println("Февраль. Зимний месяц");
                    break;
                case 3:
                    System.out.println("Март. Весенний месяц");
                    break;
                case 4:
                    System.out.println("Апрель. Весенний месяц");
                    break;
                case 5:
                    System.out.println("Май. Весенний месяц");
                    break;
                case 6:
                    System.out.println("Июнь. Летний месяц");
                    break;
                case 7:
                    System.out.println("Июль. Летний месяц");
                    break;
                case 8:
                    System.out.println("Август. Летний месяц");
                    break;
                case 9:
                    System.out.println("Сентябрь. Осенний месяц");
                    break;
                case 10:
                    System.out.println("Октябрь. Осенний месяц");
                    break;
                case 11:
                    System.out.println("Ноябрь. Осенний месяц");
                    break;
                case 12:
                    System.out.println("Декабрь. Зимний месяц");
                    break;
                default:
                    System.out.println("Что-то пошло не так. Сюда зайти не должны");
            }
        } else {
            System.out.println("Месяц должен быть от 1 до 12");
        }
    }
}