package intelect;

import java.util.Timer;
import java.util.Scanner;

public class Main extends Klient {

    public static Scanner scan = new Scanner(System.in);
    public static boolean exit=true;
    public static void main(String[] args) {
        do {

            hello();
            String input = scan.nextLine();
            switch (input) {
                case "1":
                    Data[] mas1 = {};
                    break;
                case "2":
                    System.out.println("\n Выберите варианты по нумерации!\"\n" + "В каких местах нужно повесить вашу рекламу?");
                    System.out.println("01.Tц\n" +
                            "02.Развлекательных центрах\n" +
                            "03.В общественном месте с широким охватом  ");

                    String radius = scan.nextLine();
                    System.out.println("Выберите варианты по нумерации!");
                    Data[] mas = {data.valueOf("BANER"), data.valueOf("PLENCA"), data.valueOf("PBANER"), data.valueOf("PPLENCA")};
                    for (int i = 0; i < mas.length; i++) {
                        System.out.println(i + " ::" + mas[i]);
                    }

                    int input1 = scan.nextInt();
                    System.out.println("Введите размеры Через запятую:: X / Y");
                    double x = scan.nextDouble();
                    double y = scan.nextDouble();
                    outAdvert(radius, input1, x, y);


                    break;
                case "3":
                    Data[] mas3 = {};
                    break;
                case "4":
                    System.out.print("01::Информационные аудиоролики"+
                                    "02::Игровые аудиоролики" +
                                    "03:: Имиджевые аудиоролики"+
                                    "04::Вокальные аудиоролики");
                    break;
                case "5":
                    Data[] mas5 = {};
                    break;
                case "6":
                    Data[] mas6 = {};
                    break;
                case "7":
                    Data[] mas7 = {};
                    break;
                case "8":
                    Data[] mas8 = {};
                    break;
                case "9":
                    System.out.println("Выберите варианты по нумерации!\n" +
                            "01.Загородом\n" +
                            "02.Микрорайонах\n" +
                            "03. Центр\n");
                    int n1=scan.nextInt();
                    System.out.println("Аренда ТС для размещения рекламы\n" +
                            "00.1месяц=12 000/сом\n"+
                            "01.3месяца=9 000/сом\n" +
                            "02.6месяцев=7 400/сом\n" +
                            "03.12месяцев=6 500/сом\n");
                    int monath1=scan.nextInt();
                    System.out.println("Введите размеры Через запятую:: X / Y\n" +"Максимальная рекламная площадь - 17 кв.м");
                    double x1=scan.nextDouble();
                    double y1=scan.nextDouble();

                    transAdvert(monath1,n1,x1,y1);
                    break;
                case "exit":
                    exit = false;
                    break;

            }
        } while (exit);
    }
}

