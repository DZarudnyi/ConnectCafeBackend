package team.five.two.csa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Getter
@Setter
@Entity
@SQLDelete(sql = "UPDATE menu_items SET is_deleted = TRUE WHERE id = ?")
@SQLRestriction("is_deleted = FALSE")
@Table(name = "menu_items")
public class MenuItem {
    //TODO: find correct way of using MapsId
    @Id
    Long id;
    @ManyToOne
    @MapsId
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;
    private String name;
    private float price;
    private String description;
    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;
}
