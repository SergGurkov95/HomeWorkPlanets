import Utils.PlanetReporter;
import Utils.PlanetScanner;

public class Main {
    public static void main(String[] args) {
        PlanetScanner pScan = new PlanetScanner();
        PlanetReporter pRep;

        pScan.output();

        int inputResult = pScan.input();

        if(inputResult != -1){
        pRep = new PlanetReporter(inputResult);
        pRep.getFreeFallAcceleration();
        }
    }
}
