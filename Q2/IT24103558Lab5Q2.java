import java.util.Scanner;
public class IT24103558Lab5Q2 { 
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.print("Enter the number of new members introduced : ");
int num = input.nextInt();
if (num>=5) {
System.out.print("Prize is a : Headphone");
}
else {
switch (num) {
case 0: System.out.print("No prize");
break;
case 1: System.out.print("Prize is a : pen");
break;
case 2: System.out.print("Prize is a : Umbrella");
break;
case 3: System.out.print("Prize is a : Bag");
break;
case 4: System.out.print("Prize is a : Travelling Chair");
break;
default : System.out.print("Input must be a number 0 or greater");
     }
              }
                                  }
                                         } 