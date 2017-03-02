import java.util.Arrays;

/**
 * Created by Kekko on 23/02/2017.
 */
public class prova {
    public static void main(String[] args) {
        String data =
                        " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###\n" +
                        "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #\n" +
                        "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   # \n" +
                        "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      \n" +
                        "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ";

        StringBuilder sb = new StringBuilder();
        int start = 0;
        int finish = 3;
        String a = "*";

        for (int j = 0; j < a.length(); j++) {
            a.toUpperCase();
            if (a == "A") { start = 0; finish = 3;}
            else if (a == "B") { start = 4;  finish = 7;}
            else if (a == "C") { start = 8; finish = 11; }
            else if (a == "D") { start = 12; finish = 15; }
            else if (a == "E") { start = 16; finish = 19; }
            else if (a == "F") { start = 20; finish = 23; }
            else if (a == "G") { start = 24; finish = 27; }
            else if (a == "H") { start = 28; finish = 31; }
            else if (a == "I") { start = 32; finish = 35; }
            else if (a == "J") { start = 36; finish = 39; }
            else if (a == "K") { start = 40; finish = 43; }
            else if (a == "L") { start = 44; finish = 47; }
            else if (a == "M") { start = 48; finish = 51; }
            else if (a == "N") { start = 52; finish = 55; }
            else if (a == "O") { start = 56; finish = 59; }
            else if (a == "P") { start = 60; finish = 63; }
            else if (a == "Q") { start = 64; finish = 67; }
            else if (a == "R") { start = 68; finish = 71; }
            else if (a == "S") { start = 72; finish = 75; }
            else if (a == "T") { start = 76; finish = 79; }
            else if (a == "U") { start = 80; finish = 83; }
            else if (a == "V") { start = 84; finish = 87; }
            else if (a == "W") { start = 88; finish = 91; }
            else if (a == "X") { start = 92; finish = 95; }
            else if (a == "Y") { start = 96; finish = 99; }
            else if (a == "Z") { start = 100; finish = 103; }
            for (int i = 0; i < 5; i++) {
                if (a.length() == a.length()) {
                    sb.append(data.substring(start, finish) + "\n");
                    start += 108;
                    finish += 108;
                }
            }
        }
        System.out.println(sb.toString());

    }
}
