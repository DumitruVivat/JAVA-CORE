package dev.dumitru;

public class Caesar {
    public static void main(String[] args) {
        String text = "Hello, World";
        int key = 3;
        boolean isEncrypted = true;

        String encrypted = caesar(text, key, isEncrypted);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = caesar(encrypted, key, false);
        System.out.println("Decrypted: " + decrypted);
    }
    private static String caesar(String in, int key, boolean encrypt) {
        if(in == null || in.isEmpty()) return null;

        final int len = in.length();
        char[] out = new char[len];

        if (!encrypt) {
            key = -key;
        }
        for (int i = 0; i < len; i++) {
            char currentChar = in.charAt(i);

            if(Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';

                char shiftedChar = (char) ((currentChar - base + key) % 26 + base);
                out[i] = shiftedChar;
            } else {
                out[i] = currentChar;
            }
        }
        return new String(out);
    }
}
