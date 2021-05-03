public class MainV4 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // ввести вес в кг
        float weight = 90.1F;
        float index = service.calculate(weight);
        System.out.println("Индекс массы тела:" + " " + index);
    }
}
