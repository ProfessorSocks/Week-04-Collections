import java.util.List;
import java.util.ArrayList;

public class test1 {

	// public static void main(String[] args) {
	// 	int indexVal = 6;
	// 	List<String> productList = new ArrayList<>(); 
		
	// 	productList.add("Macbook");
	// 	productList.add("HP Notebook");
	// 	productList.add("iPhone 14");
	// 	productList.add("Acer Aspire");
	// 	productList.add("Windows Surface");
	// 	productList.add("Galaxy S23");
	// /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
	    
	//     // WRITE YOUR CODE HERE
	//     if(productList.get(indexVal) != null){
	//         System.out.println(productList.get(indexVal));
	//     }else{
	//         System.out.println("No product can be found with that product number.");
	//     }
		
        beginEnd(10);
		
		
		
		
	}
    static void beginEnd(int endNum) {
	    
	    // WRITE YOUR CODE HERE
        List<Integer> newList = new ArrayList<>();
        if(endNum > 0){
            for(int i = 0; i < endNum; i++){
                newList.add(i);
            }
            System.out.println("The first number in the List is " + newList.get(0));
            System.out.println("The last number in the List is " + newList.get(newList.size() - 1));
        }else{
            System.out.println("Your List cannot be created with a number less than one.");
        }
}