package Source;

import lombok.Getter;
import lombok.Setter;

import static Utils.AccelerationUtil.freeFallAcceleration;
@Getter
@Setter
public class PersonalPlanetClass extends Planet {
    private String name;

    public PersonalPlanetClass(double w, double r, String n) {
        super(w, r);
        name = n;
    }

    @Override
    public double acceleration() {
        return freeFallAcceleration(getWeight(), getRadius());
    }
}
