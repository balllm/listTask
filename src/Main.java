import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 1, 2, 1, 0, 2, 3, 4, 5, 4));

        System.out.println(newList(list));
    }

    public static ArrayList<Integer> newList (ArrayList<Integer> list){
        ArrayList<Integer>  result = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            if(!result.contains(list.get(i))){
                result.add(list.get(i));
            }
        }
        return result;
    }
}