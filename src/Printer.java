/**
 * Created by Kekko on 23/02/2017.
 */
public class Printer {
    private String text;
    private String alphabet;
    public Printer(String alphabet) {
        this.alphabet = alphabet;
    }

    public String render(String text) {
        text = text.toUpperCase();
        this.text = text;
        StringBuilder sb = new StringBuilder();
        int start = 104;
        int finish = 107;
        for (int j = 0; j < text.length(); j++) {
            if (text.charAt(j) == 'A') { start = 0; finish = 3;}
            else if (text.charAt(j) == 'B') { start = 4;  finish = 7;}
            else if (text.charAt(j) == 'C') { start = 8; finish = 11; }
            else if (text.charAt(j) == 'D') { start = 12; finish = 15; }
            else if (text.charAt(j) == 'E') { start = 16; finish = 19; }
            else if (text.charAt(j) == 'F') { start = 20; finish = 23; }
            else if (text.charAt(j) == 'G') { start = 24; finish = 27; }
            else if (text.charAt(j) == 'H') { start = 28; finish = 31; }
            else if (text.charAt(j) == 'I') { start = 32; finish = 35; }
            else if (text.charAt(j) == 'J') { start = 36; finish = 39; }
            else if (text.charAt(j) == 'K') { start = 40; finish = 43; }
            else if (text.charAt(j) == 'L') { start = 44; finish = 47; }
            else if (text.charAt(j) == 'M') { start = 48; finish = 51; }
            else if (text.charAt(j) == 'N') { start = 52; finish = 55; }
            else if (text.charAt(j) == 'O') { start = 56; finish = 59; }
            else if (text.charAt(j) == 'P') { start = 60; finish = 63; }
            else if (text.charAt(j) == 'Q') { start = 64; finish = 67; }
            else if (text.charAt(j) == 'R') { start = 68; finish = 71; }
            else if (text.charAt(j) == 'S') { start = 72; finish = 75; }
            else if (text.charAt(j) == 'T') { start = 76; finish = 79; }
            else if (text.charAt(j) == 'U') { start = 80; finish = 83; }
            else if (text.charAt(j) == 'V') { start = 84; finish = 87; }
            else if (text.charAt(j) == 'W') { start = 88; finish = 91; }
            else if (text.charAt(j) == 'X') { start = 92; finish = 95; }
            else if (text.charAt(j) == 'Y') { start = 96; finish = 99; }
            else if (text.charAt(j) == 'Z') { start = 100; finish = 103; }
            for (int i = 0; i < 5; i++) {
                sb.append(alphabet.substring(start, finish));
                // Afegim un salt de línia (menys a l'últim) per a que no es col·lapsi amb la següent lletra
                if (i != 4) { sb.append("\n"); }
                else if (i == 4) { sb.append("\n"); }
                start += 108;
                finish += 108;

            }
        }
        return sb.toString();
    }
}
