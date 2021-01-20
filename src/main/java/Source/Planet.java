package Source;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
abstract class Planet implements PlanetAcceleration {
    private double weight;
    private double radius;

     Planet(double w, double r) {
        weight = w;
        radius = r;
    }

}
