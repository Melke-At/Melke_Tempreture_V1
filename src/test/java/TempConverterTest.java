
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TempConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, TempConverter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, TempConverter.fahrenheitToCelsius(32), 0.001);
    }

    // ✅ NEW TESTS

    @Test
    void testKelvinToCelsius_NormalValue() {
        assertEquals(26.85, TempConverter.kelvinToCelsius(300), 0.001);
    }

    @Test
    void testKelvinToCelsius_FreezingPoint() {
        assertEquals(0, TempConverter.kelvinToCelsius(273.15), 0.001);
    }

    @Test
    void testKelvinToCelsius_AbsoluteZero() {
        assertEquals(-273.15, TempConverter.kelvinToCelsius(0), 0.001);
    }
}