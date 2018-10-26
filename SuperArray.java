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
    resize();
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
    for(int i =0;i < data.length ;i++){
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

  private void resize(){
    if (data.length == size){
      String[] newdata = new String[data.length * 2];
    for(int i =0; i < data.length ;i++){
      newdata[i] = data[i];
    }
    data = newdata;
    }
 }

 public boolean contains(String Target){
   for(int i =0; i < data.length ;i++){
     if (Target.equals(data[i])){
       return true;
     }
   }
   return false;
 }

public int indexOf(String Target){
  for(int i =0; i < data.length ;i++){
    if (Target.equals(data[i])){
      return i;
    }
  }
  return -1;
}
  public int lastIndexOf(String Target){
    for(int i = data.length - 1 ; i > 0 ;i = i - 1){
      if (Target.equals(data[i])){
        return i;
      }
    }
    return -1;
  }



}
