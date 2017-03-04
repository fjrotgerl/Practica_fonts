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
        String lletra[] = alphabet.split("\n");
        StringBuilder sb = new StringBuilder();
        int start;
        int finish;
        int longitud_lletra = (lletra[0].length()-25)/27;
        for (int j = 0; j < lletra.length; j++) {
            for (int q = 0; q < text.length(); q++) {
                if (text.charAt(q) >= 'A' && text.charAt(q) <= 'Z') {
                    start = (text.charAt(q) - 65) * (longitud_lletra + 1);
                    finish = start + longitud_lletra;
                    if (q == text.length() - 1) {
                        sb.append(lletra[j].substring(start,finish));
                    } else {
                        sb.append(lletra[j].substring(start,finish) + " ");
                    }
                } else if (text.charAt(q) != ' '){
                    start = lletra[0].length()-longitud_lletra;
                    finish = lletra[0].length();
                    if (q == text.length() - 1) {
                        sb.append(lletra[j].substring(start, finish));
                    } else {
                        sb.append(lletra[j].substring(start, finish) + ' ');
                    }
                } else if (text.charAt(q) == ' ') {
                    for (int i = 0; i < longitud_lletra; i++) {
                        sb.append(' ');
                    }
                    sb.append(" ");
                }
            }
            if (j == lletra.length - 1) {
                continue;
            } else {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
