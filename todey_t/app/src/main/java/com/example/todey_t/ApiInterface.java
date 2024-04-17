package com.example.todey_t;


import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST("LiveTrack/SaveCSPCenters")
    Call<CSPCentersResponce> getCenter(@Header("Authorization") String token, @Query("Pincode") String Pincode, @Query("Latitude") String Latitude, @Query("Longitude") String Longitude, @Query("Address") String Address);

}
