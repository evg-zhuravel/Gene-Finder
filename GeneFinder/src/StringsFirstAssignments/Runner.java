package StringsFirstAssignments;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Testing of findSimpleGene() method:");
        String noAtgCodon = "TAGAGTAG";
        String noTaaCodon = "ATGGTAGAT";
        String multipleOfThreeWithAtgAndTaa = "ATGTGGAATTAA";
        String notMultipleOfThreeWithAtgAndTaa = "ATGGTAAAATAGAGTAA";
        String random = "GTTAAATAGATGGAATAA";

        System.out.println(Part1.findSimpleGene(noAtgCodon));
        System.out.println(Part1.findSimpleGene(noTaaCodon));
        System.out.println(Part1.findSimpleGene(multipleOfThreeWithAtgAndTaa));
        System.out.println(Part1.findSimpleGene(notMultipleOfThreeWithAtgAndTaa));
        System.out.println(Part1.findSimpleGene(random));

        System.out.println();

        System.out.println("Testing of twoOccurrences() method:");

        System.out.println(Part2.twoOccurrences("by", "Story by Abby Long"));
        System.out.println(Part2.twoOccurrences("a", "banana"));
        System.out.println(Part2.twoOccurrences("atg", "ctgtatgta"));

        System.out.println();

        System.out.println("Testing of lastPart() method:");

        System.out.println(Part2.lastPart("an", "banana"));
        System.out.println(Part2.lastPart("zoo", "forest"));
        System.out.println(Part2.lastPart("atg", "ctgtatgZta"));
        System.out.println(Part2.lastPart("mia", "MiAmIamiaA"));
    }
}
