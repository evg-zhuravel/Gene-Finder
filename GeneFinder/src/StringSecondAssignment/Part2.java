package StringSecondAssignment;

public class Part2 {

    public static int howMany(String stringa, String stringb) {
        int counter = 0;
        while (stringb.contains(stringa)) {
            counter++;
            int currIndex = stringb.indexOf(stringa);
            stringb = stringb.substring(currIndex + stringa.length());
        }
        return counter;
    }
}
