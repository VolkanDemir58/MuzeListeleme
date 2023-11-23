package com.example.hafta14;

import android.os.Parcel;
import android.os.Parcelable;

public class Muze implements Parcelable {
    private String isim;
    private String semt;
    private String resimUrl;
    private String detayResimUrl;
    private String hakkinda;

    protected Muze(Parcel in) {
        isim = in.readString();
        semt = in.readString();
        resimUrl = in.readString();
        detayResimUrl = in.readString();
        hakkinda = in.readString();
    }

    public static final Creator<Muze> CREATOR = new Creator<Muze>() {
        @Override
        public Muze createFromParcel(Parcel in) {
            return new Muze(in);
        }

        @Override
        public Muze[] newArray(int size) {
            return new Muze[size];
        }
    };

    public String getIsim() {
        return isim;
    }
    public String getSemt() {
        return semt;
    }
    public String getResimUrl() {
        return resimUrl;
    }
    public String getDetayResimUrl() {
        return detayResimUrl;
    }
    public String getHakkinda() {
        return hakkinda;
    }
    public Muze(String isim, String semt, String resimUrl, String detayResimUrl, String hakkinda) {
        this.isim = isim;
        this.semt = semt;
        this.resimUrl = resimUrl;
        this.detayResimUrl = detayResimUrl;
        this.hakkinda = hakkinda;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(isim);
        parcel.writeString(semt);
        parcel.writeString(resimUrl);
        parcel.writeString(detayResimUrl);
        parcel.writeString(hakkinda);
    }
}
