package Data_Structure;

import java.util.Scanner;

public class Binary_Converter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int remainder;
        //int q = Integer.MAX_VALUE;

        while(num > 0){
            remainder = num%2;
            st.append(remainder);
            num = num/2;
        }
        System.out.println(st.reverse());
    }
}
