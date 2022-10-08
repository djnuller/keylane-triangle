package dk.jdsj.keylane.services;

import dk.jdsj.keylane.models.Triangle;
import org.springframework.stereotype.Service;

@Service
public class TriangleService {
    // triangle documentation: https://www.mathsisfun.com/triangle.html
    public boolean isTriangleIsosceles(final Triangle triangle) {
        // in order to calculate if the triangle is isosceles we simply need to check if two sides are equal to each other.
        // first lets check that the triangle is not equilateral
        if (isTriangleEquilateral(triangle)) {
            return false;
        }
        if (triangle.getHypotenuseLength() == triangle.getOppositeLength()) {
            return true;
        }
        if (triangle.getHypotenuseLength() == triangle.getAdjacentLength()) {
            return true;
        }
        return triangle.getOppositeLength() == triangle.getAdjacentLength();
    }

    public boolean isTriangleEquilateral(final Triangle triangle) {
        // in order to calculate if the triangle is equilateral all sides needs to be the same length.
        return triangle.getHypotenuseLength() == triangle.getOppositeLength() && triangle.getHypotenuseLength() == triangle.getAdjacentLength();
    }

    public boolean isTriangleScalene(final Triangle triangle) {
        // if it's not equilateral or isosceles we can assume there is no equal sides ergo no equal angles.
        return !isTriangleEquilateral(triangle) && !isTriangleIsosceles(triangle);
    }
}
