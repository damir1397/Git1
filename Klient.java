package intelect;




import java.util.Scanner;

public class Klient  {
    public static Data data;
    public static double sum;

    public static void outAdvert(String vvod,int n, double sizeX, double sizeY) {
        Data[] mas = {data.valueOf("BANER"), data.valueOf("PLENCA"), data.valueOf("PBANER"), data.valueOf("PPLENCA")};
        System.out.println(mas[n]);
        if (n == 0) {
            double m2 = sizeX * sizeY;
             sum = m2 * 150.0;
            System.out.printf(m2 + "м2 " + sum + "-цена\n");
        } else if (n == 1) {
            double m2 = sizeX * sizeY;
             sum = m2 * 160.0;
            System.out.println(m2 + "м2 " + sum + "-цена\n");
        } else if (n == 2) {
            double m2 = sizeX * sizeY;
             sum = m2 * 180.0;
            System.out.println(m2 + "м2 " + sum + "-цена\n");
        } else if (n == 3) {
            double m2 = sizeX * sizeY;
             sum = m2 * 165.0;
            System.out.printf(m2 + "м2 " + sum + "-цена\n");


        }  switch (vvod) {
            case "01":
                double chet = sum * 4.0;
                System.out.println("Cумма аренды " + chet+"за месяц");
                break;
            case "02":
                double chet1 = sum * 5.0;
                System.out.println("Cумма аренды " + chet1+"за месяц");
                break;
            case "03":
                double chet2 = sum * 6.0;
                System.out.println("Cумма аренды " + chet2+"за месяц");
                break;
        }

    }

    public static void transAdvert(int monath,int n,double x,double y ) {
        Data[] data1={data.valueOf("MONAT1"),data.valueOf("MONAT3"),data.valueOf("MONAT6"),data.valueOf("MONAT12")};

        if ( n==01 ) {
        double sum1=x*y;
        double sum2=sum1*450.0;
        System.out.println(sum1+" кв/м\n"+sum2+" цена");
        }else if(n==02){
            double sum1=x*y;
            double sum2=sum1*750.0;
            System.out.println(sum1+" кв/м\n"+sum2+" цена");
        }else if (n==03){
            double sum1=x*y;
            double sum2=sum1*1050.0;
            System.out.println(sum1+" кв/м\n"+sum2+" цена");
        }
        System.out.println(data1[monath]);

    }

    public static void smiAdvert() {

    }

    public static void audiAdvert(int n) {
        Data[]data4={data.valueOf("AUDI1"),data.valueOf("AUDI2"),data.valueOf("AUDI3"),data.valueOf("AUDI4")};
        if (n==01){
            System.out.println("Выберите диктатора!");
            /* {
                File soundFile = new File("snd.wav"); //Звуковой файл

                //Получаем AudioInputStream
                //Вот тут могут полететь IOException и UnsupportedAudioFileException
                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                //Получаем реализацию интерфейса Clip
                //Может выкинуть LineUnavailableException
                Clip clip = AudioSystem.();

                //Загружаем наш звуковой поток в Clip
                //Может выкинуть IOException и LineUnavailableException
                clip.open(ais);

                clip.setFramePosition(0); //устанавливаем указатель на старт
                clip.start(); //Поехали!!!

                //Если не запущено других потоков, то стоит подождать, пока клип не закончится
                //В GUI-приложениях следующие 3 строчки не понадобятся
                Thread.sleep(clip.getMicrosecondLength()/1000);
                clip.stop(); //Останавливаем
                clip.close(); //Закрываем
            } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                exc.printStackTrace();
            } catch (InterruptedException exc) {}*/
        }
    }

    public static void interAdvert() {

    }

    public static void printAdvert() {

    }

    public static void plaseMarketAdvert() {

    }

    public static void hello() {
                System.out.println("Здраствуйте");
                System.out.println("По нумераци.");
                System.out.println("Выберите какую рекламу вы хотите!");


        System.out.println("1.Реклама в прессе \n"+
               "2.Наружная реклама\n"+
               "3.Печатная реклама\n"+
               "4.Аудиовизуальная реклама\n"+
                "5.Радиореклама\n" +
              "6.Телевизионная реклама\n"+
             "7.Рекламные сувениры;\n"+
              "8.Интернет-реклама\n"+
              "9.Реклама на МТС\n");





    }

}