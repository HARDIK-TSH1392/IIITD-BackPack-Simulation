package Assignment2;

import java.util.Date;

public class Slides {
    private String slide_topic;
    private int noOfSlides;
    private String[] slideContent = new String[noOfSlides];
    private String uploadedBy;
    private Date dayAndTime;


    public void setDayAndTime(Date dayAndTime) {
        this.dayAndTime = dayAndTime;
    }

    public Date getDayAndTime() {
        return dayAndTime;
    }

    public void setNoOfSlides(int noOfSlides) {
        this.noOfSlides = noOfSlides;
    }

    public void setSlide_topic(String slide_topic) {
        this.slide_topic = slide_topic;
    }

    public void setSlideContent(String[] slideContent) {
        this.slideContent = slideContent;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public int getNoOfSlides(){
        return noOfSlides;
    }

    public String getSlide_topic() {
        return slide_topic;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public String[] getSlideContent() {
        return slideContent;
    }


}
