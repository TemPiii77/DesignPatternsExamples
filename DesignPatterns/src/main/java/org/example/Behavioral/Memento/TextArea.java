package org.example.Behavioral.Memento;

public class TextArea {
    private String text;

    public void setText(String text) {
        this.text = text;
    }
    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getText();
    }

    public static class Memento {
        private final String text;

        public Memento(String textToSave) {
            this.text = textToSave;
        }

        public String getText() {
            return text;
        }
    }
}
