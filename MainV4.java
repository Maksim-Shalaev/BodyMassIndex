public class MainV4 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // ввести вес в кг
        float weight = 98.1F;
        // ввести рост в метрах
        float height = 1.42F;
        float index = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + " " + index);
    }
}
