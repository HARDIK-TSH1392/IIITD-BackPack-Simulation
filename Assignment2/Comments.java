package Assignment2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Comments implements CommentsMethods{
//    private static ArrayList<Comments> comments = new ArrayList<>();
    
    Scanner sc4 = new Scanner(System.in);

    private Date dateAndTime;
    private String commentString;
    private String uploadedBy;

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setCommentString(String commentString) {
        this.commentString = commentString;
    }

    public String getCommentString() {
        return commentString;
    }

//    public void setComments(ArrayList<Comments> comments) {
//        this.comments = comments;
//    }
//
//    public ArrayList<Comments> getComments() {
//        return comments;
//    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    @Override
    public void addComment(Instructor ins) {
        System.out.print("Enter comment: ");
        String commentInput = sc4.nextLine();
        setCommentString(commentInput);
        setUploadedBy(ins.getInstructor_name());
        long millis=System.currentTimeMillis();
        Date date=new Date(millis);
        setDateAndTime(date);
        System.out.println("\n");
        
    }

    @Override
    public void addComment(Student stu) {
        System.out.print("Enter comment: ");
        String commentInput = sc4.nextLine();
        setCommentString(commentInput);
        setUploadedBy(stu.getStudent_name());
        long millis=System.currentTimeMillis();
        Date date=new Date(millis);
        setDateAndTime(date);
        System.out.println("\n");

    }

    @Override
    public void viewComment(ArrayList<Comments> comments) {

        for (int i = 0; i < comments.size(); i++) {
            System.out.println(comments.get(i).getCommentString() + " - " + comments.get(i).getUploadedBy());
            System.out.println(comments.get(i).getDateAndTime());
        }

    }


}
