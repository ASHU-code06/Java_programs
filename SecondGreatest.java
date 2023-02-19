import java.util.Scanner;

public class SecondGreatest {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=new Scanner(System.in).nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements of an array");
        for (int k=0;k<array.length;k++){
            array[k]=obj.nextInt();
        }
        greatestSecondElementPrint(array);
    }
    static void greatestSecondElementPrint( int array[]){
        int swap=0;
        for (int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if (array[i]<array[j]){
                    swap=array[i];
                    array[i]=array[j];
                    array[j]=swap;
                }
            }
        }
        System.out.println("Sorted array in descending order is : ");
        for (int l=0;l<array.length;l++){
            System.out.print(" "+array[l]);
        }
        System.out.println("\n\nSecond greastest element is "+array[1]);
    }
}
