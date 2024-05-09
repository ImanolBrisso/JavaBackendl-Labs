public class ConvertirTemperaturas {
    public static void main(String[] args) {

        for (int celsius = 0; celsius <= 100; celsius += 10) { // desde 0 hasta 100 y que vaya aumentando de 10 en 10
            double fahrenheit = celsiusToFahrenheit(celsius);

            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }

    public static double celsiusToFahrenheit(double celsius) { // se hace la conversion
        return (celsius * 9 / 5) + 32;
    }
}
