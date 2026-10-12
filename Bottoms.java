public class Bottoms extends Clothing {
  private boolean isBaggy;
  private String material;


public Bottoms() {
  super("no color", 0.0, "no gender");
    isBaggy = false;
    material = "no material";
}

public Bottoms(String color, double price, String gender, boolean isBaggy, String material) {
  super(color, price, gender);
  this.isBaggy = isBaggy;
  this.material = material;
}

public boolean getIsBaggy() {
  return isBaggy;
}

public void setIsBaggy(boolean isBaggy) {
  this.isBaggy = isBaggy;
}

public String getMaterial() {
  return material;
}

public void setMaterial(String material) {
  this.material = material;
}

public String toString() {
  return super.toString()
    +"\nIs Baggy: " + isBaggy
    +"\nMaterial: " + material;
}

}
