public class Hero extends Character implements Defender{
  String heroType;
  
  public Hero(String name, double health, String heroType){
    super(name, health);
    this.heroType = heroType; 
  }


// getters
  public String getHeroType(){
    return heroType; 
  }
// setters

 public void setHeroType(String heroType){
   this.heroType = heroType; 
 }

  public void skill(){
    String skill;
    if (this.heroType.equalsIgnoreCase("Fighter")){
      skill = "Flame Fist";
      System.out.println(skill);
    }
    if (this.heroType.equalsIgnoreCase("Healer")){
      skill = "Healing Wind";
      System.out.println(skill);
    }
    if (this.heroType.equalsIgnoreCase("Defender")){
      skill = "Iron defense";
      System.out.println(skill);
    }
    if (this.heroType.equalsIgnoreCase("Caster")){
      skill = "Blizzard";
      System.out.println(skill);
    }
  }
  
  @Override
    public void defend(){
      System.out.println(this.name + " with this heroType: " + this.heroType + " defends the people with this amount of health: " + this.health);
    }

}
