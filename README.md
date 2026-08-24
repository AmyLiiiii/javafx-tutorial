This is a starter repo for https://se-education.org/guides/tutorials/javaFx.html

## Project Structure

Part 4 refactors the GUI to use FXML. The layout is now separated from the Java code that controls
the application.

- `Main.java` starts the JavaFX application and loads `MainWindow.fxml`.
- `MainWindow.fxml` defines the main window layout, including the input box, Send button,
  scroll pane, and dialog container.
- `MainWindow.java` controls the main window. It handles user input, asks `Swell` for a response,
  and adds dialog boxes to the chat.
- `DialogBox.fxml` defines the layout of one chat message, including the text and avatar.
- `DialogBox.java` controls each chat message. It sets the message text, sets the avatar, keeps the
  avatar round, and flips Swell's replies to the left.

This makes `Main.java` much smaller and keeps visual layout details in FXML files. It also makes the
GUI easier to tweak later using Scene Builder.
