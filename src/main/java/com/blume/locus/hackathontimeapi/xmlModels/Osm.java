package com.blume.locus.hackathontimeapi.xmlModels;

import java.util.ArrayList;

public class Osm {
    ArrayList < Object > node = new ArrayList < Object > ();
    ArrayList< Object > way = new ArrayList < Object > ();

    public ArrayList<Object> getNode() {
        return node;
    }

    public void setNode(ArrayList<Object> node) {
        this.node = node;
    }

    public ArrayList<Object> getWay() {
        return way;
    }

    public void setWay(ArrayList<Object> way) {
        this.way = way;
    }
}

//public class Bounds {
//    private String _minlat;
//    private String _minlon;
//    private String _maxlat;
//    private String _maxlon;
//
//
//    // Getter Methods
//
//    public String get_minlat() {
//        return _minlat;
//    }
//
//    public String get_minlon() {
//        return _minlon;
//    }
//
//    public String get_maxlat() {
//        return _maxlat;
//    }
//
//    public String get_maxlon() {
//        return _maxlon;
//    }
//
//    // Setter Methods
//
//    public void set_minlat(String _minlat) {
//        this._minlat = _minlat;
//    }
//
//    public void set_minlon(String _minlon) {
//        this._minlon = _minlon;
//    }
//
//    public void set_maxlat(String _maxlat) {
//        this._maxlat = _maxlat;
//    }
//
//    public void set_maxlon(String _maxlon) {
//        this._maxlon = _maxlon;
//    }
//}
//public class Meta {
//    private String _osm_base;
//
//
//    // Getter Methods
//
//    public String get_osm_base() {
//        return _osm_base;
//    }
//
//    // Setter Methods
//
//    public void set_osm_base(String _osm_base) {
//        this._osm_base = _osm_base;
//    }
//}
