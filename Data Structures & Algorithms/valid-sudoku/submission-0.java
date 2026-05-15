class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                
                // Skip empty cells
                if (current != '.') {
                    // Try to add descriptive keys to the set.
                    // If add() returns false, it means the rule was violated.
                    if (!seen.add(current + " in row " + i) ||
                        !seen.add(current + " in col " + j) ||
                        !seen.add(current + " in block " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
