public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
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
  public boolean add(String s){
    data[size] = s;
    size = size + 1;
    return true;
  }

  public String toString(){
    String str = "[";
    for(int i =0;i < size ;i++){
      if ( i == size - 1){
        str = str + data[i];
      }
      else{
        str = str + data[i] + ",";
      }
    }
      return str + "]";
  }
  public String toStringDebug(){
    String str = "[";
    for(int i =0;i < data.length - 1 ;i++){
      if ( i == size - 1){
        str = str + data[i];
      }
      else{
        str = str + data[i] + ",";
      }
    }
    return str + "]";
  }

  public String get(int n){
    if(n < 0 || n >= size()){
      return null;
    }
    return data[n];
  }

  public String set(int n , String str){
    String old = data[n];
    if(n < 0 || n >= size()){
      return null;
    }
    else{
      data[n] = str;
    }
    return old;
  }


}
