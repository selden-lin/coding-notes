public class Queue<T> {
  private T queue[];
  private int limit = 50, currSize = 0, front = 0, back = 0;
  public Queue(int size) {
    this.queue = new T[size];
    this.limit = size;
  }
  public Queue() {
    this.queue = new T[50];
  }
  public <T> dequeue() {
    if(this.currSize == 0) {
      System.out.println("Error: cannot remove anymore elements");
      throw new Exception("Cannot remove from empty stack");
    } 
    currSize -= 1;
    <T> temp = this.queue[this.front];
    this.front = (this.front - 1) % this.limit;
    return temp;
  }
  
  public void queue(<T> item) {
    if(this.currSize == limit) {
      System.out.println("Error: stack is full");
      throw new Exception("Cannot add items to full stack");
    }
    currSize += 1;
    this.back = (this.back + 1) % this.limit;
    this.queue[back] = item;
  }
  
  public <T> peek() {
    if(this.currSize == 0) {
      return null;  
    } else {
      return this.queue[this.front];
    }
  }
}
