class StackCustom
{
    /**
     * Stack is a Data structure that uses the principle of First In Last Out. 
     */
    int size;
    int top;
    char arr[];
    StackCustom(int input)//Initializing
    {
        size=input;
        top=-1;
        arr=new char[size];
    }

    boolean isEmpty()//Checks if the list is empty
    {
        return top==-1;
    }

    boolean isFull()//Checks if the list is full
    {
        return top==(size-1);
    }

    void push(char x)//Adds a number to the stack
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

    char pop() //Removes a number from the stack
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

    char peek()//Returns the top element in the array
    {
        return arr[top];
    }
}