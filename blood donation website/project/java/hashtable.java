import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java. util.*;
public class hashtable{
    public static void main(String[] args){
        Hashtable <String> ht= new Hashtable<String>();
        ht.put("1","one");
        ht.put("2","two");
        ht.put("3","three");
        Set st=ht.keySet();
        Iterator itr=st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
