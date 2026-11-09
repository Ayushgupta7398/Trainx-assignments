public class Main {
    static void arrange(char[] letters, boolean[] used, char[] result, int position) {
        if (position == letters.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[position] = letters[i];
                arrange(letters, used, result, position + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c'};
        arrange(letters, new boolean[letters.length], new char[letters.length], 0);
    }
}
