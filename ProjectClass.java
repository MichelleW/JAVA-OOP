public class ProjectClass{
  public String name; 
  public String description;

 
  public ProjectClass(){};
  public ProjectClass(String name){};
  public ProjectClass(String name, String description){};

  public void elevatorPitch (String name, String description){
    this.name = name;
    this.description = description;
     System.out.println(this.name + this.description);
    
  }



}

