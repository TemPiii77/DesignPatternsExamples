package org.example.Behavioral.Memento;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapshot());
        System.out.println(text);
    }

    public void undo() {
        stateHistory.pop();
        textArea.restore(stateHistory.peek());
        System.out.println(stateHistory.getLast().getText());
    }
}
