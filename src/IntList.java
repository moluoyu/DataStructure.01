/**
 * Created by luoyu on 2018/1/20.
 */
public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public  int get (int i)
    {
        if(i == 0) {
            return first;
        }
        return rest.get(i - 1);

    }
//    public int size() {
//        int temp = 1;
//        IntList l = this;
//        while ((l = l.rest) != null) {
//            ++temp;
//        }
//        return temp;
//    }

    /*return the size of the list using recursion! */
    public int size2() {
        if (rest == null)
            return 1;
        else {
            return 1 + this.rest.size2();
        }
    }

    public static void main(String[] args) {
        IntList l = new IntList(15, null);
        l = new IntList(10, l);
        l = new IntList(5, l);
       // int x = l.size();
        int y = l.size2();

        System.out.println(y);
        System.out.println(l.get(2));
    }


}

