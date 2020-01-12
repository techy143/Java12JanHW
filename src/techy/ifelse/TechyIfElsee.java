package techy.ifelse;

public class TechyIfElsee {


        public static void main(String[] args) {

            myGrade();

            if(4 < 4){

                //System.out.println();
            }else{

                System.out.println("PASS");
            }
        }

        public static void myGrade() {

            int marks = 81;

            if (marks < 33) {
                System.out.println("My grade is F");
                System.out.println("My marks are  " + marks);

            } else if (marks <= 33 && marks >= 39) {
                System.out.println("My grade is D");
                System.out.println("My marks are  " + marks);

            } else if (marks <= 40 && marks <= 49) {
                System.out.println("My grade is C");
                System.out.println("My marks are  " + marks);

            } else if (marks <= 50 && marks <= 59) {
                System.out.println("My grade is B");
                System.out.println("My marks are  " + marks);

            } else if (marks <= 60 && marks >= 69) {
                System.out.println("My grade is A-");
                System.out.println("My marks are  " + marks);

            } else if (marks <= 70 && marks <= 79) {
                System.out.println("My grade is A");
                System.out.println("My marks are  " + marks);

            } else if (marks >= 80 && marks <= 100) {
                System.out.println("My grade is A+ ");
                System.out.println("My marks are " + marks); }
        }
    }
