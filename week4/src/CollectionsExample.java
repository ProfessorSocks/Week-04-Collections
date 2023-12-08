import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class CollectionsExample {


    public static void main(String[] args) {
        //////list
            /*Allows duplicates
             * keeps it in order by index
             * allows more values to be added
             * implemented by ArrayList, LinkedList and Vector
             */
            List<String> students = new ArrayList<String>();
            students.add("Rob");
            students.add("Rob");
            students.add("Sam");

            for(String student : students){
                System.out.println(student);

            }
        /////set
            /*
             * no duplicates
             * Unordered
             * allows null but only 1 null
             * implentations HashSet, LinkedHashSet and TreeSet
             */
            Set<String> states = new HashSet<String>();
            states.add("Nevada");
            states.add("Nevada");
            states.add("California");

            for(String state : states){
                System.out.println(state); //Will only print out nevada once
            }

            System.out.println(states.contains("California"));
            System.out.println(states.size());
            states.remove("Nevada");
        


        //// map
            /*
             * 
             * map<k,v> k = key and v = value
             * key value pairs (Dictionary)
             * Values can be duplicates but not keys
             * implentations HashMap, LinkedHashMap, TreeMap, HashTable
             */
            Map<Integer,String> racerPlacements = new HashMap<Integer, String>();
            racerPlacements.put(1, "Camille");
            racerPlacements.put(2, "Taylor");
            racerPlacements.put(3, "Sxnny");

            Map<String, String> dict = new HashMap<String,String>();
            dict.put("Use","To do something with");

            System.out.println(racerPlacements.get(1));

            Set<Integer> racerKeys = racerPlacements.keySet();
            for(Integer key : racerKeys){
                System.out.println(key + " : " + racerPlacements.get(key));
            }

            // racerPlacements.remove(3)
            Collection<String> racers = racerPlacements.values();
            for(String racer : racers){
                System.out.println(racer);
            }


    }
    
}
