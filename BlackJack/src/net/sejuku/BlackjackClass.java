package net.sejuku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackjackClass {
	public static void main(String[] args) {
		System.out.println("ゲームを開始します");
		List<Integer> deck = new ArrayList<>(52);
		shuffleDeck(deck);
		List<Integer> player = new ArrayList<>();
		List<Integer> dealer = new ArrayList<>();

		player.add(deck.get(0));
		dealer.add(deck.get(1));
		player.add(deck.get(2));
		dealer.add(deck.get(3));

		int deckCount = 4;
		int playerHands = 2;
	}

	private static void shuffleDeck(List<Integer> deck) {
		for (int i = 1; i <= 52; i++) {
			deck.add(i);
		}
		Collections.shuffle(deck);
	}

	private static String toSuit(int cardNumber) {
		switch ((cardNumber - 1) / 13) {
		case 0:
			return "クラブ";
		case 1:
			return "ダイヤ";
		case 2:
			return "ハート";
		case 3:
			return "スペード";
		default:
			return "例外です";
		}
	}

	private static int toNumber(int cardNumber) {
		int number = cardNumber % 13;
		if (number == 0) {
			number = 13;
		}
		return number;
	}

	private static String toRank(int number) {
		switch (number) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			String str = String.valueOf(number);
			return str;
		}
	}

	private static String toDescription(int cardNumber) {
		String rank = toRank(toNumber(cardNumber));
		String suit = toSuit(cardNumber);

		return suit + "の" + rank;
	}
}
