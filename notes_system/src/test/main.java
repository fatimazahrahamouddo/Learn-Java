package test;
import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		try {
			System.out.print("ادخل نقطة :");
			String note_before_convert = Input.nextLine(),
			resolution;
			boolean travel =false;
			double note = Double.parseDouble(note_before_convert);
			if(18<note && note<= 20) {
				System.out.println("ممتاز احسنت العمل");
				travel = true;
			}else if(16<note && note<= 18) {
				System.out.println("حسن جدا واصل");
				travel = true;
			}else if(14<note && note<= 16) {
				System.out.println("حسن واصل");
				travel = true;
			}else if(12<note && note<= 14) {
				System.out.println("لا بأس به");
				travel = true;
			}else if(10<=note && note<= 12) {
				System.out.println("متوسط");
				travel = true;
			}else if(0>note | note>20) {
				System.out.println("الاعداد المسموحة بين 0  و 20");
			}else {
				System.out.println("أعد المحاولة مرة أخرى");
				travel = false;
			}
			resolution = (travel == true)?"ستذهب الى الرحلة":"الرحلة غير متاحة";
			System.out.println(resolution);
		}catch(Exception e) {
			System.out.println("من فضلك ادخل رقما");
			
		}
		
	 
	}	
	
}
