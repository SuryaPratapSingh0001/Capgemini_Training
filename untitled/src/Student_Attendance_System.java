import java.util.*;

public class Student_Attendance_System {
    public static void main() {
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        map.computeIfAbsent("Surya", k -> new ArrayList<>())
                .addAll(Arrays.asList(1, 88));
        map.computeIfAbsent("", k -> new ArrayList<>())
                .addAll(Arrays.asList(1, 88));
        map.computeIfAbsent("Science", k -> new ArrayList<>())
                .addAll(Arrays.asList(1, 88));
        map.computeIfAbsent("Science", k -> new ArrayList<>())
                .addAll(Arrays.asList(1, 88));

    }




}
