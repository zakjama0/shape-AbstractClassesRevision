import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AreaTest {
    IArea circle;
    IArea square;
    @BeforeEach

    public void setUp(){
        circle = new Circle(50);
        square = new Square(20, 30);
    }

    @Test
    public void testCircle(){
        assertThat(circle.calculateArea()).isEqualTo(7853.981633974483);
    }

    @Test
    public void testSquare(){
        assertThat(square.calculateArea()).isEqualTo(600);
    }
}
