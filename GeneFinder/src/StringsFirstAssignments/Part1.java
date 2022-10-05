package StringsFirstAssignments;

public class Part1 {

    public static String findSimpleGene(String dna) {
        int startCodonIndex;
        if ((startCodonIndex = dna.indexOf("ATG")) == -1) {
            return "";
        }
        int lastCodonIndex = dna.indexOf("TAA", startCodonIndex + 2);
        String currGene = dna.substring(startCodonIndex, lastCodonIndex + 3);
        if (currGene.length() % 3 == 0) {
            return currGene;
        }
        return "";
    }
    public static String findSimpleGene(String dna, String startCodon, String lastCodon) {
        if (Character.isLowerCase(dna.charAt(0))) {
            startCodon = startCodon.toLowerCase();
            lastCodon = lastCodon.toLowerCase();
        }

        int startCodonIndex;
        if ((startCodonIndex = dna.indexOf(startCodon)) == -1) {
            return "";
        }
        int lastCodonIndex = dna.indexOf(lastCodon, startCodonIndex + 2);
        String currGene = dna.substring(startCodonIndex, lastCodonIndex + 3);
        if (currGene.length() % 3 == 0) {
            return currGene;
        }
        return "";
    }
}

