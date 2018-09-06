import java.util.*;


/**
 * TracklistMapFun
 */
public class TracklistMapFun {

  public static void main(String[] args) {

   /** 
    * song title as key and sample of lyrics as  
    the values
    * */

    HashMap<String, String> tracklistmap = new HashMap<String, String>();

    tracklistmap.put("*** Song Title: A girl like you", "Cause girls like you Run around with guys like me");
    tracklistmap.put("*** Song Title: Sugar", "Ooh baby, 'Cause I really don't care where you are I just wanna be there where you are");
    tracklistmap.put("*** Song Title: What lovers do", "Say say say, hey hey now baby, Oh mama don't play now baby Say say say, hey hey now baby, Said let's get one thing straight now baby");
    tracklistmap.put("*** Song Title: Maps", "I was there for you In your darkest timesI was there for you In your darkest night");

    Set<String> keys = tracklistmap.keySet();
    for(String key: keys){
      System.out.println(key);
      System.out.println(tracklistmap.get(key));
    }

  }
  
}