public class BmiService {
    public float calculate(float weight, float height) {
        final float i = weight / (height * height);
        return i;

    }

}
