/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uno;

/**
 *
 * @author Abdul Rahman Fatouhe
 */


import java.util.ArrayList;
import java.util.Scanner;



public class Player {
    private final String name;
    private final ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void drawCard(Card card) {
        hand.add(card);
    }

    public Card playCard(int index) {
        return hand.remove(index);
    }

    public boolean hasCardInHand(String color, String value) {
        for (Card card : hand) {
            if (card.getColor().equals(color) && card.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int chooseCardIndexToPlay(String color, String value) {
        Scanner scanner = new Scanner(System.in);
        int index;
        do {
            System.out.print(name + ", choose a card index to play (or enter -1 to draw a card): ");
            index = scanner.nextInt();
        } while (index != -1 && (index < 0 || index >= hand.size() || !isValidCard(index, color, value)));
        return index;
    }

    private boolean isValidCard(int index, String color, String value) {
        Card card = hand.get(index);
        return card.getColor().equals(color) || card.getValue().equals(value);
    }
}

