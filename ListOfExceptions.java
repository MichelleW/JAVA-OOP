import java.util.ArrayList;
import java.util.Random;


public class ListOfExceptions {
  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    // System.out.println(myList);
    for (int i = 0; i < myList.size(); i++) {
      Integer castedValue = (Integer) myList.get(i);

    }


    
class OutOfGasException extends Exception{}
class UnreliableFriend {
    public boolean deliverMessage() throws OutOfGasException{
        Random r = new Random();
        boolean hasGas = r.nextBoolean();
        if (hasGas){
            return true;
        }
        throw new OutOfGasException();
    }
}


  }
}
