package com.example.wk01hw01.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.wk01hw01.models.VolumesResponse;
import com.example.wk01hw01.repositories.BookRepository;

class BookSearchViewModel extends AndroidViewModel {
    private BookRepository bookRepository;
    private LiveData<VolumesResponse> volumesResponseLiveData;

    public BookSearchViewModel(@NonNull Application application) {
        super(application);
    }

    public void init() {
        bookRepository = new BookRepository();
        volumesResponseLiveData = bookRepository.getVolumesResponseLiveData();
    }

    public void searchVolumes(String keyword, String author) {
      //  Dotenv dotenv = Dotenv.configure().directory("/assets").filename("env").load();
        //bookRepository.searchVolumes(keyword, author, dotenv.get("GOOGLE_API_KEY"));
    }

    public LiveData<VolumesResponse> getVolumesResponseLiveData() {
        return volumesResponseLiveData;
    }
}
