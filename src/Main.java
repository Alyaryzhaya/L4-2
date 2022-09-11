import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//=================================================================
//        int a = 5;
//        int b = 3;
//
//        int result;
//        if(a>b) {
//            result = a;
//        } else {
//            result = b;
//        }
//        System.out.println(result);
// ==========================================================================

        // В ДВА ЭТАПА
        CalcService service = new CalcService();  // создали ОБЪЕКТ

        //       int myMax = service.max(8, 78); // вызвали объект и попросили сделать ДЕЙСТВИЕ max.
                                                 // Возвращенный функцией РЕЗУЛЬТАТ положить в переменную int myMax

        //       int x = 5;  // можно вызывать методом не конкретные цифры, а переменные
        //       int y = 6;
        //       int myMax = service.max(x, y);
        //       System.out.println(myMax + "!"); // можем проверить результат в переменной myMax

        System.out.println();  // чтобы было разделение между результатами на печати
        System.out.println("7/9");  // название проверки
        System.out.println(service.max(7, 9));  // Можно сразу после создания объекта вывести на экран его действие (max)

        System.out.println();
        System.out.println("10/10");
        System.out.println(service.max(10, 10));

        System.out.println();
        System.out.println("-10 / -20");
        System.out.println(service.max(-10, -20));
    }
}
