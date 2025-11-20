package k23cnt3.ngdDay06lab.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ngd_book")
public class ngdBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ngdId;

    String ngdCode;
    String ngdName;
    String ngdDescription;
    String ngdImgUrl;
    Integer ngdQuantity;
    Double ngdPrice;
    Boolean ngdActive;

    @ManyToMany
    @JoinTable(
            name = "ngd_book_author",
            joinColumns = @JoinColumn(name = "ngdBookId"),
            inverseJoinColumns = @JoinColumn(name = "ngdAuthorId")
    )
    List<ngdAuthor> ngdAuthors = new ArrayList<>();
}
