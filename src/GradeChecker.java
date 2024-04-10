import java.util.HashMap;
public class GradeChecker {
    public static void main(String[] args) {
        HashMap<String, Integer> classGrades = new HashMap<String, Integer>();

        int high = -1;
        int low = 150;
        String highestClass = "";
        String lowestClass = "";
        double sum = 0;
        double avg;


        classGrades.put("AP Precalc D: ", 88);
        classGrades.put("APUSH", 97);
        classGrades.put("Honors Bio", 100);
        classGrades.put("Honors Chem", 93);
        classGrades.put("Honors ELA 2", 93);
        classGrades.put("Business Law", 97);
        classGrades.put("CCP Programming", 99);


        for (String subject : classGrades.keySet()) {
            System.out.printf("\n%-20s %5d", subject, classGrades.get(subject));

            if (classGrades.get(subject) > high) {
                high = classGrades.get(subject);
                highestClass = subject;
            }

            if (classGrades.get(subject) < low) {
                low = classGrades.get(subject);
                lowestClass = subject;
            }


            sum += classGrades.get(subject);
        }

        avg = sum / classGrades.size();

        System.out.println(" ");
        System.out.printf("\n%-20s %5d", "Number of Classes:", classGrades.size());
        System.out.printf("\n%-35s %5d", "Highest Grade (" + highestClass + "):", high);
        System.out.printf("\n%-35s %5d", "Lowest Grade (" + lowestClass + "):", low);
        System.out.printf("\n%-20s %5f", "Average:", avg);
    }
}