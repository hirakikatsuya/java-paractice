package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int flytime;

	public FlyingPhone(int flytime) {
		this.flytime = flytime;
	}

	public void fly() {
		System.out.println(flytime + "分間、飛びます。");
	}

	public void call(String number) {
		System.out.println(number+"に電話します。通話できるのは飛んでいる間だけです。");
	}

	public void powerOff() {
		Flying.super.powerOff();
	}
}
