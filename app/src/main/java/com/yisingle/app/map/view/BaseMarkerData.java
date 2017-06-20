package com.yisingle.app.map.view;

import android.support.annotation.DrawableRes;

import com.amap.api.maps.model.LatLng;

public class BaseMarkerData {

    protected LatLng latLng;

    protected
    @DrawableRes
    int drawableId;

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(@DrawableRes int drawableId) {
        this.drawableId = drawableId;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }
}