import java.util.Scanner;

public class SredniaRoczna {
    private double sredniaRoczna;
    private int iloscPrzedmiotow;

    public int getIloscPrzedmiotow() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile masz przedmiotów?");
        iloscPrzedmiotow = scan.nextInt();
        return iloscPrzedmiotow;
    }

    public void getInformacjePrzedmiot() {
        int i = 1;
        Scanner scan = new Scanner(System.in);

        Przedmiot[] przedmiot = new Przedmiot[(iloscPrzedmiotow)];
        for (int x = 0; x < iloscPrzedmiotow; x++) {
            przedmiot[x] = new Przedmiot();
            System.out.println("Podaj nazwę przedmiotu nr. " + i++);
            String nazwaPrzedmiotu = scan.nextLine();
            przedmiot[x].nazwaPrzedmiotu = nazwaPrzedmiotu;
            przedmiot[x].setSredniaPrzedmiotu();

        }

      double sumaOcen = 0;
        for (int c=0;c<przedmiot.length;c++
        ) {
            double o=przedmiot[c].getOcenaPrzedmiotu();
            sumaOcen += o;

        }
         sredniaRoczna= sumaOcen / przedmiot.length;
        System.out.println("Srednia roczna z wszystkich przedmiotow, wynosi : "+sredniaRoczna);

    }
}
