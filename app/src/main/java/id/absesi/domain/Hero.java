package id.absesi.domain;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Belal on 10/2/2017.
 */


@Getter
@Setter
@NoArgsConstructor
public class Hero {

    @SerializedName("id")
    private String id;

    private String title;

    private String author;


}
