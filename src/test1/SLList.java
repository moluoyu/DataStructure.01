package test1;

/**
 * Created by Enzo Cotter on 2018/1/22.
 */
public class SLList {
    public  IntNode first;
    public  SLList(int x)
    {
        first = new IntNode(x,null);
    }
    public  static void main(String[] args)
    {
        SLList L = new SLList(10);
    }
    public  void addFirst(int x)
    {
        first = new IntNode(x,first);
    }
    public int  getFirst()
    {
        return  first.item;
    }
    public void addLast(int x)
    {

        IntNode p = first;

        while (null != p.next)
        {
            p =  p.next;

        }
        p.next=  new IntNode(x,null);

    }
}
