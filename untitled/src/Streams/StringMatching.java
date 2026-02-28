package Streams;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public static void main() {
        String original = "this is line. Line contains few words. Line is in java";
        String target = "Line";

        original = original.toLowerCase();
        target = target.toLowerCase();

        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j=0;
        while(i<original.length()) {
            if (original.charAt(i) == target.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }

            if (j == target.length()) {
                list.add(i - 4);
                j = 0;
            }

        }

        for(int index=0; index<list.size(); index++){
            System.out.println(list.get(index));
        }
    }
}
