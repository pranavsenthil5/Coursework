public class LinkedListCustomMain
{
    /**
     * Linked List is a data structure where objects are connected to each other.In our case it can be connected to 1 or 2 other objects
       
       */
    public static void main(String args[])
    {
        LinkedListCustom list=new LinkedListCustom();
        list.insert(9);
        list.insert(11);
        list.insert(1);
        list.insert(8);
        list.insert(4);
        list.insert(7);
        list.insert(2);
        list.insert(5);
        System.out.println("_______________");
        list.display();
        System.out.println("_______________");
        list.delete(2);
        list.display();
    }
}