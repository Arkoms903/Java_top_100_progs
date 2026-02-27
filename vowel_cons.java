// import java.util.Scanner;

// class Vowel{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Eneter any character:: ");
//         char ch = sc.next().charAt(0);

//         if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//             System.out.println("The given character is Vowel");
//         }
//         else{
//             System.out.println("The given character is Consonent");
//         }
//         sc.close();
//     }
// }

//Optimized Version Using swich Case
import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("The given character is a Vowel");
                break;
            default:
                System.out.println("The given character is a Consonant");
        }

        sc.close();
    }
}