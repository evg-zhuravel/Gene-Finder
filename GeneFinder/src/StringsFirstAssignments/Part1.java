package StringsFirstAssignments;

public class Part1 {

    public static String findSimpleGene(String dna) {
        int startCodonIndex;
        if ((startCodonIndex = dna.indexOf("ATG")) == -1) {
            dna = "";
        }
        int lastCodonIndex = dna.indexOf("TAA", startCodonIndex + 2);
        if (lastCodonIndex != -1) {
            dna = dna.substring(startCodonIndex, lastCodonIndex + 3);
        }
        return dna.length() % 3 == 0 ? dna : "";
    }

    public static String findSimpleGene(String dna, String startCodon, String lastCodon) {
        if (Character.isLowerCase(dna.charAt(0))) {
            startCodon = startCodon.toLowerCase();
            lastCodon = lastCodon.toLowerCase();
        }

        int startCodonIndex;
        if ((startCodonIndex = dna.indexOf(startCodon)) == -1) {
            dna = "";
        }
        int lastCodonIndex = dna.indexOf(lastCodon, startCodonIndex + 2);
        if (lastCodonIndex != -1) {
            dna = dna.substring(startCodonIndex, lastCodonIndex + 3);
        }
        return dna.length() % 3 == 0 ? dna : "";
    }
}

