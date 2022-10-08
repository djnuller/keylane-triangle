package dk.jdsj.keylane.controllers;

import dk.jdsj.keylane.handlers.TriangleHandler;
import dk.jdsj.keylane.models.Triangle;
import dk.jdsj.keylane.models.TriangleResponse;
import dk.jdsj.keylane.models.TriangleType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Triangle")
@RequestMapping(path = "/v1")
@RequiredArgsConstructor
@Slf4j
public class TriangleController {
    private final TriangleHandler triangleHandler;

    @PostMapping("get-triangle-type")
    @Operation(summary = "Determine the type of triangle.", operationId = "getTypeOfTriangle")
    public ResponseEntity<TriangleResponse> getTypeOfTriangle(@RequestBody final Triangle triangle) {
        log.info(">>> getTypeOfTriangle, triangle {}", triangle);
        var triangleType = triangleHandler.getTriangleType(triangle);
        log.info("<<< getTypeOfTriangle");
        return getTriangleResponseResponseEntity(triangleType);
    }

    private static ResponseEntity<TriangleResponse> getTriangleResponseResponseEntity(TriangleType triangleType) {
        return switch (triangleType) {
            case ISOSCELES -> ResponseEntity.ok(TriangleResponse.builder()
                    .message("The triangle is isosceles")
                    .result(TriangleResponse.Result.SUCCESS)
                    .triangleType(triangleType)
                    .build());
            case SCALENE -> ResponseEntity.ok(TriangleResponse.builder()
                    .message("The triangle is scalene")
                    .result(TriangleResponse.Result.SUCCESS)
                    .triangleType(triangleType)
                    .build());
            case EQUILATERAL -> ResponseEntity.ok(TriangleResponse.builder()
                    .message("The triangle is equilateral")
                    .result(TriangleResponse.Result.SUCCESS)
                    .triangleType(triangleType)
                    .build());
        };
    }
}
