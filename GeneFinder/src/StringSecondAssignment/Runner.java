package StringSecondAssignment;

public class Runner {

    public static void main(String[] args) {
        String testDna1 = "ATGTTAGTTAATTAA"; // res: ATGTTAGTTAATTAA
        String testDna2 = "TTTGTTAATTAA"; // res:
        String testDna3 = "ATGTAAGTTAATTAA"; // res: ATGTAA
        String testDna4 = "ATGTGGTTAATTTGAAAT"; // res: ATGTGGTTAATTTGA
        String testDna5 = "TGAATGGCTGATAAGTAGGTTTGA"; // res: ATGGCTGATAAGTAG
        String testDna6 = "ATGAGTTAGTAAATAA"; // res: ATGAGTTAG


        System.out.println(Part1.findGene(testDna1));
        System.out.println(Part1.findGene(testDna2));
        System.out.println(Part1.findGene(testDna3));
        System.out.println(Part1.findGene(testDna4));
        System.out.println(Part1.findGene(testDna5));
        System.out.println(Part1.findGene(testDna6));

        System.out.println(Part2.howMany("GAA", "ATGAACGAATTGAATCGAAGAAGAA")); // 6
        System.out.println(Part2.howMany("AA", "ATAAAA")); // 2

        System.out.println(Part1.countGenes("ATGTAAGATGCCCTAGTATGTTAGTTAATTAA")); // 3
    }
}
