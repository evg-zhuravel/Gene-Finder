package StringThirdAssignment;

import java.io.FileWriter;
import java.io.IOException;

import static StringSecondAssignment.Part1.findGene;

public class Part1 {

    public static void getAllGenes(String dna) {
        try (FileWriter fileWriter = new FileWriter("genes.txt")) {
            while (true) {
                String currGene;
                if (!(currGene = findGene(dna)).isEmpty()) {
                    fileWriter.write(currGene + "\n");
                    dna = dna.substring(currGene.length());
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double cgRatio(String dna) {
        double cgRatio = 0;
        for (int i = 0; i < dna.length(); i++) {
            String currChar = String.valueOf(dna.charAt(i));
            if (currChar.equalsIgnoreCase("C") || currChar.equalsIgnoreCase("G")) {
                cgRatio++;
            }
        }
        return cgRatio / dna.length();
    }
}


