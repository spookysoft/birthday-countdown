package de.kapitel2.java;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class birthdaycountdown {


	public static void main(String[] args) {

		Scanner s= new Scanner (System.in);

		System.out.println ("What year were you born in?");

		LocalDate localDate = LocalDate.now();
		int localdayy= localDate.getDayOfMonth();
		int dateutypedin1 = s.nextInt();

		if (dateutypedin1 == 69) {
			System.out.println ("haha ur a funny one");

		}
		else if (dateutypedin1 == 420) {
			System.out.println ("blaze it");
		}


		System.out.println ("What month were you born in?");
		int dateutypedin2= s.nextInt();


		System.out.println ("What day was it?");
		int dateutypedin3= s.nextInt();

		LocalDate Geburt = LocalDate.of(dateutypedin1, dateutypedin2, dateutypedin3);
		Period p= Period.between(Geburt, localDate);
		int Jahre = p.getYears();
		int Monate = p.getMonths();
		int Tage = p.getDays();

		System.out.println ("you are " + Jahre+ " years, "+ Monate + " months and "+ Tage + " days old.");

		if (Jahre<=17) {
			System.out.println ("Therefore, you're underage");
		}
		else { System.out.println ("Therefore, you're of age ");

		}
		int diesesjahr = localDate.getYear();
		LocalDate geburtstag = LocalDate.of(diesesjahr, dateutypedin2, dateutypedin3);
		Period p2 = Period.between(localDate, geburtstag); 
		int Jahre2 = p2.getYears();
		int Monate2 = p2.getMonths();
		int Tage2 = p2.getDays();
		int diesermonat = localDate.getMonthValue();
		int nächstesjahr= diesesjahr + 1;
		LocalDate geburtstag2 = LocalDate.of (nächstesjahr, dateutypedin2, dateutypedin3);
		Period p3 = Period.between(localDate, geburtstag2);
		int Jahre3= p3.getYears();
		int Monate3= p3.getMonths();
		int Tage3= p3.getDays();





		if (Monate2 >0 && Tage2 >0) {
			System.out.println ("Your birthday is "+ Monate2 +" months and "+ Tage2 + " days away.");
		}

		else if ( Monate2==0 && Tage2>0) {
			System.out.println ("Your birthday is "+ Tage2 + " days away.");}

		else if (Tage2 ==0 && Monate2 >0) {
			System.out.println("Your birthday is " + Monate2 + " months away.");}


		else if (Tage2 ==0 && Monate2 ==0) {
			System.out.println ("Today is your birthday! :)");}



		else if (dateutypedin2 < diesermonat && Tage3>0) {System.out.println ("Your birthday is " + Monate3 + " months and "+ Tage3 + " days away.");}
		else if (dateutypedin2 < diesermonat && Tage3==0) {System.out.println ("Your birthday is " + Monate3 + " months away.");}
		else if (dateutypedin2 == diesermonat && dateutypedin3 <localdayy  ) {System.out.println ("Your birthday is in " + Monate3 + " months and " + Tage3 + " days away.");
		}
		else { System.out.println ("error");}


	}}


