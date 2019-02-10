class StackCustom
{
    int size;
    int top;
    int arr[];
    StackCustom(int input)
    {
        size=input;
        top=-1;
        arr=new int[size];
    }
    
    boolean isEmpty()
    {
        return top==-1;
    }
    
    boolean isFull()
    {
        return top==(size-1);
    }
    
    void push(int x)
    {
        if(!isFull())
        {
            arr[++top]=x;
        }
        else
        {
            System.out.println("Stack Full");
        }
    }
    
    int pop()
    {
        if(!isEmpty())
        {
            return arr[top--];
        }
        else
        {
            System.out.println("Stack Empty");
        }
        return -1;
    }
    
    void peek()
    {
        System.out.println("Top value is "+arr[top]);
    }
}