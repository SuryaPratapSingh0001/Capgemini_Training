package Streams;

import java.util.Scanner;

public class Rotate {
     static String shift(String str){
        if(str.length()<3){
            return str;
        }
//        StringBuilder st = new StringBuilder();
//        for(int i=2; i<str.length(); i++){
//            st.append(str.charAt(i));
//        }
//
//        st.append(str.charAt(0));
//        st.append(str.charAt(1));
//
//        str = st.toString();
//
//        return str;
        String start = str.substring(0,2);
        String end = str.substring(2);

        return end + start;

    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();

        System.out.println(shift(str));
    }
}
