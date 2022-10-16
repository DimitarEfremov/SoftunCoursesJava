package Advanced.Generics.Excersise.CustomList;

public class SorterCL {

    public static <T extends Comparable<T>> void sort(CustomList<T> cList){

        for (int i = 0; i < cList.size(); i++) {
            T currentElement = cList.get(i);
            for (int j = i +1; j < cList.size() ; j++) {
                if (currentElement.compareTo(cList.get(j)) > 0){
                    cList.swap(i,j);
                }
            }
        }
    }
}
