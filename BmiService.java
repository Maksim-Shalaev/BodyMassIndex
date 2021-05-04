public class BmiService {
    public float calculate(float weight) {
        // ввести рост в метрах!!
        float height = 1.72F;
        final float i = weight / (height * height);
        return i;

    }

}
