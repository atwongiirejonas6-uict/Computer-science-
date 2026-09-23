/public class AverageMarks{
    public static void main(String[]args){
        int marks[]= 70,80,65,90,85;
        int sum = 0;
        //sum of marks
        for(i=0;i<=marks.length;i++){
            sum = sum + marks[i];
        }
        double average = (double)sum/marks.length;

        //output
        system.out.println("Total marks: " + sum);
        system.out.println("Number of subjects: " + marks);
        system.out.println("Average: " + Average);
    }
}