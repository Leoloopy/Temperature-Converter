package test;

import Exceptions.InvalidTemperatureException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemperatureConverterTest {
    private Temperature temperature;

    @BeforeEach
    void setUp(){
        temperature = new Temperature();
    }

    @Test
    void testThatKelvinCanBeConvertedToCelsius(){
        double result = temperature.convertToKelvin(30);
        assertEquals(303.15, result);
    }

    @Test
    void testThatCelsiusCanBeConvertedToKelvin(){
        double result = temperature.convertToCelsius(375);
        assertEquals(101.85, result);
    }


}
