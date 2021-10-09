package com.example.android.network1;

public class earthquake {
    private String mmagnitude;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mlocation;

    // Drawable resource ID
    private String mdate;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public earthquake(String magnitude, String location,String date)
    {
      mmagnitude=magnitude;
      mlocation=location;
      mdate=date;
    }

    /**
     * Get the name of the Android version
     */
    public String getmagnitude() {
        return mmagnitude;
    }

    /**
     * Get the Android version number
     */
    public String getlocation() {
        return mlocation;
    }

    /**
     * Get the image resource ID
     */
    public String getdate() {
        return mdate;
    }


}

