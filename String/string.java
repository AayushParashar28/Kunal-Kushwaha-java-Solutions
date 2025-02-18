public class string {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        System.out.println(a==b);

        System.out.println(a.equals(b)); 
        
        
        String name1 = new String("Kunal");
        String name2 = new String("kunal");

        System.out.println(name1.equals(name2)); 
    }
}
