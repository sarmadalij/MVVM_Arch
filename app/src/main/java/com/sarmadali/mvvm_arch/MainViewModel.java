package com.sarmadali.mvvm_arch;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    int count = 0;

    //increment method
    public void increment(){
        count++;
    }
}
