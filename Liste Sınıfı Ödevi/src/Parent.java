public class Parent {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("----------------- Part 1 -----------------");
        System.out.println("Number of items in the array : " + list.size());
        System.out.println("Array capacity : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of items in the array : " + list.size());
        System.out.println("Array capacity : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Number of items in the array : " + list.size());
        System.out.println("Array capacity : " + list.getCapacity());

        System.out.println("----------------- Part 2 -----------------");
        list = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Value of 2. indice : " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("Value of 2. indice : " + list.get(2));
        System.out.println(list.toString());

        System.out.println("----------------- Part 3 -----------------");
        list = new MyList<>();
        System.out.println("List State : " + (list.isEmpty() ? "Empty" : "Loaded"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List State : " + (list.isEmpty() ? "Empty" : "Loaded"));

        // The first index where given data is found
        System.out.println("Indice : " + list.indexOf(20));

        // If not found, returns -1
        System.out.println("Indice :" + list.indexOf(100));

        // The last index where given data is found
        System.out.println("Indice : " + list.lastIndexOf(20));

        // Returns a list as Object[]
        Object[] objectList = list.toArray();
        System.out.println("First element of object list :" + objectList[0]);

        // Returns a sublist of type MyList
        MyList<Integer> sublist = list.sublist(0, 3);
        System.out.println(sublist.toString());

        // Query for f the given value
        System.out.println("The value of 20 in my list : " + list.contains(20));
        System.out.println("The value of 120 in my list : " + list.contains(120));

        // Clears the list
        list.clear();
        System.out.println(list.toString());

    }

}