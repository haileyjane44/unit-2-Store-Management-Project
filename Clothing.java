public class Clothing {

  private String color;
  private double price;
  private String gender;

  public Clothing() {
    this("no color", 0.0, "no gender");
  }

  public Clothing(String color, double price, String gender){
    this.color = color;
    this.price = price;
    this.gender = gender;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public double getPrice(){
    return price;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public String getGender(){
    return gender;
  }

  public void setGender(String gender){
    this.gender = gender;
  }

  public String toString(){
    return "Color: " + color
      + "\nPrice $" + price
      +"\nGender: " + gender;
  }
}