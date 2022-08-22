import java.util.*;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Acc_Holder obj = new Acc_Holder();
		obj.setAcc_HolderName("maheswaran");
		obj.setAcc_Number(12345678);
		System.out.println("WELCOME\t" + obj.name);
		System.out.println("WHAT CAN I HELP YOU");
		String speech = scan.nextLine();

		Bank obj2 = new Bank();
		String conf = "yes";

		System.out.println("IF SAY YES MEASNS I SHOW DETAIL ABOUT SAVING Acc Else SALARY ACCOUNT");
		String detail = scan.nextLine();
		if (detail.equals(conf)) {
			obj2.SavingAccount();

		} else {
			obj2.Salary_Account();
		}
		System.out.println("can you open which Account");
		System.out.println("Say 1 means Saving Acc or say 2 means salary Acc");
		int num = scan.nextInt();
		if (num == 1) {
			obj2.savingAccDoc();
			System.out.println("Successfully open Saving Acc");
		} else if (num == 2) {
			obj2.salaryAccDoc();
			System.out.println("Successfully open Salary Acc");
		}
		System.out.println("Are you show your Acc Holder name & Acc_Number");
		scan.nextLine();
		String confirmation = scan.nextLine();
		if (confirmation.equals(conf)) {
			System.out.println("ACC HOLDER-NAME:" + obj.getAcc_HolderName());
			System.out.println("ACC NUMBER:" + obj.getAcc_Number());
			System.out.println("Thanks for Visiting");

		} else {
			System.out.println("Thanks for Visiting");
		}
	}

}
