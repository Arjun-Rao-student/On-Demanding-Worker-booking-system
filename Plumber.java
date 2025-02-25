import java.util.Scanner;

public class Plumber {
	Scanner sc = new Scanner(System.in);
	static int x = 0;
	static int z = 0;

	void plumberlist() {
		System.out.println("1.      Deepak      500 per hour");
		System.out.println("2.      Rohan       600 per hour");
		System.out.println("3.      Exit");
	}

	void plumber() {
		System.out.println(
				"                           " + Main.BLACK + Main.BLUE_BACKGROUND + "List of Plumbers" + Main.def);
		plumberlist();
		int a = sc.nextInt();
		switch (a) {
		case 1:
			if (x == 0) {
				System.out.println(Main.BLACK + Main.BROWN_BACKGROUND + "You Selected Deepak" + Main.def);
				System.out.println(
						Main.BLACK + Main.LIGHT_BLUE_BACKGROUND + "Deepak will charge 500 per hour" + Main.def);
				System.out.println("If you want to book him press 1 to go back press 2");
				int b = sc.nextInt();
				if (b == 1) {
					System.out.println(Main.BLACK + Main.BLUE_BACKGROUND + "You are Booking Deepak" + Main.def);
					System.out.println("               " + Main.RED + "PAYMENT" + Main.def);
					Payment obj2 = new Payment();
					double c = obj2.paybill(500);
					System.out.println(Main.GREEN + "You have to pay minimum amount : " + c + "/-" + Main.def);
					System.out.println("For payment section press 1 or to go back press 2");
					int d = sc.nextInt();
					if (d == 1) {
						if (obj2.billpayment(c) == true) {
							x++;
							Loading.load();
							System.out.println(Main.BLACK + Main.GREEN_BACKGROUND + Main.blink
									+ "You Sucessfully Booked Deepak" + Main.def);
							System.out.println();
							System.out.println(Main.LIGHT_PINK + "His Contact Details are : " + Main.def);
							System.out.println(Main.ORANGE + "Name            :  DEEPAK");
							System.out.println("Mobile Number   :  7846468362");
							System.out.println("Address         :  123, ABC STREET");
							System.out.println("Email           :  deepak@gmail.com" + Main.def);
							System.out.println("You have Successfully Booked a Plumber");
							System.out.println("We hope you will satisfy with DEEPAK work Thank You!!");
							System.out.println(Main.BLACK + Main.BROWN_BACKGROUND
									+ "To go back press 1 or to directly exit press 2" + Main.def);
							int v = sc.nextInt();
							if (v == 1) {
								System.out.println("Going back to Plumber List");
								plumber();
								break;
							} else {
								break;
							}
						} else {
							plumber();
							break;
						}
					} else {
						System.out.println("Going back to Plumber List");
						plumber();
						break;
					}

				} else {
					System.out.println("Going back to Plumber List");
					plumber();
					break;
				}
			} else {
				System.out.println(Main.BLACK + Main.RED_BACKGROUND
						+ "Deepak is already booked so plz try to book others" + Main.def);
				System.out.println("To go back press 1");
				int v = sc.nextInt();
				if (v == 1) {
					System.out.println("Going back to Plumber List");
					plumber();
					break;
				}
			}
			break;
		case 2:
			if (z == 0) {
				System.out.println(Main.BLACK + Main.BROWN_BACKGROUND + "You Selected Rohan" + Main.def);
				System.out
						.println(Main.BLACK + Main.LIGHT_BLUE_BACKGROUND + "Rohan will charge 600 per hour" + Main.def);
				System.out.println("For payment Section press 1 to go back press 2");
				int c = sc.nextInt();
				if (c == 1) {
					System.out.println(Main.BLACK + Main.BLUE_BACKGROUND + "You are Booking Rohan" + Main.def);
					System.out.println("               " + Main.RED + "PAYMENT" + Main.def);
					Payment obj2 = new Payment();
					double d = obj2.paybill(600);
					System.out.println(Main.GREEN + "You have to pay minimum amount : " + d + "/-" + Main.def);
					System.out.println("To pay the minimum amount press 1 or to go back press 2");
					int e = sc.nextInt();
					if (e == 1) {
						if (obj2.billpayment(d) == true) {
							z++;
							Loading.load();
							System.out.println(Main.BLACK + Main.GREEN_BACKGROUND + Main.blink
									+ "You Sucessfully Booked Rohan" + Main.def);
							System.out.println();
							System.out.println(Main.LIGHT_PINK + "His Contact Details are : " + Main.def);
							System.out.println(Main.ORANGE + "Name            :  ROHAN");
							System.out.println("Mobile Number   :  7846468362");
							System.out.println("Address         :  123, ABC STREET");
							System.out.println("Email           :  rohan@gmail.com" + Main.def);
							System.out.println("You have Successfully Booked a Plumber");
							System.out.println("We hope you will satisfy with ROHAN work Thank You!!");
							System.out.println(Main.BLACK + Main.BROWN_BACKGROUND
									+ "To go back press 1 or to directly exit press 2" + Main.def);
							int v = sc.nextInt();
							if (v == 1) {
								System.out.println("Going back to Plumber List");
								plumber();
								break;
							} else {
								break;
							}
						} else {
							plumber();
							break;
						}
					} else {
						System.out.println("Going back to Plumber List");
						plumber();
						break;
					}

				} else {
					System.out.println("Going back to Plumber List");
					plumber();
					break;
				}
			} else {
				System.out.println(Main.BLACK + Main.RED_BACKGROUND
						+ "Rohan is already booked so plz try to book others" + Main.def);
				System.out.println("To go back press 1");
				int v = sc.nextInt();
				if (v == 1) {
					System.out.println("Going back to Plumber List");
					plumber();
					break;
				}
			}
			break;
		case 3:
			System.out.println("Going Back To Workers List");
			Worker obj = new Worker();
			obj.TypeOfWorker();
			break;
		}
	}

}
