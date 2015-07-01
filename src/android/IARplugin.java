package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class IARplugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("launch")) {
            Intent i = new Intent( this.cordova.getActivity() , ARActivity.class);
            this.cordova.getActivity().startActivity(i);
            return true;
        }
        else {
            return false;
        }
    }

}
