public class StringBuilders {

    public static void main(String[] args){
        StringBuilder fullName = new StringBuilder("Sam");
        fullName.append(" Smith");
        System.out.println(fullName.toString());

        System.out.println(fullName.charAt(5));
        // System.out.println(fullName.delete(0, 3));
        // System.out.println(fullName.deleteCharAt(4));
        System.out.println(fullName.indexOf("th"));
    }
}