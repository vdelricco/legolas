package me.greenleaf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ask Legolas a question: ");
        String question = scanner.next();
        System.out.print("Legolas says: " + Legolas.getInstance().queryMind(question));
    }
}
