package one.dio.restapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    COMMERCIAL("Commercial"),
    HOME("Home"),
    MOBILE("Mobile");

    private final String description;
}
