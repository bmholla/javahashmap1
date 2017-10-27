
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Collection;

class javahashmap1
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("dog");
        ll.add("cat");
        ll.add("ddd");
        ll.add("goo");
        ll.add("act");
        ll.add("god");

        LinkedList<HashMap<Integer,Character>> llm = new LinkedList<HashMap<Integer, Character>>(); 

        for(String s : ll)
        {
            HashMap<Integer,Character> hm = new HashMap<Integer,Character>();
            int i=0;
            for(char c : s.toCharArray())
            {
                hm.put(i,c); 
                i++;
            }
            llm.add(hm);
        }

        for(int i=0;i<llm.size();i++)
            for(int j=i+1;j<llm.size();j++)
            {
                Collection<Character> cc1 = llm.get(i).values();
                Collection<Character> cc2 = llm.get(j).values();
                if(cc1.equals(cc2))
                {
                    System.out.println(ll.get(i));
                    System.out.println(ll.get(j));                   
                    System.out.println("");
                }
            }
                    

        /*
        for(HashMap<Integer, Character> hm : llm)
        {
            Collection<Character> cc = hm.values();

            for(Character c : cc)
                System.out.println(c);
        }
        */

    }
}
