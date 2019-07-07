import java.util.Scanner;

public class Przedmiot {

    private double ocenaPrzedmiotu;
    public String nazwaPrzedmiotu;


    public void setSredniaPrzedmiotu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosc ocen z przedmiotu "+nazwaPrzedmiotu);
        int liczbaOcen = scan.nextInt();
        double[] oceny = new double[liczbaOcen];
        System.out.println("Podaj oceny:");
        for (int x = 0; x < liczbaOcen; x++) {

            oceny[x] = scan.nextDouble();

        }

        double sumaOcen = 0;
        for (double y : oceny
        ) {
            sumaOcen += y;

        }
        ocenaPrzedmiotu = sumaOcen / oceny.length;
        System.out.println("Twoja srednia z przedmiotu "+nazwaPrzedmiotu+" to : "+ocenaPrzedmiotu);

    }
    public double getOcenaPrzedmiotu(){
        return ocenaPrzedmiotu;

    }

}
