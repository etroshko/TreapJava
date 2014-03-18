
public class TreapNode
{
    TreapNode left, right;
    int priority, key;
    public TreapNode(int key, int priority)
    {
        this.key = key;
        this.priority = priority;
    }
}

class Pair
{
    TreapNode left, right;
    Pair(TreapNode left, TreapNode right)
    {
        this.left = left;
        this.right = right;
    }
}