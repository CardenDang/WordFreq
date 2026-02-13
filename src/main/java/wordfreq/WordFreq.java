package wordfreq;

/**
 * Stores a phrase and a frequency
 * Higher frequency = higher priority
 */
public class WordFreq {
    String word;
    int frequency;

    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return word + " (" + frequency + ")";
    }
}
