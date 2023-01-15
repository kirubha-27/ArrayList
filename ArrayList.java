public class ArrayList {
    private int[] arr;
    private int[] temp;
    private int size;
    public int Size(){
        return size;
    }
    ArrayList(){
        arr = new int[5];
        size=0;
    }
    ArrayList(int n){
        arr = new int[n];
        size=0;
    }
    public void expandArray(){
        temp = new int[arr.length*2];

        for(int i=0;i<size;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    public void shrinkArray(){
        temp = new int[arr.length/2];
        for(int i=0;i<size;i++){
            temp[i]=arr[i];
        }
        arr = temp;
    }
    public void add(int x){
        if(size==arr.length/2){

            expandArray();
        }

        arr[size++] = x;
    }
    public int remove(){
        try {
            int x = arr[--size];
            if (size < arr.length / 2 && arr.length > 5) {
                shrinkArray();
            }
            arr[size] = 0;
            return x;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is no element in array!!!");
        }
        return -1;
    }

    @Override
    public String toString() {
        if(size<=0){
            System.out.println("[]");
            return "";
        }
        System.out.print("[");
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[size-1]+"]");
        return "";
    }
}
