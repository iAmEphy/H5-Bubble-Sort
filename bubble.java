public class bubble
{
  private class Node
  {
    int value;
    Node next;
    
    
    public Node()
    {
      value = 0;
      next = null;
    }
    
    
    public Node(int value)
    {
      this.value = value;
      next = null;
    }
    
    public Node(int value, Node next)
    {
      this.value = value;
      this.next = next;
    }
    
    public int getValue()
    {
      return this.value;
    }
    
    public void setValue(int value)
    {
      this.value = value;
    }
    
    public Node getNext()
    {
      return this.next;
    }
    
    public void setNext(Node next)
    {
      this.next = next;
    }
  }
    
    private Node first;
    private Node last;
    
    public bubble()
    {
      first = null;
      last = null;
    }
    
    public Node getFirst()
    {
      return this.first;
    }
    
    public void setFirst(Node first)
    {
      this.first = first;
    }
    
    public Node getLast()
    {
      return this.last;
    }
    
    public void setLast(Node last)
    {
      this.last = last;
    }
    
    public boolean isEmpty()
    {
      return first == null;
    }
    
    public int size()
    {
      int count = 0;
      Node countNode = first;
      
      while(countNode != null)
      {
        count++;
        countNode = countNode.next;
      }
      return count;
      
    }
    
    public void add(int data)
    {
    }
    
    public static void main(String[] args)
    {
    }
  }
  