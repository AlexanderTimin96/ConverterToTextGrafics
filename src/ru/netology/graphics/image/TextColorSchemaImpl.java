package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {
    final String DENSITY = "#$@%*+-'";

    @Override
    public char convert(int color) {
        int charValue = (int) Math.round(DENSITY.length() / 255.0 * color);
        if (charValue < 0) {
            charValue = 0;
        } else if (charValue >= DENSITY.length()) {
            charValue = DENSITY.length() - 1;
        }
        return DENSITY.charAt(charValue);
    }
}
