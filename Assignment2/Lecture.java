package Assignment2;

import java.util.Date;

public class Lecture {
    private String video_name;
    private String video_filename;
    private Date dateAndTime;
    private String uploadedBy;

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setVideo_filename(String video_filename) {
        this.video_filename = video_filename;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public String getVideo_filename() {
        return video_filename;
    }

    public String getVideo_name() {
        return video_name;
    }

}
