package com.android.example.studyStation.appLogic;

/**
 * Created by AmmarRabie on 26/10/2017.
 */

import com.android.example.studyStation.DefinedData.Followee;
import com.android.example.studyStation.DefinedData.UserInfo;
import com.android.example.studyStation.server.ServerUtility;

import java.util.ArrayList;
import java.util.List;

import static com.android.example.studyStation.server.ServerUtility.getResponse;

/**
 * this class handle the app logic
 */
public class Logic {
    private Logic() {
    }

    ////////////////////////////////////// log in activity //////////////////////////////////////////////////

    /**
     * @param email the email of the user to log in (can be invalid)
     * @param pass  the password of the user to log in (can be invalid)
     * @return the user info if it exists, otherwise return null
     */
    UserInfo logIn(String email, String pass) {
        return null;
    }

    /**
     * tell the caller if this email pattern is correct, this function doesn't check if this password match in the database
     *
     * @param email the email to check out
     * @return true if this pattern is correct, false otherwise
     */
    boolean validateEmail(String email) {
        return true;
    }


    /**
     * tell the caller if this pass pattern is correct (if it too short or not), this function doesn't check if this password match in the database
     *
     * @param pass the email to check out
     * @return true if this pattern is correct, false otherwise
     */
    boolean validatePass(String pass) {
        return true;
    }


    /**
     * function to insert the new user into the database,
     *
     * @param email      the email of the new user (it validates the email, if the email pattern is invalid or exist, it does't insert the user and return null )
     * @param pass       the password of the new user (it validates the password pattern)
     * @param uni        the university of the new student
     * @param fac        the faculty of the new student
     * @param department the department of the new student
     * @return all the userInfo of this student again to be insert into the global userInfo of the app if it inserted, null otherwise
     */
    UserInfo signUp(String email, String pass, String uni, String fac, String department) {
        return null;
    }

    /**
     * get all departments in specific university and specific faculty
     *
     * @param university the university the departments belong to
     * @param faculty    the faculty the departments belong to
     * @return list of all departments name exist in the database and has this university and faculty
     */
    ArrayList getDepartmentList(String university, String faculty) {
        return null;
    }

    /**
     * @return the list of all universities exist in the database
     */
    ArrayList getUniversityList() {
        return null;
    }

    /**
     * @param university the university the departments belong to
     * @return the list of all faculties exist in specific university
     */
    ArrayList getFacultyList(String university) {
        return null;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * get all course labels exists in specific department
     *
     * @param university
     * @param faculty
     * @param department
     * @return
     */
    int getCourseLabels(String university, String faculty, String department) {
        return 0;
    }

    /////////////////////// search fragment //////////////////////////////////////////////////////////////////////

    /**
     * search for students with search string
     *
     * @param searchString
     * @return list of students related to this searchString
     */
    int searchStudent(String searchString) {
        return 0;
    }


    /**
     * search for course labels (subjects) with search string
     *
     * @param searchString the statement user search for
     * @return list of courseLabel related to this searchString
     */
    int searchCourseLabel(String searchString) {
        return 0;
    }


    /**
     * search for course labels (subjects) with search string
     *
     * @param searchString the statement user search for
     * @param tag          the related tags user want to specify
     * @return list of questions related to this searchString and tags
     */
    int searchQuestion(String searchString, String[] tag) {
        return 0;
    }


    /**
     * get all course notes related to specific course label
     *
     * @param CourseLabelCode
     * @return
     */
    int getCourseNotes(String CourseLabelCode) {
        return 0;
    }

    /**
     * get all notes belongs to specific student.
     *
     * @param userEmail
     * @return
     */
    int getStudentNotes(String userEmail) {
        return 0;
    }


    /**
     * get all self-study courses belongs to specific student.
     *
     * @param userEmail
     * @return
     */
    int getStudentSelfStudy(String userEmail) {
        return 0;
    }


    /**
     * vote specific courseNotes, validate the conditions of (that user already vote this course)
     *
     * @param userEmail   the email of the user who make the vote
     * @param courseLabel the course label
     * @return
     */
    int voteCourseNotes(String userEmail, String courseLabel) {
        return 0;
    }


    /**
     * vote specific courseNotes, validate the conditions of (that user already vote this course)
     *
     * @param userEmail the email of the user who make the vote
     * @param selfStudy
     * @return
     */
    int voteSelfStudy(String userEmail, String selfStudy) {
        return 0;
    }


    /**
     * vote specific question, validate the conditions of (that user already vote this question)
     *
     * @param userEmail   the email of the user who make the vote
     * @param courseLabel the course label
     * @return
     */
    int voteQuestion(String userEmail, String courseLabel) {
        return 0;
    }


    ////////////////////// upload ////////////////////////////////////////

    /**
     * responsible for uploading question into the database
     *
     * @return
     */
    int uploadQuestion() {
        return 0;
    }


    /**
     * upload a video into the YouTube, it take the video file, courseLabel, then put the video to the correct playlist (or make new one if it does't exist)
     *
     * @return
     */
    int uploadCourseNotesVideo() {
        return 0;
    }

    /**
     * upload a video into the YouTube, it take the video file,playlist name, then put the video to the correct playlist (or make new one if it does't exist)
     *
     * @return
     */
    int uploadSelfStudyVideo() {
        return 0;
    }


    /**
     * upload an answer to specific question, it take the Q and the user who make the answer and append the answere to this Q
     *
     * @return
     */
    int uploadAnswer() {
        return 0;
    }


    //////////////////////////////// news feed ///////////////////////////////////////////////

    /**
     * get all questions from startDate to endDate and related to some users
     *
     * @param startDate
     * @param endDate
     * @return
     */
    int getQuestionFromTo_date(String startDate, String endDate, String followers) {
        return 0;
    }


    /**
     * get all course Notes from startDate to endDate and related to some users
     *
     * @param startDate
     * @param endDate
     * @param followers the followers this users follow
     * @return
     */
    int getCourseNotesFromTo_date(String startDate, String endDate, String followers) {
        return 0;
    }


    /////////////////////////////////// followers ///////////////////////////////////////////////


    // TODO:
    /**
     * get the the followees to specific user
     *
     * @return list of all students this user follow
     */
    public static List<Followee> getFollowees(String ip, String followerEmail) {
        String jsonResponse = ServerUtility.getResponse("http://" + ip + "/followees/" + followerEmail);
        return QueryUtility.parseFollowees(jsonResponse);
    }



    /**
     * follow new student to this user
     *
     * @param currUser
     * @param follower
     * @return
     */
    int followStudent(String currUser, String follower) {
        return 0;


    }


    /////////////////////////////////////// moderator //////////////////////////////////////////////////////////////

    /**
     * @param newCourseLabel
     * @return
     */
    int addToCourseList(String newCourseLabel) {
        return 0;
    }


    /**
     * update specific course label with new information
     *
     * @param courseLabelId
     * @param newInfo
     * @return
     */
    int updateCourseLabel(String courseLabelId, String newInfo) {
        return 0;
    }


    /**
     * delete specific video
     *
     * @return
     */
    int deleteVideo() {
        return 0;
    }


    /**
     * update specific question tags
     *
     * @return
     */
    int updateQuestionTag(String question, String[] newTag) {
        return 0;
    }
}
