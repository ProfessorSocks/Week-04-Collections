import java.util.ArrayList;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {
        
        // List<String>     <-list of string
        List<String> sports = new ArrayList<String>();
        sports.add("Wrestling");
        sports.add("Soccer");
        sports.add("Football");

        for(int i = 0; i < sports.size(); i++){
            System.out.println(sports.get(i));
        }
    }
}
