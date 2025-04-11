public class Spiel {
    private int matchsticks;
    private int zug;


    Spiel(int matchstickCnt) {
        this.matchsticks = matchstickCnt;
        while (matchsticks > 0) {
            computerZiehen();
            if (matchsticks <= 0) {
                Ausgabe.computerGewinnt();
                break;
            }
            menschZiehen();
            if (matchsticks <= 0) {
                Ausgabe.menschGewinnt();
                break;
            }
        }
    }

    public void computerZiehen() {
        int gezogene = berechneComputerZug();
        matchsticks -= gezogene;
        Ausgabe.computerZug(gezogene, matchsticks);

    }
    public void menschZiehen() {
        int gezogene = Eingabe.leseMatchsticks();
        if (gezogene > matchsticks) {
            Ausgabe.zugNichtMoeglich();
            menschZiehen();
        } else {
            matchsticks -= gezogene;
            Ausgabe.menschZug(gezogene, matchsticks);
        }


    }

    private int berechneComputerZug() {
        this.zug = matchsticks % 4;
        if (zug==0) zug = 3;
        else if (zug > 3 ) zug = 3;

        return zug;
    }

    public int getMatchsticks() {
        return matchsticks;
    }

}

