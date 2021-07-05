package untitled.src;

public class Main {


    public static void main(String... args) {


        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        //   System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        final int COUNT_OWNER = 3;
        String[] owners = new String[COUNT_OWNER];
        owners[0] = "Leo";
        owners[1] = "Max";
        owners[2] = "Alex";
        System.out.println(owners[0]);
        System.out.println(owners[1]);
        System.out.println(owners[2]);


        House firstHouse = new House();
        firstHouse.setAddress("Lenina, 2");
        firstHouse.setOwner("Ivanov");
        System.out.println("First house:");
        System.out.println("Address: " + firstHouse.getAddress());
        System.out.println("Owner: " + firstHouse.getOwner());

        House secondHouse = new House();
        secondHouse.address = "Chkalova, 8";
        secondHouse.owner = "Petrov";
        System.out.println("Second house:");
        System.out.println("Address: " + secondHouse.address);
        System.out.println("Owner: " + secondHouse.owner);

        House thirdHouse = new House();
        thirdHouse.address = "Stroiteley, 10";
        thirdHouse.owner = "Vasiliev";
        System.out.println("Third house:");
        System.out.println("Address: " + thirdHouse.address);
        System.out.println("Owner: " + thirdHouse.owner);

        // Проверка метода
        Double figure = new Double();
        int[] doubles = new int[] {1, 3, 3, 5, 6, 7};
        figure.showDouble(doubles);
        System.out.println(figure.showDouble(doubles));


    }






    //int[] queues = {1, 22, 3, 4, 4, 5};




}




