import java.util.ArrayList;



class Solution {

    static ArrayList<Integer> getTable(int N) {

        ArrayList<Integer> table = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {

            table.add(N * i);

        }

        return table;

    }

}
