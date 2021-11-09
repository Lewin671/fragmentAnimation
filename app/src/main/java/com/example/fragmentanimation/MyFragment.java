package com.example.fragmentanimation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class MyFragment extends Fragment {
    private static int cnt = 0;
    private static List<String> urlList;

    static {
        urlList = new ArrayList<>();
        urlList.add("https://www.zhihu.com/question/454330385/answer/2191929853");
        urlList.add("https://www.bilibili.com/");
        urlList.add("https://github.com/android/animation-samples/tree/main/GridToPager");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        WebView webView = new WebView(getContext());
        webView.loadUrl(urlList.get((cnt++) % urlList.size()));
        return webView;
    }
}
