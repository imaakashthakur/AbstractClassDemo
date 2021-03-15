package wwe;

public class WWERing {
    public static void main(String[] args) {
        WrestleMania johnCena = new JohnCena();
        johnCena.salary(12);
        johnCena.entryMusic();

        WrestleMania underTaker = new Undertaker();
        underTaker.salary(10);
        underTaker.entryMusic();
    }
}
