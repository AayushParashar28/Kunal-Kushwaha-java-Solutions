public class string2 {
    public static void main(String[] args) {
        String s = "1.1.1.1";

        System.out.println(defangIPaddr(s));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
