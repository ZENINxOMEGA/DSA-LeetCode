class Solution {
    public int reverse(int x) {
        long sum = 0; // Use long to prevent silent overflow during calculation

        while (x != 0) {
            sum = (sum * 10) + (x % 10);
            x = x / 10;
        }

        // Check if the result overflows a 32-bit signed integer
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) sum; // Safe to cast back to int
    }
}
