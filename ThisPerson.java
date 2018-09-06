public class ThisPerson {
  private int age;
  private String name;
  
  public ThisPerson(int ageParam, String nameParam) {
      this.age = ageParam;
      this.name = nameParam;
  }
  public void objectMethods(Person anotherObject) {
      System.out.println("Class name: " + this.getClass().getSimpleName());
      System.out.println("toString: " + this.toString());
      System.out.println("Equals: " + this.equals(anotherObject));
  }
  
}
