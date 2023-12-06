package arraylisttask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Character> characterList = new ArrayList<>();
        Collections.addAll(characterList, 'a', 'b', 'a', 'a', 'c', 'a', 'a', 'a', 'z', 'f');
        for (int i = 0; i < characterList.size(); i++) {
            if (characterList.get(i) == 'a') {
                characterList.remove(i);
                i--;
            }
        }
        System.out.println(characterList);
    }
}
