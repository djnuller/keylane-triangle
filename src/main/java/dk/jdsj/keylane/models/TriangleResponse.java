package dk.jdsj.keylane.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TriangleResponse {
    public enum Result {
        SUCCESS, INPUT_ERROR, INTERNAL_ERROR
    }

    @Schema(description = "Holds the type of triangle.")
    private TriangleType triangleType;
    @Schema(description = "A more detailed error message if result is not SUCCESS", required = true)
    private String message;
    @NonNull
    @Schema(description = "If result is INPUT_ERROR or INTERNAL_ERROR the message property will contain details about the error.", required = true)
    private Result result;
}
