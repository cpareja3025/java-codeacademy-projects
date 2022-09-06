/*
This DNA.java program will determine whether there is a protein
in a strand of DNA

A protein has the following qualities:

1- It begins with a “start codon”: ATG.
2- It ends with a “stop codon”: TGA.
3 -In between, each additional codon is a sequence of three nucleotides.


*/
public class DNA {
    public static void main(String[] args) {
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna2;
    int length = dna.length();
    int startCodon = dna.indexOf("ATG");
    int stopCodon = dna.indexOf("TGA");

    if(startCodon != -1 && stopCodon !=-1 && length % 3 == 0) {
        System.out.println("All three conditions are met.");
        String protein = dna.substring(startCodon, stopCodon + 3);
        System.out.println("The protein is " + protein);

    } else {
        System.out.println("No protein");
    }

    System.out.println("The length of this protein is " + length);



    }
    
}
