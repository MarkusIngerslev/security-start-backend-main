package dat3.security.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//----------------
@Entity
public class SpecialUser extends UserWithRoles{

    //-----------
    // variables
    //-----------
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;

    public SpecialUser(String username, String password, String email, String firstName, String lastName, String address, String city, String zipCode) {
        super(username, password, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
    }

}
