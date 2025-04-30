package Arrays;


public class Arrays_swap {

    public static void main(String[] args) {

        float first = 1.2f, second = 2.2f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

/*first = first - second;
        second = first + second;
        first = second - first;*/
















