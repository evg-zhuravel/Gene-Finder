package StringThirdAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
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

    public static void processGenes(String fileUrl) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileUrl))) {
            String dna = reader.readLine();
            getGenesByLength(dna, 9);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getGenesByLength(String dna, int length) {
        String currGene;
        while (!(currGene = findGene(dna)).isEmpty()) {
            int i = 1;
            if (currGene.length() > length) {
                System.out.printf("%d - %s", i++, currGene + '\n');
            }
            dna = dna.substring(currGene.length());
        }
    }
}


