public class MyStringArrayList {
    private String[] array; //container of this array list
    private static final int CAPACITY = 10; // initial capacity of the array
    private int size; // number of elements in the array
    /**
     * This default constructor sets the container capacity to be 10 and size to
     * 0, where container is empty.
     */
    public MyStringArrayList() {
        array = new String[CAPACITY];
        size = 0;
    }//comstructor

    public void addLast(String e) {
        if (isFull()) { // increase capacity if array is full
            String[] temparray = new String[array.length + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                temparray[i] = array[i];
            }//for
            array = temparray; // make temparray the container
        }//if
        array[size] = e; //add element e to last empty location.
        size++; // increment the size of this array list
    }//addLast
    /* This method is only used by this class.
     * returns true if this array list is full, otherwise returns false.
     */
    private boolean isFull() {
        return size == array.length;
    }//Full
    /**
     * requires: none
     * ensures: self.size == #self.size
     * @return current size of this array list
     * returns the current size (# of elements) of this list
     */
    public int getSize() {
        return size;
    }//Size

    
public void addFront(String e) {
      if (isFull()) { 
          String[] tempArray = new String[array.length + CAPACITY];
          for(int i = 0; i < array.length; i++) { 
              
              tempArray[i] = array[i];
              array = tempArray;
              
              for(i = size; i > 0; i--) {
                  array[i] = array[i - 1];
                  System.out.println(array[i]);
                  array[0] = e;
                  size++;
                  
                  
                }
                
            }
        }
    }
            public boolean contains(String e) { 
                boolean ans = false; 
           for(int i = 0; i < size; i++) {
               if(array[i].equals(e)){
                   ans = true;
                   break;
                }
            }
            return ans;
            
        }
        
        public String getElement(int index) { 
            String ans;
            if((index >= 0) && (index < size)) {
                
                ans = array[index];
            }
            else { 
                ans = "no position";
            }
            return ans;
        }
        
                
            
        public String removeElementAt(int a) {
            String ans = "Not an index";
            if (( a >= 0) && (a < size)){
            ans = array[a];
            for(int i = a; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        
    
    }
    return ans;
}
    
    
    public String toString() {
        String ans = "[ ";
        for(int i = 0; i < size; i++) {
            ans = ans + " " + array[i];
        }
        ans = ans + "   ]";
        return ans; 
    }
}
