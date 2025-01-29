package day01linkedlist.doublylinkedlist.undoredofunctionalityfortexteditor;
// Main class for Text Editor Functionality System
public class TextEditorFunctionalitySystem {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);  // History limit set to 10 states

        // Simulate text editing
        editor.addTextState("Hello");
        editor.displayCurrentState(); // Current State: Hello

        editor.addTextState("Hello World");
        editor.displayCurrentState(); // Current State: Hello World

        editor.addTextState("Hello World!");
        editor.displayCurrentState(); // Current State: Hello World!

        // Undo and Redo operations
        editor.undo(); // Undo: Hello World
        editor.undo(); // Undo: Hello

        editor.redo(); // Redo: Hello World
        editor.redo(); // Redo: Hello World!

        // Adding more text
        editor.addTextState("Hello, New World!");
        editor.displayCurrentState(); // Current State: Hello, New World!
    }
}
