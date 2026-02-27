import java.util.Scanner;
class Alpha{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Character:: ");

        char ch = sc.next().charAt(0);
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
            System.out.println("Given Number is Alphabet");
        }
        else{
            System.out.println("Gven Number is not an Alphabet");
        }
        sc.close();
    }
}