import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" به برنامه دفتر چه تلفن خوش آمدید لطفا نام خود را وارد کنید: ");
//    String name = scanner.nextLine();
    final int CAPACITY = 100;
      String[] firstNames = new String[CAPACITY];
      String[] lastNames = new String[CAPACITY];
      String[] phones = new String[CAPACITY];
//     firstNames = System.out.println("درود " + name  + " نام شما اضافه شد ");
    int count = 0;
    // read one contact, field by field
    System.out.print("Vorname (نام): ");
    firstNames[count] = scanner.nextLine();

    System.out.print("Nachname (نام خانوادگی): ");
    lastNames[count] = scanner.nextLine();

    System.out.print("Telefon (شماره تلفن): ");
    phones[count] = scanner.nextLine();

    count++;
    System.out.println("ذخیره شد: " + firstNames[0] + " " + lastNames[0] + " - " + phones[0]);
    System.out.println("تعداد مخاطبین: " + count);
}