/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

public class DZ_1 {
    public static void main(String[] args) {

        // 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        int[] array = new int[] {1, 5, 8, 0, 9, 3};

        //Исключение деление на 0
        System.out.println(exception_1(array, 1, 2));

        //Выход за пределы массива
        System.out.println(exception_2(array, 2));

        //Отсутствие числа в массиве
        System.out.println(exception_3(array, 2));
    }


        // 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
        /*
         * 1. При индексе J<4 будет ошибка по выходу за пределы массива
         * 2. В случае извлечения строки из массива, состоящую не только из цифр,
         * выйдет исключение по невозможности преобразования строки в число
         */
        public static int sum2d(String[][] arr){ 
            int sum = 0;
            for (int i = 0; i < arr.length; i++) { 
                for (int j = 0; j < 5; j++) { 
                    int val = Integer.parseInt(arr[i][j]); sum += val; 
                } 
            } return sum; 
        }

        /* 
         * 3. метод, принимающий в качестве аргументов два целочисленных массива
         * и возвращающий новый массив, каждый элемент которого равен частному элементов
         * двух входящих массивов в той же ячейке. Если длины массивов не равны,
         * необходимо как-то оповестить пользователя. Важно: При выполнении метода
         * единственное исключение, которое пользователь может увидеть -
         * RuntimeException, т.е. ваше
         */

    public static long[] mult(int[] array1, int[] array2) {
        if(array1.length != array2.length){
            throw new RuntimeException("Массивы имеют разную длинну");}
        
        long[] arr_mult = new long[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arr_mult[i] = array1[i] / array2[i];
        }
        return arr_mult;
    }

    // Методы к первому заданию
    public static int exception_1(int[] array, int a, int b) {
        if(array[b] == 0) throw new RuntimeException("Делить на 0 нельзя");
        return array[a] / array[b];
    }

    public static int exception_2(int[] array, int a) {
        if(a>array.length-1) return -1;
        return array[a];
    }

    public static int exception_3(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == a) return i;
        }
        return -1;
    }
}
