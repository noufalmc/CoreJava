import  java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Character");
        char C=sc.next().charAt(0);
        switch (C)
        {
            case 'A':
            case 'a':
                System.out.println("A is vowel");
                break;
            case 'E':
            case 'e':
                System.out.println("E is vowel");
                break;
            case 'I':
            case 'i':
                System.out.println("I is vowel");
                break;
            case 'O':
            case 'o':
                System.out.println("O is vowel");
                break;
            case 'U':
            case 'u':
                System.out.println("U is vowel");
                break;
            default:
                System.out.println(C+" is Consonant");
                break;
        }
    }
}
