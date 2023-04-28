public class Character{
  String name; 
  double health; 

  public Character(String name, double health){
    this.name = name; 
    this.health = health;
  }

  //getters

  public String getName(){
    return name; 
  }

  public double getHealth(){
    return health; 
  }

  // setters

  public void setName(String name){
    this.name = name; 
  }

  public void setHealth(double health){
    this.health = health; 
  }
}