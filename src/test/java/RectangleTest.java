package com.thoughtworks.rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class RectangleTest{

    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven(){
        final Rectangle Dimension = new Rectangle(0,0);
        final double Result = Dimension.area();
        assertThat(Result, is(closeTo(0, 0.001)));

    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven(){
        final Rectangle Dimension = new Rectangle(12.5,6.0);
        final double Result = Dimension.perimeter();
        assertThat(Result, is(closeTo(37, 0.001)));

    }
}