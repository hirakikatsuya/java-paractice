package net.sejuku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

		System.out.println("あなたの1枚目のカードは" + toDescription(player.get(0)));
		System.out.println("ディーラーの1枚目のカードは" + toDescription(dealer.get(0)));
		System.out.println("あなたの2枚目のカードは" + toDescription(player.get(1)));
		System.out.println("ディーラーの2枚目のカードは秘密です。");

		int playerPoint = sumPoint(player);
		int dealerPoint = sumPoint(dealer);
		System.out.println("あなたの現在のポイントは" + playerPoint + "です。");

		while (true) {
			System.out.println("カードを引きますか？Yes:y or No:n");
			Scanner scan = new Scanner(System.in);
			String str = scan.next();

			if ("n".equals(str)) {
				break;
			} else if ("y".equals(str)) {
				player.add(deck.get(deckCount));
				deckCount++;
				playerHands++;

				System.out.println("あなたの" + playerHands + "枚目のカードは" + toDescription(player.get(playerHands - 1)));
				playerPoint = sumPoint(player);
				System.out.println("現在の合計は" + playerPoint);

				if (isBusted(playerPoint)) {
					System.out.println("残念、バーストしてしまいました。");
					return;
				}
			} else {
				System.out.println("あなたの入力は" + str + "です。yかnかを入力してください");
			}
		}

		while (true) {
			if (dealerPoint >= 17) {
				break;
			} else {
				dealer.add(deck.get(deckCount));
				deckCount++;
				dealerPoint = sumPoint(dealer);
				if (isBusted(dealerPoint)) {
					System.out.println("ディーラーがバーストしました。あなたの勝ちです！");
					return;
				}
			}
		}
		System.out.println("あなたのポイントは" + playerPoint);
		System.out.println("ディーラーのポイントは" + dealerPoint);

		if (playerPoint == dealerPoint) {
			System.out.println("引き分けです");
		} else if (playerPoint > dealerPoint) {
			System.out.println("勝ちました！");
		} else {
			System.out.println("負けました・・・");
		}
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

	private static int toPoint(int num) {
		if (num == 11 || num == 12 || num == 13) {
			num = 10;
		}
		return num;
	}

	private static int sumPoint(List<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + toPoint(toNumber(list.get(i)));
		}
		return sum;
	}

	private static boolean isBusted(int point) {
		if (point <= 21) {
			return false;
		} else {
			return true;
		}
	}
}
