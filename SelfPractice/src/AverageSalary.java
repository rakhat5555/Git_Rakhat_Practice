public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {35000, 48000, 55000, 24000, 57357, 75336 };
        int total = 0;
        for(int i = 0; i <salary.length; i++) {
            total = total + salary[i];
        }
        double average = total / salary.length;
        System.out.println(average + " is an average salary in this company!");
    }
}
