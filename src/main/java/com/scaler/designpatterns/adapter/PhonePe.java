package com.scaler.designpatterns.adapter;


//1.1 Our phone pe class
public class PhonePe {
//    BankAPi bankAPi=BankFactory.getBank("Yes Bank"); HW to implement the adaptor factory pattern.
// Here for now we are hard coding it (in production we won't do this,instead we use factory pattern and inject the dependency using DI)

//    private static BankAPi bankAPi=new YesBankAdaptor();
    private static BankAPi bankAPi=new ICICIBankAdaptor();

    public static void main(String[] args) {
        bankAPi.sendMoney("12345", "67890", 1000);
    }
//    Now if we want to change from yes bank to ICICI we just change the object above.
}

//selfstudy example
//Other example from copilot
//Imagine you have a MediaPlayer interface that expects play(String audioType, String fileName).
//But you have an advanced player that only plays vlc and mp4 formats with different methods.
//We’ll use an Adapter to make them compatible.


//// Target interface // similar to Bank interface
//interface MediaPlayer {
//    void play(String audioType, String fileName);
//}
//
//// Adaptee (existing class with different interface)
//class AdvancedMediaPlayer {
//    void playVlc(String fileName) {
//        System.out.println("Playing vlc file: " + fileName);
//    }
//    void playMp4(String fileName) {
//        System.out.println("Playing mp4 file: " + fileName);
//    }
//}
//
//// Adapter class
//class MediaAdapter implements MediaPlayer {
//    private AdvancedMediaPlayer advancedPlayer;
//
//    public MediaAdapter(String audioType) {
//        advancedPlayer = new AdvancedMediaPlayer();
//    }
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if(audioType.equalsIgnoreCase("vlc")) {
//            advancedPlayer.playVlc(fileName);
//        } else if(audioType.equalsIgnoreCase("mp4")) {
//            advancedPlayer.playMp4(fileName);
//        } else {
//            System.out.println("Format not supported: " + audioType);
//        }
//    }
//}
//
//// Client class
//class AudioPlayer implements MediaPlayer {
//    private MediaAdapter adapter;
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if(audioType.equalsIgnoreCase("mp3")) {
//            System.out.println("Playing mp3 file: " + fileName);
//        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
//            adapter = new MediaAdapter(audioType);
//            adapter.play(audioType, fileName);
//        } else {
//            System.out.println("Invalid media. " + audioType + " format not supported");
//        }
//    }
//}
//
//// Main class to test
//public class Main {
//    public static void main(String[] args) {
//        AudioPlayer player = new AudioPlayer();
//
//        player.play("mp3", "song.mp3");
//        player.play("mp4", "movie.mp4");
//        player.play("vlc", "video.vlc");
//        player.play("avi", "clip.avi");
//    }
//}