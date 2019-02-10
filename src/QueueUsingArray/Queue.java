package QueueUsingArray;
import java.util.*;

public class Queue {

    private int rare;
    private int front;
    private int[] queue;
    private int total;

    public Queue(int rare, int front, int[] queue) {
        this.rare = rare;
        this.front = front;
        this.queue = queue;
        total = 0;
    }

    public void insert(int element)
    {
        if(rare!=queue.length-1)
        {
            total++;
            queue[rare]=element;
            rare++;
        }
        else
            System.out.println("queue is full");
    }

    public void  delete()
    {
        if(total==0)
        {
            System.out.println("queue is empty");
        }
        else
        {
            total--;
            front++;
        }
    }
    public boolean search(int element)
    {   boolean re=false;
      for(int i=0;i<total;i++)
      {
          if(queue[i]==element)
              re=true;
      }
      return re;
    }
    public void dispaly(){
        for(int i=front;i<rare;i++)
        {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        int size=5;
        int front=0;
        int rare=0;
        int[] queue=new int[size];
        Queue myqueue=new Queue(rare,front,queue);
        Scanner s=new Scanner(System.in);
        System.out.println("enter the element in queue");
        myqueue.insert(s.nextInt());
        myqueue.dispaly();
        myqueue.insert(s.nextInt());
        myqueue.dispaly();
        myqueue.insert(s.nextInt());
        myqueue.dispaly();
        System.out.println("enter the element to search");
        System.out.println(myqueue.search(s.nextInt()));
        System.out.println("dequeue start");
        myqueue.delete();
        myqueue.dispaly();
        myqueue.delete();
        myqueue.dispaly();

    }
}
