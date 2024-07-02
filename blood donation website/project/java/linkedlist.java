//import java.util.ArrayList;
import java.util.LinkedList;

class linkedlist{
    public static void main(String[]  args){
//linked list me dubly linkedlist ki form me data save hota ha
        LinkedList<String> Name=new LinkedList<String>();
        Name.add("ritik");
        Name.add("rahul");
        Name.add("hemraj");
        System.out.println(Name);
                Name.add("riya");
                        System.out.println(Name);
//begning me dalne k lia
//last me add krne k lia addLast use hoga
                Name.addFirst("chitra");
                        System.out.println(Name);
             //remove krne k lia           
Name.remove(3);
                        System.out.println(Name);
        //change krne k lia
        Name.set(2,"hemraj");
     System.out.println(Name);
     for(String str:Name){
             System.out.println(str);

     }
     //only single element print krne k lia
          System.out.println(Name.get(1));
Name.clear();
     System.out.println(Name);

                   

    }
}