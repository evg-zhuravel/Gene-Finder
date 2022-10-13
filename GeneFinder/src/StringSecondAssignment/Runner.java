package StringSecondAssignment;

public class Runner {

    public static void main(String[] args) {
        System.out.println(Part1.findStopCodon("ATGTTAGTTAATTAA", 0, "TAA"));

        String testDna1 = "ATGTTAGTTAATTAA"; // res: ATGTTAGTTAATTAA
        String testDna2 = "TTTGTTAATTAA"; // res:
        String testDna3 = "ATGTAAGTTAATTAA"; // res: ATGTAA
        String testDna4 = "ATGTGGTTAATTTGAAAT"; // res: ATGTGGTTAATTTGA
        String testDna5 = "TGAATGGCTGATAAGTAGGTTTGA"; // res: ATGGCTGATAAGTAG
        String testDna6 = "TGAATGGCTGATAAGTTAGGTTTGA"; // res:

        System.out.println(Part1.findGene(testDna1));
        System.out.println(Part1.findGene(testDna2));
        System.out.println(Part1.findGene(testDna3));
        System.out.println(Part1.findGene(testDna4));
        System.out.println(Part1.findGene(testDna5));
        System.out.println(Part1.findGene(testDna6));
    }
}
