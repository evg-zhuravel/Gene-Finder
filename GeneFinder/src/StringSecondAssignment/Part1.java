package StringSecondAssignment;

public class Part1 {

    public static int findStopCodon(String dna, int startIndex, String stopCodon) {
        int stopCodonIndex = 0;
        int startCodonIndex = dna.indexOf("ATG", startIndex);
        if (startCodonIndex != -1) {
            while (stopCodonIndex != -1) {
                stopCodonIndex = dna.indexOf(stopCodon, startCodonIndex);
                if (stopCodonIndex % 3 != 0) {
                    startCodonIndex = stopCodonIndex + 3;
                } else {
                    break;
                }
            }
        }
        return stopCodonIndex;
    }

    public static String findGene(String dna) {
        StringBuilder gene = new StringBuilder();
        int startCodonIndex = dna.indexOf("ATG");
        if (startCodonIndex != -1) {
            String[] stopCodons = {"TAA", "TAG", "TGA"};
            for (String stopCodon : stopCodons) {
                int currIndex;
                if ((currIndex = findStopCodon(dna, startCodonIndex, stopCodon)) > 0 && gene.isEmpty()) {
                    gene.append(dna, startCodonIndex, currIndex + 3);
                }
            }
        }
        return gene.toString();
    }
}
