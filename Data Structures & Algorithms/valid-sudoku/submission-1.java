class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Map.Entry<Integer, Integer>, Set<Character>> square = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;

                Map.Entry<Integer, Integer> boxKey = Map.entry(i / 3, j / 3);

                square.putIfAbsent(boxKey, new HashSet<>());

                if(!rows.get(i).add(board[i][j]) ||
                   !cols.get(j).add(board[i][j]) ||
                   !square.get(boxKey).add(board[i][j])) {
                    
                    return false;
                }
            }
        }

        return true;
    }
}
