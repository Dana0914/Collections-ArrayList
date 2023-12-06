package arraylisttask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<Character> characterList = new ArrayList<>();
        Collections.addAll(characterList, 'a', 'b', 'a', 'a', 'c', 'a', 'a', 'a', 'z', 'f');
        List<Character> characterList1 = new ArrayList<>();
        Collections.addAll(characterList1, 'a', 'b');
        for (int i = 0; i < characterList.size(); i++) {
            if (characterList1.contains(characterList.get(i))) {
                characterList.remove(i);
                i--;
            }
        }
        System.out.println(characterList);


    }
}
