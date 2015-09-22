package com.hci.lab430.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.hci.lab430.testnewfeatures.BR;

/**
 * Created by lab430 on 15/9/21.
 */
public class ObservableUser1 extends BaseObservable {
    private String firstName;
    private String lastName;

    public ObservableUser1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ObservableUser1() {
        this.firstName = "";
        this.lastName = "";
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }



}
