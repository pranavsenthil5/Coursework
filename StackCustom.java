class StackCustom
{
    int size;
    int top;
    char arr[];
    StackCustom(int input)
    {
        size=input;
        top=-1;
        arr=new char[size];
    }
    
    boolean isEmpty()
    {
        return top==-1;
    }
    
    boolean isFull()
    {
        return top==(size-1);
    }
    
    void push(char x)
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
    
    char pop()
    {
        if(!isEmpty())
        {
            return arr[top--];
        }
        else
        {
            System.out.println("Stack Empty");
        }
        return 'E';
    }
    
    char peek()
    {
        return arr[top];
    }
}