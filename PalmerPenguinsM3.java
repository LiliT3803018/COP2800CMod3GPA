//PalmerPenguinsM3.java
//Liliana Torres
//September 15th, 2026

public class PalmerPenguinsM3 {
   public static void main(String[] args) {
      
      //constants that represent the species and countings
      final String SP_CHINSTRAP = "Chinstrap";
      final String SP_GENTOO = "Gentoo";
      final String SP_ADELIE = "Adelie";
      
      final int TOTAL_SPECIES = 3;
      
      //output the species names with introductory text
      System.out.println("Introducing the Palmer Penguins: ");
      System.out.println("\t" + SP_CHINSTRAP + "!");
      System.out.println("\t" + SP_GENTOO + "!");
      System.out.println("and last but not least...");
      System.out.println("\t" + SP_ADELIE + "!");
      System.out.println("There are a total of " + TOTAL_SPECIES + " penguin species in this dataset.");
      
      //constants that represent the number of penquins for each species
      final int NUM_CHINSTRAP = 68;
      final int NUM_GENTOO = 123;
      final int NUM_ADELIE = 151;
      
      //calculates total number of penguins
      final int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
      
      //prints the total number of penguins
      System.out.println("There are a total of " + totalPenguins + " penguins in the dataset.");
      
      //output the species names with percentage and total number of penguins
      System.out.printf("%s: %d (%.2f%%)%n", SP_CHINSTRAP, NUM_CHINSTRAP, ((double) NUM_CHINSTRAP / totalPenguins * 100));
      System.out.printf("%s: %d (%.2f%%)%n", SP_GENTOO, NUM_GENTOO, ((double) NUM_GENTOO / totalPenguins * 100));
      System.out.printf("%s: %d (%.2f%%)%n", SP_ADELIE, NUM_ADELIE, ((double) NUM_ADELIE / totalPenguins * 100));
      
      //prints the branching analysis line
      System.out.println("Branching Analysis: ");
      
      //Determines which species has the highest population count and if there is a tie
      if (NUM_CHINSTRAP == NUM_GENTOO && NUM_GENTOO == NUM_ADELIE) {
         System.out.println("There is a tie for the most populous species.");
      }
      else if (NUM_CHINSTRAP == NUM_GENTOO && NUM_CHINSTRAP > NUM_ADELIE) {
         System.out.println("There is a tie for the most populous species.");
      }
      else if (NUM_CHINSTRAP == NUM_ADELIE && NUM_CHINSTRAP > NUM_GENTOO) {
         System.out.println("There is a tie for the most populous species.");
      }
      else if (NUM_GENTOO == NUM_ADELIE && NUM_GENTOO > NUM_CHINSTRAP) {
         System.out.println("There is a tie for the most populous species.");
      }
      else if (NUM_CHINSTRAP > NUM_GENTOO && NUM_CHINSTRAP > NUM_ADELIE) {
         System.out.println("The most populous species is " + SP_CHINSTRAP + ".");
      }
      else if (NUM_GENTOO > NUM_CHINSTRAP && NUM_GENTOO > NUM_ADELIE) {
         System.out.println("Ther most populous species is " + SP_CHINSTRAP + ".");
      }
      else {
         System.out.println("The most populous species is " + SP_ADELIE + ".");
      }
   }
}