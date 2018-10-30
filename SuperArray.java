public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int startingCapacity){
    if (startingCapacity < 0){
      throw new  IllegalArgumentException ("can't be negative");
    }
    data = new String[startingCapacity];
    size = startingCapacity;
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
      throw new IndexOutOfBoundsException("error: index" + n + "out of bounds");
    }else{
    return data[n];
  }
  }

  public String set(int n , String str){
    String old = data[n];
    if(n < 0 || n >= size()){
       throw new IndexOutOfBoundsException("error: index" + n + "out of bounds");
    }
    else{
      data[n] = str;
    }
    return old;
  }

  private void resize(){
    if (data.length == size){
      String[] newdata = new String[ (data.length * 2) + 1];
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
    for(int i = size - 1 ; i > 0 ;i = i - 1){
      if (Target.equals(data[i])){
        return i;
      }
    }
    return -1;
  }

  public void add(int nn , String s){
    if(nn < 0 || nn >= size()){
      throw new IndexOutOfBoundsException("error: index" + nn + "out of bounds");
    }
    resize();
    for (int n = size-1; n >= nn; n = n - 1){
    data[n+1] = data[n];
  }
  data[nn] = s;
  size = size + 1;
  }

  public String remove(int ind ){
    if(ind < 0 || ind >= size()){
      throw new IndexOutOfBoundsException("error: index" + ind + "out of bounds");
    }
    String removed = data[ind];
    for (int n = ind ; n < size - 1; n = n + 1){
    data[n] = data[n + 1];
  }
  data[size - 1] = null;
  size = size - 1;
  return removed;
  }
  public boolean remove(String Target){
    if (this.contains(Target) == false){
      return false;
    } else {
      this.remove(indexOf(Target));
      return true;
    }
  }


}
