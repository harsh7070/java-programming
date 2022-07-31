public class P1_1 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        String str = "+91-95-999-91000";
        System.out.print("Mobile system code is : ");
        System.out.println(str.substring(4,6));
        System.out.print("MSC is : ");
        System.out.println(str.substring(7,10));
        System.out.print("Unique code is : ");
        System.out.println(str.substring(11));
        System.out.println("This program is made by 21CE039 Harsh");
    }
}