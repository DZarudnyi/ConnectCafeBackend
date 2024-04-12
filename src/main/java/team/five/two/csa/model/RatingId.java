package team.five.two.csa.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
public class RatingId implements Serializable {
    private Cafe cafe;
    private User user;
}
