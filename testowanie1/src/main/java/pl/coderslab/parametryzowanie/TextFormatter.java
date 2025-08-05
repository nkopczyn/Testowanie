package pl.coderslab.parametryzowanie;

public class TextFormatter {
    public static String format(String text) {
        String clean = text.replaceAll("[\\n\\t\\r]+", "");
        String trimmed = clean.trim(); // biale znaki z poczatku i konca
        return trimmed;
    }
}

