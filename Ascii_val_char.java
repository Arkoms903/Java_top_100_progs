import java.util.Scanner;
class Ascii{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character which you wnat to get Ascii value:: ");

        char ch = sc.next().charAt(0);

        int ascii = (int) ch;
        System.out.println("The ASCII Value of given character is :: "  +ascii);
        sc.close();
    }
}