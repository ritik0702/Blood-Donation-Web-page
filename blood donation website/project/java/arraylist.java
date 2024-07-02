import java.util.ArrayList;
class arraylist{
    public static void main(String[]  args){

        ArrayList<String> Name=new ArrayList<String>();
        Name.add("ritik");
        Name.add("rahul");
        Name.add("hemraj");
        System.out.println(Name);
                Name.add("riya");
                        System.out.println(Name);
//ritik ke bad chitra print krna h to index dal do phla
                Name.add(1,"chitra");
                        System.out.println(Name);
             //remove krne k lia           
Name.remove(3);
                        System.out.println(Name);
        //change krne k lia
        Name.set(2,"hemraj");
     System.out.println(Name);
     //only single element print krne k lia
          System.out.println(Name.get(1));
Name.clear();
     System.out.println(Name);

                   

    }
}