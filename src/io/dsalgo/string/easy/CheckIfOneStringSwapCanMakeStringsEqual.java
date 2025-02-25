package io.dsalgo.string.easy;

// 1790. Check if One String Swap Can Make Strings Equal
class CheckIfOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        // If the strings are already equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        // Store the indices where s1 and s2 differ
        int[] diffIndices = new int[2];
        int diffCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                // If more than 2 differences, return false
                if (diffCount >= 2) {
                    return false;
                }
                // Record the index of the difference
                diffIndices[diffCount] = i;
                diffCount++;
            }
        }

        // If exactly 2 differences, check if swapping makes the strings equal
        if (diffCount == 2) {
            int index1 = diffIndices[0];
            int index2 = diffIndices[1];
            return s1.charAt(index1) == s2.charAt(index2) && s1.charAt(index2) == s2.charAt(index1);
        }

        // If 0 or 1 difference, return false (since swapping is not possible for 1 difference)
        return false;
    }
}