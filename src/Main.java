import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //6.1
        System.out.println("-------------------------6.1-------------------------");
        System.out.println("To jest \"Java\". \n" +
                "\n" +
                "Ścieżka: C:\\Program Files\\Java ");
        //6.2
        System.out.println("-------------------------6.2-------------------------");
        System.out.println("Imię       Wiek \n" +
                "Janek      25 \n" +
                "Anna       30 ");
        //8.1
        System.out.println("-------------------------8.1-------------------------");
            int[][] trzynatrzy = new int[3][3];
            trzynatrzy[0][0] = 1;
            trzynatrzy[0][1] = 2;
            trzynatrzy[0][2] = 3;
            trzynatrzy[1][0] = 4;
            trzynatrzy[1][1] = 5;
            trzynatrzy[1][2] = 6;
            trzynatrzy[2][0] = 7;
            trzynatrzy[2][1] = 8;
            trzynatrzy[2][2] = 9;

        System.out.println(Arrays.deepToString(trzynatrzy));

        //8.2
        System.out.println("-------------------------8.2-------------------------");
        int[][][] dwanadwanadwa = new int[2][2][2];
        dwanadwanadwa[0][0][0] = 1;
        dwanadwanadwa[0][0][1] = 2;
        dwanadwanadwa[1][0][0] = 3;
        dwanadwanadwa[1][0][1] = 4;
        System.out.println("    " + Arrays.deepToString(dwanadwanadwa));

        //9.1
        System.out.println("-------------------------9.1-------------------------");
        final int MAX_SPEED = 120;
        System.out.println(MAX_SPEED);

        //9.2
        System.out.println("-------------------------9.2-------------------------");
        final double wspolczynnik = 0.5;
        final int m = 5;
        final int v = 10;
        double e = wspolczynnik * m *(v*v);
        System.out.println(e);
        //10.1
        System.out.println("-------------------------10.1-------------------------");
        int a = 10;
        int b = 2;
        System.out.println("suma " + a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        //10.2
        System.out.println("-------------------------10.2-------------------------");
        int stanprzed = 100;
        int ilosc = 50;
        int czas = 6;
        System.out.println(stanprzed+(ilosc*czas));
        //11.1
        System.out.println("-------------------------11.1-------------------------");
        int wynik = 5 + 2 * 3 - 1;
        System.out.println(wynik);
        //11.2
        System.out.println("-------------------------11.2-------------------------");
        int wynik2 =  (8 + 2) * (5 - 3) / 2;
        System.out.println(wynik2);
        //12.1
        System.out.println("-------------------------12.1-------------------------");
        String liczba = "50";
        int liczba2 = Integer.parseInt(liczba) + 10;
        System.out.println(liczba2);
        //12.2
        System.out.println("-------------------------12.2-------------------------");
        String liczbaznowu = "5.5";
        double tempdouble = Double.parseDouble(liczbaznowu);
        double liczbaznowu2 = tempdouble * tempdouble;
        System.out.println(liczbaznowu2);
        //13.1
        System.out.println("-------------------------13.1------------------------");
        double no = 5.7;
        System.out.println(Math.round(no));
        System.out.println(Math.ceil(no));
        System.out.println(Math.floor(no));
        //13.2
        System.out.println("-------------------------13.2------------------------");
        int randomNumber = 50 + (int)(Math.random() * (150 - 50 + 1));
        System.out.println(randomNumber);
        //14.1
        System.out.println("-------------------------14.1------------------------");
        double jakisdubl = 98765.4321;
        double dollary = Math.round(jakisdubl);
        System.out.println(dollary+"$");
        //14.2
        System.out.println("-------------------------14.2------------------------");
        Scanner sc = new Scanner(System.in);
        int cos = sc.nextInt();
        String pieniadz = cos + "zl";
        String procent = cos + "%";
        System.out.println(pieniadz);
        System.out.println(procent);
        //15.1
        System.out.println("-------------------------15.1------------------------");
        String imie = sc.nextLine();
        String nazwisko = sc.nextLine();
        System.out.println("Witaj " + imie + " " + nazwisko);
        //15.2
        System.out.println("------------------------15.2------------------------");
        int wiek = sc.nextInt();
        int wzrost = sc.nextInt();
        System.out.println("wiek: " + wiek);
        System.out.println("wzrost: " + wzrost);


    }
    }