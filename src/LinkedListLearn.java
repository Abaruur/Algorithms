import java.util.LinkedList;

    public class LinkedListLearn {



        public static void main(String[] args) {
            LinkedList<String> listy = new LinkedList<>();
            //The linkedList type is generic and it can
            // hold many different types of data, including
            // custom object data. In our case above we're
            // using "STRING" data tpe

            // Let's data to the linkedList
            listy.add("Sally");
            listy.add("Becky");
            listy.add("Nick");
            listy.add("Rachel");

            System.out.println(listy.contains("Becky"));
            System.out.println(listy.size());

            listy.removeFirst();

            // to print out the content of a list, we can use a for
            // for each loop
//        for (String item: listy ) // For each item in the list
//        {
//            // Print out
//            System.out.print(item + "->");
//        }
            // Another option is to use the forEach method
            listy.forEach(x -> System.out.print(x + "->")); // forEach item in
            // the list,
            // we'll print it out.


        }

    }


