package entty;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private boolean success;
    private String massage;
}
