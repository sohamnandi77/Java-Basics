package oops.interfaces;

public abstract interface YouTuber extends VideoEditor{
    // interface are by default public static final abstract
    void makeVideo();


    
    default void uploadVideo(){
        System.out.println("Upload the Video");
    }


}
