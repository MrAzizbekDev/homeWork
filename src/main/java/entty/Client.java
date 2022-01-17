package entty;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private Integer id;
    private String name;
    private boolean active;
    private String phoneNumber;
}
