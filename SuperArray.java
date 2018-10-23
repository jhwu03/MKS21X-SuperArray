public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }
  public void clear(){
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }
  public boolean add(string s){
    int num = 0;
    if (data[num] == null){
      data[num] = s;
      return true;
    }
    else
    num = num + 1;
    return false;
  }
}
