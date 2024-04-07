package team.five.two.csa.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import java.util.Set;

@Getter
@Setter
@Entity
@SQLDelete(sql = "UPDATE menus SET is_deleted = TRUE WHERE id = ?")
@SQLRestriction("is_deleted = FALSE")
@Table(name = "menus")
public class Menu {
    @Id
    Long id;
    //TODO: find correct way of using MapsId
    @OneToOne
    @MapsId
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "menu")
    private Set<MenuItem> menuItems;
    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;
}
