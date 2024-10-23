import java.util.ArrayList;
public class WordChecker {
  private ArrayList<String> wordList;
  public boolean isWordChain() 
 {
    int checkint=1;
    for (int i=1;i<wordList.size();i++)
    {
     String checking = wordList.get(i);
     String prevcheck = wordList.get(i-1);
     int lengthprev = prevcheck.length();
     for (int j=0;j<checking.length()-1;j++)
     {
   
      if (lengthprev+j<=checking.length()){
      if (checking.substring(j,lengthprev+j).equals(prevcheck))
      {
        
      checkint++;
      j=checking.length()-1;
      }

    }
     }
    }
     if (checkint==wordList.size())
     {
      return true;
     }
     else
     {
      return false;
     }
    
}

public ArrayList<String> createList(String target) 
{
ArrayList<String> added = new ArrayList<String>();
int lengthcheck=target.length();
String replacer;
for (int i=0;i<wordList.size();i++)
{
  String checking=wordList.get(i);
  if (checking.length()>=lengthcheck)
  {
    if (target.equals(checking.substring(0,lengthcheck)))
    {
     replacer=checking.substring(lengthcheck);
     added.add(replacer);
    }
  }
}
return added;
}

public WordChecker (ArrayList<String> list)
{
 wordList=list;
}

	
}