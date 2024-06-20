public class QueueDemo
{
    public static void main(String args[])
    {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);
        q.show();
        q.deQueue();
        q.show();
    }
}

public class Queue
{
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public int deQueue()
    {
        int data = queue[front];
        if(!isEmpty())
        {
            //front++
            front = (front+1)%5;
            size--;
        }
        else
        {
            System.out.println("Queue is empty.")
        }
        return data;
    }

    public void enQueue(int data)
    {
        if(!isFull())
        {
            queue[rear] = data;
            //rear++
            rear = (rear+1)%5;
            size++;
        }
        else
        {
            System.out.println("Queue is full");
        }
    }

    public void show()
    {
        for(int i = 0; i<size; i++)
        {
            System.out.print(queue[(front+i)%5]+" ");
        }
    }

    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isFull()
    {
        return size==5;
    }
}