package ma.enset.jpa_app.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    @Id
    private String id;
    @Column(unique = true)
    private String rolename;
    @ManyToMany(mappedBy = "roles",fetch = FetchType.EAGER)
    private List<User> users=new ArrayList<>();
}
