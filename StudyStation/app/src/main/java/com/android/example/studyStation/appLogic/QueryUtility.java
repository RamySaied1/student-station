package com.android.example.studyStation.appLogic;

import android.text.TextUtils;
import android.util.Log;

import com.android.example.studyStation.DefinedData.Followee;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AmmarRabie on 18/08/2017.
 */

public final class QueryUtility {

    // TODO: this two fixed response should be removed after completing database in server
    private final static String FIXED_RESPONSE_GROUNDS = " empty now";


    private QueryUtility() {
    }




    /**
     * parse the response (of particular objects like student for example) and return java objects contain the data
     * @param JSONResponse
     * @return
     */
    static public ArrayList parseRequests(String JSONResponse) {
        return null;
    }


    /**
     * take the response of followees and parse to list<{@link Followee}>
     * @param JSONResponse
     * @return
     */
    static public List<Followee> parseFollowees(String JSONResponse)
    {
        // If the JSON string is empty or null, then return early.
        if (TextUtils.isEmpty(JSONResponse)) {
            return null;
        }

        // Create an empty ArrayList that we can start adding followees to
        List<Followee> followees = new ArrayList<>();

        // Try to parse the JSON response string. If there's a problem with the way the JSON
        // is formatted, a JSONException exception object will be thrown.
        // Catch the exception so the app doesn't crash, and print the error message to the logs.
        try {

            // Create a JSONObject from the JSON response string
            JSONObject baseJsonResponse = new JSONObject(JSONResponse);

            // Extract the JSONArray associated with the key called "features",
            // which represents a list of features (or followees).
            JSONArray followeeArray = baseJsonResponse.getJSONArray("followees");

            // For each followee in the followeeArray, create an Followee object
            for (int i = 0; i < followeeArray.length(); i++) {

                // Get a single earthquake at position i within the list of followees
                JSONObject currentFollowee = followeeArray.getJSONObject(i);

                // Extract the value for the key called "email"
                String email = currentFollowee.getString("email");

                // Extract the value for the key called "dep"
                String dep = currentFollowee.getString("dep");

                // Extract the value for the key called "fac"
                String fac = currentFollowee.getString("fac");

                // Extract the value for the key called "uni"
                String uni = currentFollowee.getString("uni");

                // Extract the value for the key called "name"
                String name = currentFollowee.getString("name");


                // Create a new Followee object
                Followee followee = new Followee(name,email,uni,fac,dep);

                // Add the new {@link Earthquake} to the list of followees.
                followees.add(followee);
            }

        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.
            Log.e("QueryUtils", "Problem parsing the followees JSON results", e);
        }

        // Return the list of followees
        return followees;
    }



}



