public class Prisoner{
  public int assignedNumber, maxGuesses, noOfGuesses, noOfPrisoners;
  private String gangAffil;

  public Prisoner(String g){
    g = gangAffil;
  }
  
  public int pickBox(Box b){
    noOfGuesses++;
    return b.getAssignedNo();
  }

  
}