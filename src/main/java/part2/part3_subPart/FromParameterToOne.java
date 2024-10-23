package part2.part3_subPart;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        int i = 1;
        int result =  number;
        while(i<=number) {
            System.out.println(result--);
            i++;
        }
    }
}
