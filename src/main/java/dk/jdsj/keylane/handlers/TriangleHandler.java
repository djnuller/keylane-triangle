package dk.jdsj.keylane.handlers;

import dk.jdsj.keylane.models.Triangle;
import dk.jdsj.keylane.models.TriangleType;
import dk.jdsj.keylane.services.TriangleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class TriangleHandler {

    private final TriangleService triangleService;

    public TriangleType getTriangleType(final Triangle triangle) {
        if (triangleService.isTriangleEquilateral(triangle)) {
            return TriangleType.EQUILATERAL;
        } else if (triangleService.isTriangleIsosceles(triangle)) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }
}
