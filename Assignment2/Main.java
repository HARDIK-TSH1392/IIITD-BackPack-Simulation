package Assignment2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Slides> slide = new ArrayList<>();
        ArrayList<Lecture> lecture = new ArrayList<>();
        ArrayList<Comments> comments = new ArrayList<>();
        ArrayList<AssessmentAssignment> assignment = new ArrayList<>();
        ArrayList<AssessmentQuiz> quiz = new ArrayList<>();

//        Lecture l = new Lecture();
//        Slides s = new Slides();
//        Comments cIns = new Comments();
//        Comments cStu = new Comments();

        Scanner sc1 = new Scanner(System.in);
        int backpack_initialize = 0;
        Instructor I0 = new Instructor("I0");
        Instructor I1 = new Instructor("I1");

        Student S0 = new Student("S0");
        Student S1 = new Student("S1");
        Student S2 = new Student("S2");




        while(backpack_initialize != 3){
            System.out.println("Welcome to Backpack");
            System.out.println("1. Enter as Instructor");
            System.out.println("2. Enter as Student");
            System.out.println("3. Exit");
            backpack_initialize = sc1.nextInt();

            if(backpack_initialize == 1){
                System.out.println("Instructors:");
                System.out.println("0-IO");
                System.out.println("1-I1");
                int instructorNumber = sc1.nextInt();
                if(instructorNumber == 0){
                    instructorMethods(I0, slide, lecture, comments, assignment, quiz);
                }
                else if(instructorNumber == 1){
                    instructorMethods(I1, slide, lecture, comments, assignment, quiz);
                }


            }
            else if(backpack_initialize == 2){
                System.out.println("Student:");
                System.out.println("0-SO");
                System.out.println("1-S1");
                System.out.println("2-S2");
                int studentNumber = sc1.nextInt();
                if(studentNumber == 0){
                    studentMethods(S0, slide, lecture, comments, assignment, quiz);
                }
                else if( studentNumber == 1){
                    studentMethods(S1, slide, lecture, comments, assignment, quiz);
                }
                else if( studentNumber == 2){
                    studentMethods(S2, slide, lecture, comments, assignment, quiz);
                }

            }
            else if(backpack_initialize == 3){
                System.out.println("Backpack Close!");
            }
        }

    }


    private static void instructorMethods(Instructor ins, ArrayList<Slides> slide, ArrayList<Lecture> lecture, ArrayList<Comments> comments, ArrayList<AssessmentAssignment> assignment, ArrayList<AssessmentQuiz> quiz) {
        Scanner sc2 = new Scanner(System.in);

        int instructorMenu = 0;
        while(instructorMenu != 9){
            System.out.println("\n");
            System.out.println("Welcome " + ins.getInstructor_name());
            System.out.println("INSTRUCTOR MENU");
            System.out.println("1. Add class material");
            System.out.println("2. Add assessment");
            System.out.println("3. View lecture material");
            System.out.println("4. View assessments");
            System.out.println("5. Grade assessments");
            System.out.println("6. Close assessments");
            System.out.println("7. View comments");
            System.out.println("8. Add comments");
            System.out.println("9. Logout");
            instructorMenu = sc2.nextInt();
            System.out.println("\n");

            if(instructorMenu == 1){
                System.out.println("1");
//                Slides s = new Slides();
//                Lecture l = new Lecture();
                System.out.println("1. Add Lecture Slides");
                System.out.println("2. Add Lecture Video");
                int chooseAssessment = sc2.nextInt();
                if(chooseAssessment == 1){
                    System.out.println("1");
                    Slides s = new Slides();
                    String slideTopic;
                    int slideNumbers;
                    System.out.print("Enter topic of slide: ");
                    sc2.nextLine();
                    slideTopic = sc2.nextLine();
                    s.setSlide_topic(slideTopic);
                    System.out.print("Enter number of slides: ");
                    slideNumbers = sc2.nextInt();
                    s.setNoOfSlides(slideNumbers);
                    sc2.nextLine();

                    String[] slideContent = new String[slideNumbers];
                    System.out.println("Enter Contents of Slides");
                    for (int i = 0; i < slideNumbers ; i++) {
                        System.out.print("Content of Slide " + (i+1) + ": ");
                        slideContent[i] = sc2.nextLine();
                    }
                    s.setSlideContent(slideContent);
                    s.setUploadedBy(ins.getInstructor_name());
                    long millis=System.currentTimeMillis();
                    Date date=new Date(millis);
                    s.setDayAndTime(date);
                    slide.add(s);


                }
                else if(chooseAssessment == 2){
                    System.out.println("2");
                    Lecture l = new Lecture();
                    String videoTopic;
                    String videoFilename;
                    sc2.nextLine();
                    System.out.print("Enter the topic of video: ");
                    videoTopic = sc2.nextLine();
                    System.out.print("Enter filename of video: ");
                    videoFilename = sc2.nextLine();
                    l.setVideo_name(videoTopic);

                    boolean videoFlag = true;

//                    System.out.println(videoFilename.substring(start, end));
                    while(videoFlag == true){
                        int strlen = videoFilename.length();
                        int start = strlen - 3;
                        int end = strlen ;
                        if(videoFilename.substring(start,end).equals("mp4")){
                            videoFlag = false;
                            break;
                        }
                        else if(videoFilename.substring(start,end) != "mp4"){
                            System.out.println("Enter valid file type!");
                            System.out.print("Enter filename of video: ");
                            videoFilename = sc2.nextLine();
                        }
                    }
                    l.setVideo_filename(videoFilename);
                    long millis=System.currentTimeMillis();
                    Date date=new Date(millis);
                    l.setDateAndTime(date);
                    l.setUploadedBy(ins.getInstructor_name());
                    lecture.add(l);




                }
            }
            else if(instructorMenu == 2){
//                System.out.println();

                System.out.println("2");
                System.out.println("1. Add Assignment");
                System.out.println("2. Add Quiz");

                int assessmentChoice = sc2.nextInt();
                if(assessmentChoice == 1){
                    AssessmentAssignment a = new AssessmentAssignment();
                    System.out.print("Enter problem statement: ");
                    sc2.nextLine();
                    String inputAssignment = sc2.nextLine();
                    a.setAssignment(inputAssignment);
                    System.out.print("Enter max marks: ");
                    int inputMarks = sc2.nextInt();
                    a.setAssignmentMarks(inputMarks);
                    assignment.add(a);
                }
                else if(assessmentChoice == 2){
                    AssessmentQuiz q = new AssessmentQuiz();
                    System.out.print("Enter quiz question: ");
                    sc2.nextLine();
                    String inputQuiz = sc2.nextLine();
                    q.setQuiz(inputQuiz);
                    quiz.add(q);

                }
            }
            else if(instructorMenu == 3){
                System.out.println("3");
                for (int i = 0; i < slide.size(); i++) {
                    System.out.println("Title: "+ slide.get(i).getSlide_topic());
                    for(int j = 0; j < slide.get(i).getNoOfSlides(); j++){
                        System.out.println("Slides " + (j+1) + ": " + slide.get(i).getSlideContent()[j] );
                    }
                    System.out.println("Number of slides: " + slide.get(i).getNoOfSlides());
                    System.out.println("Date of upload: " + slide.get(i).getDayAndTime());
                    System.out.println("Uploaded by: " + slide.get(i).getUploadedBy());
                    System.out.println("\n");
                }
                System.out.println("\n");
                for (int i = 0; i < lecture.size(); i++) {
                    System.out.println("Title of video: " + lecture.get(i).getVideo_name());
                    System.out.println("Video file: " + lecture.get(i).getVideo_filename());
                    System.out.println("Date of upload: " + lecture.get(i).getDateAndTime());
                    System.out.println("Uploaded by: " + lecture.get(i).getUploadedBy());
                    System.out.println("\n");
                }
            }
            else if(instructorMenu == 4){
                System.out.println("2");
                int idFlag = assignment.size();
                for (int i = 0; i < assignment.size(); i++) {
                    System.out.println("ID: " + i + " Assignment: " + assignment.get(i).getAssignment() + " Max Marks: " + assignment.get(i).getAssignmentMarks());

                }
                System.out.println("--------------------------------------");
                for (int i = 0; i < quiz.size() ; i++) {
                    System.out.println("ID: " + (i + idFlag) + " Question: " + quiz.get(i).getQuiz());
                }
                System.out.println("--------------------------------------");
            }
            else if(instructorMenu == 5){

            }
            else if(instructorMenu == 6){

            }
            else if(instructorMenu == 7){
//                for (int i = 0; i < comments.size(); i++) {
//                    comments.get(i).viewComment(comments);
//
//                }
                Comments cInsView = new Comments();
                cInsView.viewComment(comments);
            }
            else if(instructorMenu == 8){
                Comments cIns = new Comments();
                cIns.addComment(ins);
                comments.add(cIns);
            }


        }
    }

    private static void studentMethods(Student stu, ArrayList<Slides> slide, ArrayList<Lecture> lecture, ArrayList<Comments> comments, ArrayList<AssessmentAssignment> assignment, ArrayList<AssessmentQuiz> quiz) {
        Scanner sc3 = new Scanner(System.in);

        int studentMenu = 0;

        while(studentMenu != 7){
            System.out.println("\n");
            System.out.println("Welcome " + stu.getStudent_name());
            System.out.println("1. View lecture material");
            System.out.println("2. View assessment");
            System.out.println("3. Submit assessment");
            System.out.println("4. View grades");
            System.out.println("5. View comments");
            System.out.println("6. Add comments");
            System.out.println("7. Logout");

            studentMenu = sc3.nextInt();
            if(studentMenu == 1){
//                System.out.println("Hello");
                for (int i = 0; i < slide.size(); i++) {
                    System.out.println("Title: "+ slide.get(i).getSlide_topic());
                    for(int j = 0; j < slide.get(i).getNoOfSlides(); j++){
                        System.out.println("Slides " + (j+1) + ": " + slide.get(i).getSlideContent()[j] );
                    }
                    System.out.println("Number of slides: " + slide.get(i).getNoOfSlides());
                    System.out.println("Date of upload: " + slide.get(i).getDayAndTime());
                    System.out.println("Uploaded by: " + slide.get(i).getUploadedBy());
                }
                System.out.println("\n");
                for (int i = 0; i < lecture.size(); i++) {
                    System.out.println("Title of video: " + lecture.get(i).getVideo_name());
                    System.out.println("Video file: " + lecture.get(i).getVideo_filename());
                    System.out.println("Date of upload: " + slide.get(i).getDayAndTime());
                    System.out.println("Uploaded by: " + slide.get(i).getUploadedBy());

                }
            }
            else if(studentMenu == 2){
                int idFlag = assignment.size();
                for (int i = 0; i < assignment.size(); i++) {
                    System.out.println("ID: " + i + " Assignment: " + assignment.get(i).getAssignment() + " Max Marks: " + assignment.get(i).getAssignmentMarks());

                }
                System.out.println("--------------------------------------");
                for (int i = 0; i < quiz.size() ; i++) {
                    System.out.println("ID: " + (i + idFlag) + " Question: " + quiz.get(i).getQuiz());
                }
                System.out.println("--------------------------------------");
            }
            else if(studentMenu == 3){

            }
            else if(studentMenu == 4){

            }
            else if(studentMenu == 5){
                Comments cStuView = new Comments();

                cStuView.viewComment(comments);
            }
            else if(studentMenu == 6){
                Comments cStu = new Comments();

                cStu.addComment(stu);
                comments.add(cStu);
            }
        }
    }
}
