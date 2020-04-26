package id.absesi.network;

import java.util.List;

import id.absesi.domain.Hero;
import id.absesi.domain.dto.UserDTO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Belal on 10/2/2017.
 */

public interface Api {

    String BASE_URL = "http://192.168.43.7/rest-book/index.php/";

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json;charset=utf-8",
    })
    @GET("book")
    Call<List<Hero>> getHeroes();

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json;charset=utf-8",
    })
    @POST("auth/login")
    Call<UserDTO> doLogin(@Body UserDTO userDTO);
}
