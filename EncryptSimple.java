package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String text = "we found a treasure!";
        String encryptedText;
        char encryptedChar;
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            switch (text.toLowerCase().charAt(i)) {
                case 'a':
                    encryptedChar = 'z';
                    break;
                case 'b':
                    encryptedChar = 'y';
                    break;
                case 'c':
                    encryptedChar = 'x';
                    break;
                case 'd':
                    encryptedChar = 'w';
                    break;
                case 'e':
                    encryptedChar = 'v';
                    break;
                case 'f':
                    encryptedChar = 'u';
                    break;
                case 'g':
                    encryptedChar = 't';
                    break;
                case 'h':
                    encryptedChar = 's';
                    break;
                case 'i':
                    encryptedChar = 'r';
                    break;
                case 'j':
                    encryptedChar = 'q';
                    break;
                case 'k':
                    encryptedChar = 'p';
                    break;
                case 'l':
                    encryptedChar = 'o';
                    break;
                case 'm':
                    encryptedChar = 'n';
                    break;
                case 'n':
                    encryptedChar = 'm';
                    break;
                case 'o':
                    encryptedChar = 'l';
                    break;
                case 'p':
                    encryptedChar = 'k';
                    break;
                case 'q':
                    encryptedChar = 'j';
                    break;
                case 'r':
                    encryptedChar = 'i';
                    break;
                case 's':
                    encryptedChar = 'h';
                    break;
                case 't':
                    encryptedChar = 'g';
                    break;
                case 'u':
                    encryptedChar = 'f';
                    break;
                case 'v':
                    encryptedChar = 'e';
                    break;
                case 'w':
                    encryptedChar = 'd';
                    break;
                case 'x':
                    encryptedChar = 'c';
                    break;
                case 'y':
                    encryptedChar = 'b';
                    break;
                case 'z':
                    encryptedChar = 'a';
                    break;
                default:
                    encryptedChar = text.toLowerCase().charAt(i);
            }
            result.append(encryptedChar);
        }
        System.out.println(result);
    }
}
