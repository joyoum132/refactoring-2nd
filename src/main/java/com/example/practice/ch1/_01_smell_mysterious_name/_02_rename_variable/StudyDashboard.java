package com.example.practice.ch1._01_smell_mysterious_name._02_rename_variable;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//작성자의 닉네임 + 리뷰 본문을 불러오는 코드
public class StudyDashboard {

    private Set<String> usernames = new HashSet<>();

    private Set<String> reviews = new HashSet<>();

    private void loadReviews() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        //리뷰를 읽어오는 함수! comments 라는 단어는 적절하지 않다
        List<GHIssueComment> reviews = issue.getComments();
        for (GHIssueComment review : reviews) {
            usernames.add(review.getUserName());
            this.reviews.add(review.getBody());
        }
    }

    public Set<String> getUsernames() {
        return usernames;
    }

    public Set<String> getReviews() {
        return reviews;
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();

        //람다 내의 매개변수 범위는 매우 좁다
        // 간략하게 사용하는 것도 괜찮다
        // method reference 로 표현
        studyDashboard.getUsernames().forEach(System.out::println);
        studyDashboard.getReviews().forEach(System.out::println);
    }
}