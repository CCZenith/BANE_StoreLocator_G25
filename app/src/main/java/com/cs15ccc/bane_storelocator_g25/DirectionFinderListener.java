package com.cs15ccc.bane_storelocator_g25;

import com.google.android.gms.maps.model.Marker;

import java.util.List;


public interface DirectionFinderListener {
    boolean onMarkerClick(Marker marker);

    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
