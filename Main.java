import java.util.*; 
class Main {
  public static void main(String[] args) {
    ArrayList<Hero> heroList = new ArrayList<>(); 
    System.out.println("This program will help you create your very own hero roster!");
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Please enter a name. Type 'done' to exit");
      String name = sc.next();
      if("done".equalsIgnoreCase(name)){
        System.out.println("Thank you for using my program! I hope you enjoyed making your hero roster!");
        break;
      }
      
    
      System.out.println("Now you will enter the amount of health the hero have. Please choose a number between 1 and 100.");
    
      double healthNum = sc.nextDouble();
    
      System.out.println("Now you will be presented with a few options of a herotype to add to your person");
    
    System.out.println("HeroType List:\n" 
                      + "1) Fighter\n"
                      + "2) Healer\n"
                      + "3) Defender\n"
                      + "4) Caster");

    try{
     int choice = sc.nextInt();
     String type;
     switch(choice){
       case 1: type = "Fighter";
              break;
       case 2: type = "Healer";
              break; 
       case 3: type = "Defender";
              break;
       case 4: type = "Caster"; 
              break;
       default: type = "no type assigned";
     }
    Hero h = new Hero(name, healthNum, type);
    heroList.add(h);
    } catch (Exception e){
      System.out.println("There was an error in the input of your choice");
    }
    }  
      
    //Prints roster list after user is done
    for (Hero hero : heroList){
       hero.defend();
    }
    //Print skills associated to the heryoType
    System.out.println("Here is a list of the skills that your Hero List posses:");
    for (Hero hero : heroList){
      hero.skill();
    }
    sc.close();
  }

  
  
}
  