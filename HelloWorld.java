import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    private List<Integer> testList = new ArrayList<>();

    private void listFunctions(){
        //  .thenComparing(list ->
        //                    list.stream().map(Enum::name).sorted().collect(Collectors.joining(",")));

    }

    // private static Comparator<List<EPermission>> listEPermissionComparator = Comparator
    //        .comparingInt((List<EPermission> permissions) -> permissions.size())
    //        .thenComparing((list1, list2) -> list1.containsAll(list2) ? 0 : 1);

    public void populateList(){
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        hw.populateList();

    }



}


/*
* learn about class-object structure
* create packages, classes, objects
* implement basic OOP concepts
* use data structures like ArrayList etc
* */