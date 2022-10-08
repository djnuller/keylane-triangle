package dk.jdsj.keylane.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Triangle {
    @Schema(description = "The hypotenuse length of the triangle.", required = true, example = "14")
    private int hypotenuseLength;
    @Schema(description = "The opposite length of the triangle.", required = true, example = "12")
    private int oppositeLength;
    @Schema(description = "The adjacent length of the triangle.", required = true, example = "13")
    private int adjacentLength;
}
