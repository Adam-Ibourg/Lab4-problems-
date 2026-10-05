package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int numElements; // number of elements in the list
    int size; // size of the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.size = size;
        numElements = 0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        numElements = size;
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
//Increase the size of the list
//-------------------------------------------------------
    public void increaseSize(){
        int[] newList = new int[size * 2];
        for (int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        list = newList;
        size *= 2;
    }
    //-------------------------------------------------------
//add an element to the list
//-------------------------------------------------------
    public void addElement(int newVal){
        if (numElements == size) increaseSize();
        list[numElements] = newVal;
        numElements++;
    }
    //-------------------------------------------------------
//remove a value's first occurrence from the list
//-------------------------------------------------------
    public void removeFirst(int newVal){
        for (int i = 0; i < numElements; i++){
            if (list[i] == newVal){
                for (int j = i; j < numElements-1; j++){
                    list[j] = list[j+1];
                }
                list[numElements-1] = 0;
                numElements--;
                break;
            }
        }
    }
    //-------------------------------------------------------
//remove all the occurrences of a value in the list
//-------------------------------------------------------
    public void removeAll(int newVal){
        for (int i = 0; i < numElements; i++){
            if (list[i] == newVal){
                for (int j = i; j < numElements-1; j++){
                    list[j] = list[j+1];
                }
                list[numElements-1] = 0;
                numElements--;
            }
        }
    }
}