import java.util.Scanner;

//public class  Main { در Java 25 نیازی به تعریف class نیست!
//    static void main(String[] args) {
    void main (){
//        Scanner scanner = new Scanner(System.in);// استفاده از var برای کوتاه شدن کد
        var scanner = new Scanner(System.in);
        System.out.println("Application started");
        System.out.println("............");
        System.out.println("Please enter your name : ");
//        String userInput = scanner.nextLine();// جاوا خودش تشخیص می‌دهد userInput از نوع String است
        var userInput = scanner.nextLine();
        System.out.println("Hallo" +" " + userInput);
//        scanner.close();//قتی برنامه کلاً تمام می‌شود، سیستم خودش منابع را آزاد می‌کند، هرچند بستن آن کار تمیزی است اما برای کدهای کوچک ضروری نیست.
        var scanner2 = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        // متد nextInt مخصوص گرفتن اعداد صحیح است
        var age = scanner2.nextInt();

        System.out.println("You are " + age + " years old.");
    }
        void main2() {

        }
