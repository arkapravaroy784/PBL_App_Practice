//Given two StringJoiner objects s1 and s2 containing city names separated by hyphens (-), display the output for the following cases:
//1. Merge s1 into s2.
//2. Merge s2 into s1. 
import java.util.StringJoiner;

class MergeStringJoiner {
    public static void main(String[] args) {

        // Create first StringJoiner
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Kolkata");
        s1.add("Delhi");
        s1.add("Mumbai");

        // Create second StringJoiner
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Bangalore");
        s2.add("Hyderabad");

        // Merge s1 into s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s2);
        merge1.merge(s1);

        System.out.println("s1 merged to s2:");
        System.out.println(merge1);

        // Merge s2 into s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s1);
        merge2.merge(s2);

        System.out.println("\ns2 merged to s1:");
        System.out.println(merge2);
    }
}
