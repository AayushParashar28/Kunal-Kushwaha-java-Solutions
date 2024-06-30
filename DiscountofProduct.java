import java.util.Scanner;

public class DiscountofProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Product Marked Price : ");
        float m = s.nextFloat();

        System.out.print("Enter the Product Selling Price : ");
        float n = s.nextFloat();

        float ans = Discount(m,n);
        System.out.println("The total Discount on Product is :" + ans);
    }

    static float Discount(float mp , float sp){
        float discountprice = mp - sp ;
        
        float discountpercentage = (discountprice/mp) * 100;

        return discountpercentage;
    }
}
