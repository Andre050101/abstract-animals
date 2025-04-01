import org.lessons.animals.Animale;
import org.lessons.animals.Cane;
import org.lessons.animals.Passerotto;
import org.lessons.animals.Aquila;
import org.lessons.animals.Delfino;


public class App {
    public static void main(String[] args) throws Exception {
        Cane cane = new Cane();
        System.out.println("Cane: dorme: ");
        cane.dormi();
        System.out.println("Cane: verso: ");
        cane.verso();
        System.out.println("Cane: mangia: ");
        cane.mangia();

        Passerotto passerotto = new Passerotto();
        System.out.println("Passerotto: dorme: ");
        passerotto.dormi();
        System.out.println("Passerotto: verso: ");
        passerotto.verso();
        System.out.println("Passerotto: mangia: ");
        passerotto.mangia();

        Aquila aquila = new Aquila();
        System.out.println("Aquila: dorme: ");
        aquila.dormi();
        System.out.println("Aquila: verso: ");
        aquila.verso();
        System.out.println("Aquila: mangia: ");
        aquila.mangia();

        Delfino delfino = new Delfino();
        System.out.println("Delfino: dorme: ");
        delfino.dormi();
        System.out.println("Delfino: verso: ");
        delfino.verso();
        System.out.println("Delfino: mangia: ");
        delfino.mangia();


    }
}
