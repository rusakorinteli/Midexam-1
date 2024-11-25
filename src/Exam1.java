public class Exam1 {

    static void method1(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }

    static void compareMethod(int a, int b){
        if (a == b) {
            System.out.println(a + " და " + b + " ტოლია");
        } else {
            System.out.println(a + " და " + b + " არ არის ტოლი");
        }
    }

    static void arrayMethod(){
        String[] cityArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"};
        for (int i = 0; i < cityArray.length; i++) {
            System.out.println(cityArray[i]);
        }
    }

    static void modeMethod(){
        int[] myArray = {0, 7, 7, 2, 7, 3, 5};

        int mode = myArray[0];
        int maxCount = 0;

        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = myArray[i];
            }
        }
        System.out.println("მოდა არის: " + mode);
    }

    public static void main(String[] args){

        // დაბეჭდეთ “Hello World” 10-ჯერ ციკლის გამოყენებით

        method1();

        // დაწერეთ მეთოდი რომელიც იქნება მრავალჯერ გამოყენებადი, მეთოდმა უნდა შეადაროს ტოლია თუ არა გადაცემული მნიშვნელობები. მეთოდი გამოიძახეთ მეინ მეთოდში სამჯერ შემდეგი მნიშვნელობებით:  1. 5 და 3 ,  2. 2 და 2 ,   3. 14 და 41

        compareMethod(5, 3);
        compareMethod(2,2);
        compareMethod(14,41);

        //cityArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"} ციკლის გამოყენებით დაბეჭდეთ მოცემული მასივის თითოეული ელემენტი.

        arrayMethod();

        // myArray = {0, 7, 7, 2, 7, 3, 5} იპოვეთ მოცემული მასივის მოდაHint: მოდა არის მონაცემი რომელიც ყველაზე ხშირად გვხვდება მასივში( თუ 2 ყველაზე ხშირად არსებული ელემენტი ერთიდაიგივე რაოდენობის არის შეგიძლიათ მაგას არ მიაქციოთ ყურადღება)

        modeMethod();



    }
}
