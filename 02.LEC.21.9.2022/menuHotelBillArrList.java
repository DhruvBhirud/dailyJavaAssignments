import java.util.*;
//Done using ArrayList
//WAP to Create a menu to take order from user and give the total bill in the end.

public class menuHotelBillArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu_item,menu1=0,menu2=0,menu3=0;
		char ans;
		int sum = 0;
		ArrayList<String> starter = new ArrayList<String>();
		ArrayList<String> maindish = new ArrayList<String>();
		ArrayList<String> dessert = new ArrayList<String>();
		ArrayList<Integer> sprice = new ArrayList<Integer>();
		ArrayList<Integer> mprice = new ArrayList<Integer>();
		ArrayList<Integer> dprice = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu:\n:1. Starters \n:2. Main course \n:3. Desserts");
			menu_item=sc.nextInt();
			switch (menu_item) {
			case 1:
				System.out.println("1:Masala Papad \t\t 120Rs");
				System.out.println("2:Paneer Tikka \t\t 359Rs");
				System.out.println("3:Aloo Ke Pakode \t 229Rs");
				menu1=sc.nextInt();
				switch (menu1) {
				case 1:
					System.out.println("Masala Papad \t\t 120Rs");
					starter.add("Masala Papad 120Rs");
					sprice.add(120);
					
					break;
				case 2:
					System.out.println("Paneer Tikka \t\t 359Rs");
					starter.add("Paneer Tikka 359Rs");
					sprice.add(359);
					
					break;
				case 3:
					System.out.println("Aloo Ke Pakode \t 229Rs");
					starter.add("Aloo Ke Pakode 229Rs");
					sprice.add(229);
					
					break;

				default:
					System.out.println("Please Enter Valid Option");
					break;
				}
				break;
			case 2:
				System.out.println("1:Paneer Makhni \t\t 349Rs");
				System.out.println("2:Rajma Masala \t\t\t 319Rs");
				System.out.println("3:Punjabi Tawa Veg \t\t 339Rs");
				menu2=sc.nextInt();
				switch (menu2) {
				case 1:
					System.out.println("Paneer Makhni \t\t 349Rs");
					maindish.add("Paneer Makhni 349Rs");
					mprice.add(349);
					
					break;
				case 2:
					System.out.println("Rajma Masala \t\t\t 319Rs");
					maindish.add("Rajma Masala 319Rs");
					mprice.add(319);
					
					break;
				case 3:
					System.out.println("Punjabi Tawa Veg \t\t 339Rs");
					maindish.add("Punjabi Tawa Veg 339Rs");
					mprice.add(339);
					
					break;

				default:
					System.out.println("Please Enter Valid Option");
					break;
				}
				
				break;
			case 3:
				System.out.println("1:Ice Cream \t\t 100Rs");
				System.out.println("2:Custard \t\t 200Rs");
				System.out.println("3:Cheese Cake \t\t 200Rs");
				menu3=sc.nextInt();
				switch (menu3) {
				case 1:
					System.out.println("Ice Cream \t\t 100Rs");
					dessert.add("Ice Cream 120Rs");
					dprice.add(120);
					
					break;
				case 2:
					System.out.println("Custard \t\t 200Rs");
					dessert.add("Custard 200Rs");
					dprice.add(200);
					
					break;
				case 3:
					System.out.println("Cheese Cake \t\t 200Rs");
					dessert.add("Cheese Cake 200Rs");
					dprice.add(200);
					
					break;

				default:
					System.out.println("Please Enter Valid Option");
					break;
				}
				
				break;

			default:
				break;
			}
			System.out.println("Would you like to order more? y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y' || ans=='y');
		System.out.println("Thanks for coming");
		//System.out.println(""+menu1);
		//System.out.println(""+menu2);
		//System.out.println(""+menu3);
		total.addAll(sprice);
		total.addAll(mprice);
		total.addAll(dprice);
		for (int i=0;i<total.size();i++) {
			sum += total.get(i);
		}
		System.out.println("Your Starter Dish");
		System.out.println(starter);
		System.out.println("Your Main Dish");
		System.out.println(maindish);
		System.out.println("Your Dessert Dish");
		System.out.println(dessert);
		//System.out.println(sprice);
		//System.out.println(mprice);
		//System.out.println(dprice);
		System.out.println("Your Total Bill is : "+sum);

	}

}
