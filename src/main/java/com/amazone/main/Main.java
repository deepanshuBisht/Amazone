package com.amazone.main;

import java.util.Scanner;

import com.amazone.account.Admin;
import com.amazone.account.User;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******WELCOME*****");
		System.out.println("********TO********");
		System.out.println("******AMAZONE*****");

		System.out.println("Choice Your Options");
		System.out.println("1 = User Login");
		System.out.println("2 = Admin Login");
		int choice = sc.nextInt();
		if(choice == 1) {
			User user = new User();
		}else if(choice == 2) {
			Admin admin = new Admin();
		}else {
			System.out.println("Wrong Input");
		}
		sc.close();
	}

}
