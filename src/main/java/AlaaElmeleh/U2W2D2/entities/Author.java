package AlaaElmeleh.U2W2D2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Author {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataNascita;
    private String avatar;
}
