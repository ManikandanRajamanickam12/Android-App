package com.example.android.quakereport;

public class Earthquake {
    private double mmagnitude;
    private String mUrl;
    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mlocation;

    // Drawable resource ID
    private String mdate;
    private long mTimeInMilliseconds;
    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mmagnitude = magnitude;
        mlocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the name of the Android version
     */
    public double getmagnitude() {
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

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }
}