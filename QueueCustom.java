class QueueCustom
/**
 * Queue is a Data structure that uses the principle of First In First Out. 
   */
{
    int front;
    int rear;
    int arr[];
    QueueCustom(int x)//Initializing the variables
    {
        front=0;
        rear=0;
        arr= new int [x];
    }
    
    void enqueue(int input)//Adding a value to the queue
    {
        if(rear==arr.length)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            arr[rear++]=input;
        }
    }
    
    int dequeue()//removing the last value from the queue list
    {
        if(rear==front)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            return arr[front++];
        }
        return -1;
    }
}