package StringSecondAssignment;

import java.util.Arrays;

public class Part1 {

    public static int findStopCodon(String dna, int startIndex, String stopCodon) {
        int stopCodonIndex = 0;
        dna = dna.substring(startIndex);
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
            int firstStopCodonIndex = findMinimalIndex(dna, startCodonIndex, "TAA", "TAG", "TGA");
            gene.append(dna, startCodonIndex, firstStopCodonIndex + 3);
        }
        return gene.toString();
    }

    private static int findMinimalIndex(String dna, int startIndex, String... stopCodons) {
        int minimalCodon = 0;
        int[] lastIndexes = new int[stopCodons.length];

        for (int i = 0; i < stopCodons.length; i++) {
            lastIndexes[i] = findStopCodon(dna, startIndex, stopCodons[i]);
        }

        Arrays.sort(lastIndexes);

        for (int index : lastIndexes) {
            if (minimalCodon == 0 && index != -1) {
                minimalCodon = index;
            }
        }
        return minimalCodon;
    }

    public static int countGenes(String dna) {
        int count = 0;
        while (!dna.isEmpty()) {
            String currGene = findGene(dna);
            if (!currGene.isEmpty()) {
                count++;
                dna = dna.substring(currGene.length());
            } else {
                break;
            }
        }
        return count;
    }
}
