class ThisPersonTest {
  public static void main(String[] args) {
      Person person1 = new ThisPerson(10, "Person1");
      Person person2 = new ThisPerson(5, "Person2");
      person1.objectMethods(person2);
  }
}
