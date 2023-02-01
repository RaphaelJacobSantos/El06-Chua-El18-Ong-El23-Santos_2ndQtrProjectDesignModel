public class GuantanamoGhouls extends Prisoner{
  private int violenceLevel, cooperationLevel; //declared here as the values will be randomized and thus difficult to coordinate if only under Prisoner
  
  public GuantanamoGhouls(int violence, int cooperation){ //violence and cooperation values will be set in the declaration process through limited RNG
    super("Guantanamo Ghouls");
  }

  public int getViolence(){
    return violenceLevel;
  }

  public int getCooperation(){
    return cooperationLevel;
  }

}