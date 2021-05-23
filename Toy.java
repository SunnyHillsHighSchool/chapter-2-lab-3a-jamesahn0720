//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Toy {
   private int count;
   private String name;
    public Toy(String n)
  {
    name = n;
    count = 1;
  }

  public int getCount() {
     return count;
  }
  public String getName() {
     return name;
  }

  public void setCount(int c) {
     count = c;
  }

  public String toString()
  {
    return name + " " + count;
  }

  
}
