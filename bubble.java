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
      if(isEmpty())
      {
        last = new Node(data);
        first = last;
      }
      
      else
      {
        last.next = new Node(data, null);
        last = last.next;
      }
    }
    
    public void traverse()
    {
      Node printNode = first;
      
      while(printNode != null)
      {
        System.out.println(printNode.value);
        printNode = printNode.next;
      }
    }
    
    public void addRandom(int randomNode)
    {
      int min = 0;
      int max = 50;
      
      for(int i = 0; i < randomNode; i++)
      {
        int randomX = min + (int)(Math.random() * max);
        Node newNode = new Node(randomX); 
        
        if(isEmpty())
        {
          
          this.first = newNode;
          this.last = newNode;
          
        }
        
        else
        {
          newNode.next = first;
          this.first = newNode;
        }
      }
    }
    
    public void Sort()
    {
      Node now; 
      
      if(isEmpty())
      {
        System.out.println("List is empty.");
      }
      
      else if(first.getNext() == null)
      {
        System.out.println("There's one node in the list");
      }
      
      else     
      {
        now = first;
        
        boolean change = true;
        
        while(change)
        {
          change = false;
          
          while(now != null)
          {
            if(now.getNext() != null && now.getValue() > now.getNext().getValue())
            {
              int temp = now.getValue();
              now.setValue(now.getNext().getValue());
              now.getNext().setValue(temp);
              change = true;
            }
            now = now.getNext();
          }
          
          now = first;
        }
      }
    }
    
    
      
      
    public static void main(String[] args)
    {
    }
  }
  