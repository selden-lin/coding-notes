public class Stack {
  private Object stackArr[];
  private int currPos = ;
  
  public Stack() {
    this.stackArr = new Object[50];
  }
  public Stack(int size) {
    this.stackArr = new Object[size];
  }
  
  public void push(Object item) {
    if(currPos == this.stackArr.length-1) {
      System.out.println("Error: stack is full");
    } else {
      this.stackArr[currPos++] = item;
    }
  }
  
  public Object pop() {
    if(this.currPos == 0) {
      System.out.println("Error: stack is empty");
    } else {
      return this.stackArr[--currPos];
    }
  }
  
  public int size() {
    return this.currPos;
  }
  
  public Object peek() {
    if(this.currPos == 0) {
      System.out.println("Error: stack is empty");
    } else {
      return this.stackArr[this.currPos - 1];
    }
  }
}
