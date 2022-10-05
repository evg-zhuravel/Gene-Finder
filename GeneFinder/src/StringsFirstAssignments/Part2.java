package StringsFirstAssignments;

public class Part2 {
    public static boolean twoOccurrences(String stringa, String stringb) {
        int counter = 0;
        while (stringb.contains(stringa)) {
            int lastIndex = stringb.indexOf(stringa);
            stringb = stringb.substring(lastIndex + stringa.length());
            counter++;
        }
        return counter >= 2;
    }
}
