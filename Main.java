/**
 * ----------PROGRAM FOR DYNAMIC ARRAY-------------------
 *
 * add(int x)-> add elements in array.
 *
 * remove() -> remove last element in array, and it returns element removed from array.
 *
 * Size() -> returns number of elements present in array.
 *
 * toString() -> for print elements in array in string form.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(6);

        arrayList.remove();

        arrayList.toString();
    }
}
