package part5.objectsAndReferences.exc1;

import java.util.ArrayList;

public class NullPointerExceptionProgram {
    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes
        // the NullPointerException -error

        ArrayList<String> lines = new ArrayList<>();
        lines.add("Never has a man influenced physics so profoundly as Niels Bohr in the early 1900's");
        lines.add("Going back to this time period, little was known about atomic structure; Bohr set out");
        lines.add("to end the obscurity of physics. However, things didn't come easy for Bohr. He had to");
        lines.add("give up most of his life for physics and research of many hypothesis. But, this is why");
        lines.add("you and I have even heard of the quantum theory and atomic structures. Bohr came");
        lines.add("up with his quantum theory while studying...");

//        int index = 5;


        ArrayList<String> index = increaseIndex(lines);
        System.out.println(index.get(0));
    }

    private static ArrayList<String> increaseIndex(ArrayList<String> number) {
        return null;
    }

}
