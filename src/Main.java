public class Main {

    public static void main(String[] args) {
        /* Hello world */
        System.out.println("Hello world");

        /* deklarace promennych */
        var number = 10;
        var failureText = "Nic neplati";
        var condition = false;

        /* podminky */
        if(condition) {
            System.out.println("Podminka je platna");
        } else if(number > 5) {
            System.out.println("Cislo je vetsi jak " + number);
        } else {
            System.out.println(failureText);
        }

        /* ternarni operatory */
        var text = "cislo " + (number > 10 ? "je" : "neni") + " vetsi jak " + number;
        System.out.println(text);

        int day = 2;
        /* switch vyraz */
        /* musi resit kazdou hodnotu, ktera muze nastat (zbytek se resi pomoci default) */
        var dayTxt = switch(day % 7) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Yesterday";
        };

        System.out.println("It's " + dayTxt);

        System.out.println("It was " + GetDayName(day - 1));
    }

    public static String GetDayName(int dayIdx) {
        return switch(dayIdx % 7) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Yesterday";
        };
    }
}
