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

    public static String lastPart(String stringa, String stringb) {
        if (stringb.contains(stringa)) {
            int stringAIndex = stringb.indexOf(stringa);
            stringb = stringb.substring(stringAIndex, stringAIndex + stringa.length() + 1);
        }
        return stringb;
    }
}
