package mockitoTest;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import unitTest.Calculator;

@ExtendWith(MockitoExtension.class)
public class MockitoSampleTest {
	@Mock
	private Calculator calc;

	@InjectMocks
	private MockitoSample sample;

	@SuppressWarnings("deprecation")
	@BeforeEach
	void setup() {
		MockitoAnnotations.initMocks(this);
	}

    @Test
    @DisplayName("getSquareResultに5を渡した時に25が表示できる")
    void test() {
    	when(calc.square(5)).thenReturn(25);
    }
}
