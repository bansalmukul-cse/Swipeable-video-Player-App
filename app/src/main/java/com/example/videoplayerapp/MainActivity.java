package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videoViewPager = findViewById(R.id.videoViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemVaccine = new VideoItem();
        videoItemVaccine.videoURL="http://aws-sgp-cdn.snackvideo.in/upic/2021/04/07/21/BMjAyMTA0MDcyMTAxMThfMTUwMDAwNTEyMzgzODc4XzE1MDAwMTI2MDM5MTY0Nl8yXzM=_b_Bca48abec8d568a195516fb015c77a430.mp4?tag=1-1618254573-s-0-uxal876jkt-4e0007020c988115";
        videoItemVaccine.videoTitle="Nihu01";
        videoItemVaccine.videoDescription="Mera Kasoor Kya Hai\uD83E\uDD7A piyankians #piifam #MyTransition #vidmoji_video_officiaI";
        videoItems.add(videoItemVaccine);

        VideoItem videoItemVaccine2 = new VideoItem();
        videoItemVaccine2.videoURL="http://ak-sgp-cdn.snackvideo.in/upic/2021/02/15/14/BMjAyMTAyMTUxNDM2MzlfMTUwMDAwNTEyNDE2NTEwXzE1MDAwMTIxODIzOTI4NV8yXzM=_b_Bc22fe591962fbcd449c379c6556a27b2.mp4?tag=1-1618254074-s-0-ajcs82gr9t-fb6b90af80c2f786";
        videoItemVaccine2.videoTitle="Nihu01";
        videoItemVaccine2.videoDescription="1CroreLove #faryal_fairyyy #faryalfairyyyofficial";
        videoItems.add(videoItemVaccine2);

        VideoItem videoItemVaccine3 = new VideoItem();
        videoItemVaccine3.videoURL="http://ak-sgp-cdn.snackvideo.in/upic/2021/02/13/19/BMjAyMTAyMTMxOTM5MjVfMTUwMDAwNTEyOTAzMDY2XzE1MDAwMTIxNzQ4MDkwMV8yXzM=_b_Bb577e3f9c87481db1b5df7d91684b314.mp4?tag=1-1618254750-s-0-mrmgnjxhlb-a2bf7abd6d51529b";
        videoItemVaccine3.videoTitle="Nihu01";
        videoItemVaccine3.videoDescription="follow ker o trending #vidmojiActingStar#snowwonder #foryoupage #fyp #standwithkashmir#viral #follow#like";
        videoItems.add(videoItemVaccine3);

        VideoItem videoItemVaccine4 = new VideoItem();
        videoItemVaccine4.videoURL="http://tx-sgp-cdn.snackvideo.in/upic/2021/04/08/18/BMjAyMTA0MDgxODM1MzNfMTUwMDAwNTEyMzgzODc4XzE1MDAwMTI2MTI4NzQwM18yXzM=_b_B7d668ac2e250b4564327375280de1d1e.mp4?tag=1-1618254651-s-0-zxhhmucwwu-28633363a77b3fbf";
        videoItemVaccine4.videoTitle="Nihu01";
        videoItemVaccine4.videoDescription=" piyankians #piifam #singleme #vidmoji_video_officiaI.....";
        videoItems.add(videoItemVaccine4);

        VideoItem videoItemVaccine5 = new VideoItem();
        videoItemVaccine5.videoURL="http://tx-sgp-cdn.snackvideo.in/upic/2021/03/17/17/BMjAyMTAzMTcxNzExMzdfMTUwMDAwNTQyOTY3MzMwXzE1MDAwMTI0MTE1MDE1MF8yXzM=_b_B1034d95446293131cbc1fc7515b44455.mp4?tag=1-1618254677-s-0-cr0ry7vsha-f88ff88fe72b8bfc";
        videoItemVaccine5.videoTitle="Nihu01";
        videoItemVaccine5.videoDescription=" maan lia to cute h❤\uD83D\uDC99\uD83D\uDE1A vidmojistar #love #FollowMe....";
        videoItems.add(videoItemVaccine5);


        videoViewPager.setAdapter(new videoAdapter(videoItems));


    }
}