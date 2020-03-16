package stopGninnipSMySdroW;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SpinWords {
    private static Pattern compile = Pattern.compile(" ");

    public String spinWords(String sentence) {
        return compile.splitAsStream(sentence)
                      .map(word -> word.length() >= 5 ? new StringBuilder(word).reverse() : word)
                      .collect(Collectors.joining(" "));
    }
}
