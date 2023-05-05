//Object-Oriented Programming - BSC20922 - Sem 1 & 2
//CA 3 - 30%
//23842 Daniele Reis
//The first class is the main program that creates the chat window and initializes the other classes. 
//This is not a complete chat program because it lacks several things including database,
// but it meets the assessment requirements that the professor asked to be done.

import javax.swing.JFrame;

public class ChatMain {
    public static void main(String[] args) {
        JFrame frame = new ChatWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ChatClient client = new ChatClient();
        client.connect("localhost", 12345);
    }
}

