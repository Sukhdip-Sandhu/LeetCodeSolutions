import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            listList.add(new ArrayList<>());
            listList.get(i).add(1);
            if ((i - 1) >= 0) {
                for (int j = 0; j < (i - 1); j++) {
                    listList.get(i).add(listList.get(i - 1).get(j) + listList.get(i - 1).get(j + 1));
                }
                listList.get(i).add(1);
            }
        }
        return listList;
    }
}