public class main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 92;
        double height = 1.85;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
