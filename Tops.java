public class Tops extends Clothing{

  private boolean hasLogo;
  private String sleeveType;

  public Tops(){
    super("no color", 0.0, "no gender");
    hasLogo = false;
    sleeveType = "no sleeve type";
  }

  public Tops(String color, double price, String gender, boolean hasLogo, String sleeveType){
    super(color, price, gender);
    this.hasLogo = hasLogo;
    this.sleeveType = sleeveType;
  }

  public boolean getHasLogo(){
    return hasLogo;
  }

  public void setHasLogo(boolean hasLogo) {
    this.hasLogo = hasLogo;
  }

  public String getSleeveType(){
    return sleeveType;
  }

  public void setSleeveType(String sleeveType){
    this.sleeveType = sleeveType;
  }

  public String toString(){
    return super.toString()
      +"\nHas Logo: " + hasLogo
      +"\nSleeve Type: " + sleeveType;
  }
}