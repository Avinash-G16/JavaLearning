public class StackDemo
{
    public static void main(String args[])
    {
        Stack nums = new Stack();
        nums.push(15);
        nums.push(20);
        System.out.println(nums.peek());
        nums.push(8);
        int popvalue = nums.pop();
        System.out.println(popvalue);
        System.out.println(nums.size());
        nums.show();
    }
}

class DStack
{
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;
    public boolean isEmpty()
    {
        return top<=0;
    }
    public int size()
    {
        return top;
    }
    public int pop()
    {
        int data = 0;
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }
    private void shrink()
    {
        int length = size();
        if(length<=(capacity/2)/2)
            capacity = capacity/2;
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }
    public int peek()
    {
        int data;
        data = stack[top-1];
        stack[top] = 0;
        return data;
    }
    public void push(int data)
    {
        if(size()==capacity)
        expand();
        stack[top] = data;
        top++;
    }
    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n+" ");
        }
    }
    private void expand()
    {
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
    }
}

class Stack
{
    int[] stack = new int[5];
    int top = 0;
    public boolean isEmpty()
    {
        return top<=0;
    }
    public int size()
    {
        return top;
    }
    public int pop()
    {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }
    public int peek()
    {
        int data;
        data = stack[top-1];
        stack[top] = 0;
        return data;
    }
    public void push(int data)
    {
        if(top==4)
        {
            System.out.println("Stack is full");
        }
        else
        {
            stack[top] = data;
            top++;
        }
    }
    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n+" ");
        }
    }
}