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

    }
    public void menschZiehen() {

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

