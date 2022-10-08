package dk.jdsj.keylane.services;

import dk.jdsj.keylane.models.Triangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TriangleServiceTest {

    TriangleService triangleService;
    Triangle equilateral;
    Triangle isosceles;
    Triangle scalene;

    @BeforeAll
    void setup() {
        triangleService = new TriangleService();
        equilateral = new Triangle(10, 10, 10);
        isosceles = new Triangle(12, 10, 10);
        scalene = new Triangle(20, 21, 10);
    }

    @Test
    void given_equilateral_triangle_return_true_isTriangleEquilateral() {
        assertTrue(triangleService.isTriangleEquilateral(equilateral));
    }

    @Test
    void given_scalene_or_isosceles_triangle_return_false_isTriangleEquilateral() {
        assertFalse(triangleService.isTriangleEquilateral(isosceles));
        assertFalse(triangleService.isTriangleEquilateral(scalene));
    }

    @Test
    void given_isosceles_triangle_return_true_isTriangleIsosceles() {
        assertTrue(triangleService.isTriangleIsosceles(isosceles));
    }
    @Test
    void given_scalene_or_equilateral_triangle_return_false_isTriangleIsosceles() {
        assertFalse(triangleService.isTriangleIsosceles(equilateral));
        assertFalse(triangleService.isTriangleIsosceles(scalene));
    }

    @Test
    void given_scalene_triangle_return_true_isTriangleScalene() {
        assertTrue(triangleService.isTriangleScalene(scalene));
    }

    @Test
    void given_given_isosceles_or_equilateral_triangle_return_false_isTriangleScalene() {
        assertFalse(triangleService.isTriangleScalene(equilateral));
        assertFalse(triangleService.isTriangleScalene(isosceles));
    }


}
