package entty;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Supplier {
    private Integer id;
    private String name;
    private boolean active;
}
