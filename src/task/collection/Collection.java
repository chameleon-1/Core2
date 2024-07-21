package task.collection;


import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // Реализуйте функциональность согласно описанию

        // TODO1: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, -3, 0, 5, 6, 9, 8);
        System.out.println("todo1: " + numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        Collections.addAll(numbers2, 8, -2, 5, 7, 8, 8, 3, -9);
        System.out.println("todo1: " + numbers2);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1010, "Smirnov V.V.");
        hm.put(2020, "Petrov P.P.");
        hm.put(3030, "Ivanov I.I.");
        System.out.println("todo1: " + hm);

        Deque<Integer> deque = new ArrayDeque<>();


        // TODO2: Найти наибольший элемент в списке.

        System.out.println("todo2: " + "max number " + Collections.max(numbers));

        // TODO3: Удалить все дубликаты из списка.

        HashSet<Integer> set = new HashSet<>(numbers);      //помещаю массив в хешсет(он не хранит дубликаты)
        numbers.clear();                                    //все удаляю из массива
        numbers.addAll(set);                                //добавляю элементы хешсета в массив
        System.out.println("todo3: " + numbers);

        // TODO4: Отсортировать список в порядке убывания.

        Collections.sort(numbers);                          //метод сортировки в порядке возрастания
        Collections.reverse(numbers);                       //разворачивает список задом наперед
        System.out.println("todo4: " + numbers);

        // TODO5: Проверить, содержит ли множество определенный элемент.

        Collections.sort(numbers);                              //перед вызовом бинарисертч нужно сортировать массив
        int j = Collections.binarySearch(numbers, -3);      //ищет индекс числа (если индекс отрицательный, то числа в массиве нет)
        if (j < 0) {
            System.out.println("todo5: " + " ne sodershit chislo");
        } else {
            System.out.println("todo5: " + "sodershit chislo");
        }

        System.out.println("todo5: " + numbers.contains(5));     //второй вариант

        // TODO6: Найти пересечение двух множеств.

        System.out.println("todo6: " + Collections.disjoint(numbers, numbers2));        //возвращает фалс если есть совпадения

        // TODO7: Удалить все элементы из множества, которые также содержатся в другом множестве.

        Set<Integer> set7 = new HashSet<>(numbers);     //сделал два хешсета
        Set<Integer> set72 = new HashSet<>(numbers2);
        set7.removeAll(set72);                          //из первого массива удалил элементы второго массива
        System.out.println("todo7: " + set7);

        // TODO8: Проверить, содержит ли карта определенный ключ.

        System.out.println("todo8: " + hm.containsKey(2060));     //метод проверяет наличие ключа (возвращает тру или фолс)

        // TODO9: Получить все значения, связанные с определенным ключом.

        String value = hm.get(2020);            //вызывает значение по ключу через метод гет
        System.out.println("todo9: " + value);

        // TODO10: Удалить все записи из карты, у которых значение равно определенному значению.

        hm.remove(3030);
        System.out.println("todo10: " + hm);

        // TODO11: Добавить элемент в очередь.

        deque.add(3);                       //просто добавляет
        deque.addFirst(2);               //добавляет в начало очереди
        deque.addFirst(1);
        deque.addLast(4);               //добавляет в конец очереди
        System.out.println("todo11: " + deque);

        // TODO12: Получить и удалить первый элемент из очереди.

        Integer firstDeque = deque.peek();      //возращает элемент с головы
        System.out.println("todo12: " + firstDeque);
        deque.poll();           //удаляет первый элемент в очереди
//        System.out.println("todo12: " + firstDeque);
        for (Integer i : deque) {
            System.out.println("todo 12 after delete: " + i);
        }

        // TODO13: Проверить, пуста ли очередь.

        System.out.println("todo13: " + deque.isEmpty());

        // TODO14: Учет заказов:
        //  Создайте класс Order с полями id(int), customer(string) и totalAmount(int).
        //  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
        //  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(01, "скорпион", 150));
        orders.add(new Order(02, "саб-зиро", 123));
        orders.add(new Order(03, "рейден", 205));
        orders.add(new Order(04, "соня", 196));
        orders.add(new Order(05, "джони кейдж", 265));

        Order.maxAmount(orders);
        Order.total(orders);

        // TODO15: Управление задачами:
        //  Создайте класс Task с полями id(int), title(string) и isCompleted(boolean).
        //  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
        //  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(01, "проснуться", true));
        tasks.add(new Task(02, "покормить кота", true));
        tasks.add(new Task(03, "работать", false));
        tasks.add(new Task(04, "покушать", true));
        tasks.add(new Task(05, "жить жизнь", false));

        Task.notComplete(tasks);
        Task.status(tasks, "жить жизнь");

        // TODO16: Создание списка студентов:
        //  Создайте класс Student с полями name(string) и age(int).
        //  Создайте метод, который будет принимать список студентов и выводить их на экран.
        //  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.

        List<Student16> students16 = new ArrayList<>();
        students16.add(new Student16("Леонардо", 19));
        students16.add(new Student16("Рафаэль", 23));
        students16.add(new Student16("Микелянджело", 15));
        students16.add(new Student16("Донателло", 20));
        System.out.println("todo16: ");
        Student16.show(students16);
        System.out.println("студенты, которым 20 и более лет: ");
        Student16.howAge(students16);

        // TODO17: Учет товаров на складе:
        //  Создайте класс Product с полями id(int), name(string) и quantity(int).
        //  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
        //  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "борщ с капустой, но некрасный", 1));
        products.add(new Product(2, "сосисочки", 2));
        products.add(new Product(3, "непонятный салат", 4));
        products.add(new Product(4, "котлетки с пюрешкой", 0));
        products.add(new Product(5, "вкусный чай", 1));
        Product.zero(products);
        Product.total(products);

        // TODO18: Учет посещаемости:
        //  Создайте класс Student с полями name(string) и attendance(string).
        //  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
        //  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.

        List<Student18> students18 = new ArrayList<>();
        students18.add(new Student18("Тинки-винки", "был"));
        students18.add(new Student18("Дипси", "был"));
        students18.add(new Student18("Ляля", "не был"));
        students18.add(new Student18("По", "был"));
        Student18.badAttendance(students18);
        Student18.averageAttendance(students18);


    }
}