package com.masterclass;

import java.util.List;

/**
 * Created by luis on 27-05-2017.
 */
public class Dresser {
    List<Cloth> cloths;
    boolean opened = false;

    public Dresser(List<Cloth> cloths) {
        this.cloths = cloths;
    }

    public void open() {
        opened = true;
    }

    public void close() {
        opened = false;
    }

    public Cloth getCloth(int pos) {
        if (opened && pos < cloths.size())
            return cloths.get(pos);
        else
            return null;
    }
}
