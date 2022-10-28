package junit_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrinalsTest {

    Urinals urinals = new Urinals();
    @DisplayName("Max Urinals Availability When Input Is String")
    @Test
    public void  Test1() {
        Urinals urinals = new Urinals();
        String str = "10001";
        int expected_output = 1;
        int actual_output = urinals.countFromString(str);
        assertEquals(expected_output,actual_output);

    }



}