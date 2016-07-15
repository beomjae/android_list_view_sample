package com.jejunet.hellolistview2;

/**
 * Created by user on 2016-07-15.
 */
public class ListViewItem {
    private int icon;
    private String name;

    public ListViewItem(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
