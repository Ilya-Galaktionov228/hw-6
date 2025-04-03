public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    for (int i = 1; i < 10; i++) {
        System.out.println("Число " + i);
    }
        for (int a = 9; a >= 1; a--) {
            System.out.println("Число " + a);
        }
        for (int b = 0; b < 17; b+= 2) {
            System.out.println("Четные " + b);
        }
        for (int c = 10; c>=-10; c--) {
            System.out.println("Числа от большего к меньшему " + c);
        }
        for (int d = 1904; d<=2096; d+=4) {
            System.out.println(d +" год является високосным");
        }
        for (int e = 7; e<=98; e+=7) {
            System.out.println(e +" следующее число");
        }
        for (int f = 1; f<=512; f*=2) {
            System.out.println(f +" число после умножения");
        }
        int monthlySavings =29000;
        double total = 0;
        for (int month =1; month<=12; month ++){
            total = total * 1.01;
            total += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        int numberTwo = 2;
        int answer = 0;
        for (int oneNumber = 1; oneNumber<=10; oneNumber+=1) {
            oneNumber = oneNumber * 1;
            answer = oneNumber * numberTwo;
            System.out.println(numberTwo +"*" + oneNumber +"=" + answer);
        }



    }
}
