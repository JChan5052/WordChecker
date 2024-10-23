import java.util.ArrayList;
public class Main
{ 
    public static void main(String[] args)
{
    ArrayList<String> worda = new ArrayList<String>();
    WordChecker a = new WordChecker(worda);
    worda.add("an");
    worda.add("band");
    worda.add("band");
    worda.add("abandon");
    System.out.println(worda);
    System.out.println(a.isWordChain());
    System.out.println("");

    ArrayList<String> wordb = new ArrayList<String>();
    WordChecker b = new WordChecker(wordb);
    wordb.add("to");
    wordb.add("too");
    wordb.add("stool");
    wordb.add("tools");
    System.out.println(wordb);
    System.out.println(b.isWordChain());
    System.out.println("");
  
    ArrayList<String> wordc = new ArrayList<String>();
    WordChecker c = new WordChecker(wordc);
    wordc.add("catch");
    wordc.add("bobcat");
    wordc.add("catchacat");
    wordc.add("cat");
    wordc.add("at");
    System.out.println(wordc);
    System.out.println(c.createList("cat"));
    System.out.println(c.createList("catch"));
    System.out.println(c.createList("dog"));
    System.out.println("");
}
}