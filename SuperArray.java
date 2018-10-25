public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 10;
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
    if (data[size] == null){
      data[size] = s;
    }
    else{
    size = size + 1;
    add(s);
    }
    return true;
  }
  public String toString(){
    String str = "[";
    for(int i =0;i < size() - 1 ;i++){
    str = str +  data[i] + ",";
    }
    return str + data[size() - 1] + "]";
  }
  public String get(int n){
    if(n < 0 || n >= size()){
      return null;
    }
    return data[n];
  }
  public String toStringDebug(){
    String str = "[";
    for(int i =0;i < data.length - 1 ;i++){
      str = str + data[i] + ",";
    }
    return str + data[data.length] + "]";
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
