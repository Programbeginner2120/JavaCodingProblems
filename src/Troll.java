// https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java

public class Troll {
    public static String disemvowel(String str) {

        return str.replaceAll("[aeiouAEIOU]", "");
    }


    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!")); // "Ths wbst s fr lsrs LL!"
        System.out.println(Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        // "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd"
        System.out.println(Troll.disemvowel("What are you, a communist?")); // "Wht r y,  cmmnst?"
    }
}