/**
 * Created by Kekko on 23/02/2017.
 */
public class Printer {
    private String text;
    private String alphabet;

    // Cream el constructor
    // Amb aquest constructor aconseguim l'abecedari en concret
    public Printer(String alphabet) {
        this.alphabet = alphabet;
    }

    // Amb aquesta funció aconseguim imprimir el String que ens donen amb les lletres que tenim en el abecedari
    public String render(String text) {
        // Totes les lletres les convertim en majúscules
        text = text.toUpperCase();
        // Utilitzem el text que ens donen
        this.text = text;

        // Cream un array que emmagatzema cada fila del abecedari
        // D'aquesta manera més endavant podrem imprimir les lletres de dalt a baix
        // Utilitzam un split que actuï quan hi hagi un salt de línia
        String lletra[] = this.alphabet.split("\n");
        // Cream un StringBuilder per emmagatzemar les lletras
        StringBuilder sb = new StringBuilder();
        // La variable start indica l'inici que utilitzarà el subtring
        int start;
        // I la variable finish indica el final que utilitzarà el substring
        int finish;
        // Calculam quant mideix una lletra
        // Agafam el nombre de caràcters que té una línia, el restam per 25(el nombre de espais) i el dividim per 27(lletres del abecedari)
        int longitud_lletra = (lletra[0].length()-25)/27;

        // Feim dos bucles
        // El primer for mira cada fila
        // El segon mira cada caràcter de el text que ens passen
        for (int j = 0; j < lletra.length; j++) {
            for (int q = 0; q < text.length(); q++) {
                // Miram si el caràcter és una lletra majúscula
                if (text.charAt(q) >= 'A' && text.charAt(q) <= 'Z') {
                    // Calcul·lam start
                    // Aconseguim l'index (A-0,B-1,C-2...) i el multiplicam per la longitud de la lletra
                    // Li sumam 1 per comptar els espais que hi ha
                    start = (text.charAt(q) - 65) * (longitud_lletra + 1);
                    // finish serà la variable start més la longitud de la lletra
                    finish = start + longitud_lletra;
                    // Miram si és la última lletra
                    // Si és la última no afegirem un espai
                    // Però si no és la última lletra si que afegirem un espai
                    if (q == text.length() - 1) {
                        sb.append(lletra[j].substring(start,finish));
                    } else {
                        sb.append(lletra[j].substring(start,finish) + " ");
                    }
                } else if (text.charAt(q) != ' '){ // Miram si és un caracter especial(",&,#,º,etc.)
                    // Agafam l'última lletra del abecedari que és l'interrogant
                    // Per això a la logintud total li restam la longitud de la lletra
                    start = lletra[0].length()-longitud_lletra;
                    finish = lletra[0].length();
                    // Ara feim el mateix que abans
                    // Si és l'ultima lletra li afegim un espai
                    // Si nó, no
                    if (q == text.length() - 1) {
                        sb.append(lletra[j].substring(start, finish));
                    } else {
                        sb.append(lletra[j].substring(start, finish) + ' ');
                    }
                } else if (text.charAt(q) == ' ') { // Ara miram si és un espai
                    // Feim un for que afegi tants de espais com tant gran sigui la longitud de la lletra
                    for (int i = 0; i < longitud_lletra; i++) {
                        sb.append(' ');
                    }
                    // Afegim un espai més que li falta
                    sb.append(" ");
                }
            } if (j == lletra.length - 1) {
                // Ara miram si estem a l'última fila
                // Si és així, no feim res
                continue;
            } else {
                // Però si nó, li afegim un salt de línia
                sb.append("\n");
            }
        }
        // Retornam el que hem construït
        return sb.toString();
    }
}
