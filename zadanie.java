import java.util.Scanner;
public class zadanie{

    static int PocetCisel;
    static int num[];
    static int largest(int arr[]){
        int largestNum=num[0];
        for(int i=0;i<arr.length;i++){
            if(num[i]>largestNum){
                largestNum=num[i];
            }
        }
        return largestNum;
    }

    static int smallest(int arr[]){
        int smallestNum=num[0];
        for(int i=0;i<arr.length;i++){
            if(num[i]<smallestNum){
                smallestNum=num[i];
            }
        }
        return smallestNum;
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        System.out.println("Koľko čisel chceš zadať?: ");
        PocetCisel=input.nextInt();
        num=new int[PocetCisel];

        System.out.println("Zadaj čísla: ");
        for(int i=0;i<PocetCisel;i++){
            num[i]=input.nextInt();
        }
        System.out.println("Najväčšie číslo:" +largest(num));
        System.out.println("Najmenšie čislo: " +smallest(num));
    }

}