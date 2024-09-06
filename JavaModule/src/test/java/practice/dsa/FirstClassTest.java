package practice.dsa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
public class FirstClassTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> FirstClass.main(new String[1]));
    }
}