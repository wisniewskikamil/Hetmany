package Hetmany;

import java.util.Scanner;

public class Main {
    public static int wiersze=0;
    public static int kolumny=0;
    public static int hetmany=0;
    public static void main(String[] args) {

        String str_kolumny, str_wiersze, str_hetmany;

        Scanner scan = new Scanner(System.in);

        for(;;) {
            System.out.println("\n\n-------------------------------------------------\n\n");
            System.out.println("Ile kolumn ma mieć szachownica?");
            str_kolumny = scan.nextLine();

            System.out.println("Ile wierszy ma mieć szachownica?");
            str_wiersze = scan.nextLine();

            System.out.println("Ile hetmanów ma być ustawione?");
            str_hetmany = scan.nextLine();

            boolean rezultat = Dane.Dane(str_kolumny, str_wiersze, str_hetmany);

            if (rezultat == true) {

                Program program = new Program(wiersze, kolumny, hetmany);
                Program.Bicia(program.szachownica, wiersze, kolumny);
            } else {
                System.out.println("Wprowadzono błędne dane");
            }
        }
    }
}
