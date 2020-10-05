package lecture2;

public class VariableExamples {

    public static void main(String[] args) {
        // Die runden Klammern ändern die Ausführungsreihenfolge.
        System.out.println(9.1 * 4.5 - 2.7 / 3);
        System.out.println(9.1 * (4.5 - 2.7) / 3);

        int year; // Definition der Variable
        year = 2020; // Initialisierung der Variable
        System.out.println(year);
        year = 2021;
        System.out.println(year);

        double celsius = 20.4; // Definition und Initialisierung der Variable
        double fahrenheit = 9 / 5 * celsius + 32;
        System.out.println(celsius + "C is " + fahrenheit + "F.");

        String firstName = "Konstantin";
        String secondName = firstName + " Trendafilov";
        System.out.println(secondName);
    }

}
