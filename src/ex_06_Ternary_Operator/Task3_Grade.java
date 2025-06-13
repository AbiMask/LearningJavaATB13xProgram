package ex_06_Ternary_Operator;

public class Task3_Grade {
    public static void main(String[] args) {
        int marks = 30;
        String grade = (marks>=90) ? "A+" : (marks>=75) ? "A" : (marks>=60) ? "B" : (marks>=40) ? "C" : "Fail";
        System.out.println(grade);
    }
}
