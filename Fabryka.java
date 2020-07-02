package fabryka;

import java.util.Scanner;

public class Fabryka {

    enum EnumZamek {
        POWRÓT,
        ŁUCZNIK,
        ANIOŁ
    }

    enum EnumWrota {
        POWRÓT,
        NIMFA,
        FENIKS
    }

    enum EnumBastion {
        POWRÓT,
        CENTAUR,
        DRZEWIEC
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, choice2;
        do {
            System.out.println("Menu");
            System.out.println("Aby stworzyć Zamek, naciśnij 1.");
            System.out.println("Aby stworzyć Wrota Żywiołów, naciśnij 2.");
            System.out.println("Aby stworzyć Bastion, naciśnij 3.");
            System.out.println("Aby zakończyć działanie programu, naciśnij 0.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Zamek zamczysko=new Zamek();
                    System.out.println("Witaj w zamku!");
                    System.out.println("Aby stworzyć łucznika, naciśnij 1.");
                    System.out.println("Aby stworzyć anioła, naciśnij 2.");
                    System.out.println("Aby wrócić do menu głównego, naciśnij 0.");
                    while ((choice2 = sc.nextInt()) != 0) {
                        IZamek jednostkaZamkowa=zamczysko.twórzJednostki(EnumZamek.values()[choice2]);
                    }
                    break;
                case 2:
                    Wrota wrotaŻywiołów=new Wrota();
                    System.out.println("Witaj u Wrót Żywiołów!");
                    System.out.println("Aby stworzyć nimfę, naciśnij 1.");
                    System.out.println("Aby stworzyć feniksa, naciśnij 2.");
                    System.out.println("Aby wrócić do menu głównego, naciśnij 0.");
                    while ((choice2 = sc.nextInt()) != 0) {
                        IWrota jednostkaWrót=wrotaŻywiołów.twórzJednostki(EnumWrota.values()[choice2]);
                    }
                    break;
                case 3:
                    Bastion bastion=new Bastion();
                    System.out.println("Witaj w Bastionie!");
                    System.out.println("Aby stworzyć centaura, naciśnij 1.");
                    System.out.println("Aby stworzyć drzewca, naciśnij 2.");
                    System.out.println("Aby wrócić do menu głównego, naciśnij 0.");
                    while ((choice2 = sc.nextInt()) != 0) {
                        IBastion jednostkaBastionu=bastion.twórzJednostki(EnumBastion.values()[choice2]);
                    }
                    break;
                case 0:
                    System.out.println("Koniec.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Podano nieprawidłową wartość.\nProszę wybrać ponownie.");
            }
        } while (choice != 0);

    }

}
