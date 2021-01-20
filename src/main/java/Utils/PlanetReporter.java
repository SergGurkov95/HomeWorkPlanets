package Utils;

import Source.PersonalPlanetClass;

public class PlanetReporter {
    private double[] weight = {0.333022, 4.8675, 5.9726, 0.64171, 1898.6, 568.46, 86.813, 102.43};//массивы с данными о массе и радиусах планет солнечной системы
    private double[] radius = {2.4397, 6.0518, 6.371, 3.3895, 69.911, 58.232, 25.362, 24.622};
    PersonalPlanetClass currentPlanet;

    public PlanetReporter(int i) {
            currentPlanet = new PersonalPlanetClass(weight[i], radius[i], PlanetScanner.planetList[i]);
    }

    public void getFreeFallAcceleration() {
        String result = String.format("%.2f", currentPlanet.acceleration());
        System.out.println("Ускорение свободного падения на планете " + currentPlanet.getName() + " составляет - " + result + "м/(с^2)");
    }
}
