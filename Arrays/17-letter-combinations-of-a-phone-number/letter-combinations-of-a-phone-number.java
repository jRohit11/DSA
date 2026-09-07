class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        // Edge case
        if (digits == null || digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs",
            "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), ans, map);

        return ans;
    }

    private void backtrack(String digits,
                           int index,
                           StringBuilder current,
                           List<String> ans,
                           String[] map) {

        // Base case: processed all digits
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Letters corresponding to current digit
        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            // 1. Choose
            current.append(letters.charAt(i));

            // 2. Explore
            backtrack(digits, index + 1, current, ans, map);

            // 3. Undo (Backtrack)
            current.deleteCharAt(current.length() - 1);
        }
    }
}