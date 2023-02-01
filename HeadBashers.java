public class HeadBashers extends Prisoner{
  private int violenceLevel, cooperationLevel; //declared here as the values will be randomized and thus difficult to coordinate if only under Prisoner
  
  public HeadBashers(String gangAffil, int violence, int cooperation){ //violence and cooperation values will be set in the declaration process through limited RNG
    super("Head Bashers");
  }

  public int getViolence(){
    return violenceLevel;
  }

  public int getCooperation(){
    return cooperationLevel;
  }
}