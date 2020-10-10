package model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data // this annotation provided by lombok lets us not write java boilerplate getters/setters
@AllArgsConstructor
public class User {
    private String name;
    private String id;
}
