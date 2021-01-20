package Utils;

public class AccelerationUtil {
    final static double GRAVITATIONALCONSTANT = 6.6743 / Math.pow(10, 11);

    public static double freeFallAcceleration(double weight, double radius) {
        return (GRAVITATIONALCONSTANT * weight * Math.pow(10, 24) / (radius * radius * Math.pow(10, 12)));//степени нужны что бы не захламлять массивы с данными 
    }

}
