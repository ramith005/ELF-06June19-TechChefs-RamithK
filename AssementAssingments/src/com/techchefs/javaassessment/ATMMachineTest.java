package com.techchefs.javaassessment;
/**
 * 
 * @author Ramith
 * 19)	WAP where ATM machine can receive any ATM card and print the respective back name
 */
public class ATMMachineTest {

	public static void main(String[] args) {

		BankCard bc = new HDFCBankCard();

		bc.bankName();
	}
}
