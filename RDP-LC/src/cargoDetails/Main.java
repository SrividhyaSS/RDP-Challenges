package cargoDetails;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the cargo details:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the description");
		String description = sc.nextLine();
		System.out.println("Enter the length");
		double length = sc.nextDouble();
		System.out.println("Enter the width");
		double width = sc.nextDouble();
		Cargo cargo = new Cargo();
		cargo.setName(name);
		cargo.setDescription(description);
		cargo.setLength(length);
		cargo.setWidth(width);
		System.out.println("The cargo details are:");
		cargo.displayCargoDetails();

			}


	}


