package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int[] numerot = {a, b, c};
        java.util.Arrays.sort(numerot);
        
        return numerot[0] + "," + numerot[1] + "," + numerot[2];
    }
}
