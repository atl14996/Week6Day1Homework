
package com.example.week6day1homework.model.datasource.remote;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media implements Parcelable
{

    @SerializedName("m")
    @Expose
    private String m;
    public final static Parcelable.Creator<Media> CREATOR = new Creator<Media>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Media createFromParcel(Parcel in) {
            return new Media(in);
        }

        public Media[] newArray(int size) {
            return (new Media[size]);
        }

    }
    ;

    protected Media(Parcel in) {
        this.m = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Media() {
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(m);
    }

    public int describeContents() {
        return  0;
    }

}
