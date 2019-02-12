class QueueCustom
{
    int front;
    int rear;
    int arr[];
    QueueCustom(int x)
    {
        front=0;
        rear=0;
        arr= new int [x];
    }
    
    void enqueue(int input)
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
    
    int dequeue()
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