public class Main {
    public static void main(String[] args) {
        // 1
        Algorithms a = new Algorithms();
        System.out.println(a.secondStringInFirst("Hello World", "World"));
        System.out.println(a.secondStringInFirst("Quincy", "Holmer"));
        System.out.println(a.secondStringInFirst("Hagoo", "goo"));
        // 2
        System.out.println(a.reversedString("gohangasalami"));
        System.out.println(a.reversedString("hagoo"));
        System.out.println(a.reversedString("holmer"));
        // 3
        System.out.println(a.palindromeOrNot("amanaplanacanalpanama"));
        System.out.println(a.palindromeOrNot("hagoohagoo"));
        System.out.println(a.palindromeOrNot("wowowowowowowow"));
        // 4
        System.out.println(a.numberOfOccurrences("Mississippi", "si"));
        System.out.println(a.numberOfOccurrences("hagoo","goo"));
        System.out.println(a.numberOfOccurrences("holmer", "h"));




    }
}
