import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int c=0;
    for(int i=0;i<myList.size();i++){
      if (myList.get(i).length()==len){
        c++;
      }
    } 
    return c;
    
  }

  public void removeWordsOfLength(int len)
  {
    for (int j=myList.size();i>=0;i--){
      if (myList.get(i).length()==len) myList.remove(i);
    }
  }
}
