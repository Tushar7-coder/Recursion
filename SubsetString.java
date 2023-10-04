package Recursion;

public class SubsetString {
    public static void main(String[] args) {
        String s = "abc";
        printAllSubsets(s);
    }
    static void printAllSubsets(String s) {
        printAllSubsetsHelper(s, 0, "");
    }

    static void printAllSubsetsHelper(String s, int i, String cur) {
        if (i == s.length()) {
            System.out.println(cur);
        } else {
            printAllSubsetsHelper(s, i + 1, cur + s.charAt(i));
            printAllSubsetsHelper(s, i + 1, cur);
        }
    }
}
