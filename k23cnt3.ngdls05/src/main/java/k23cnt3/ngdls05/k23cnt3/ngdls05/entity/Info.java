package k23cnt3.ngdls05.k23cnt3.ngdls05.entity;

import lombok.*;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    String name;
    String nickName;
    String email;
    String website;
}