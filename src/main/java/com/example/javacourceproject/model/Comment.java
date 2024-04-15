package com.example.javacourceproject.model;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String commentTitle;
    private String commentBody;
    private LocalDate dateCreated;
    private float rating;
    @ManyToOne()
    private Product whichProductCommented;
    @ManyToOne()
    private User commentOwner;
    @OneToMany(mappedBy = "parentComment", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Comment> replies;
    @ManyToOne()
    private Comment parentComment;
    @ManyToOne
    private Cart chat;

    public Comment(String commentTitle, String commentBody, LocalDate dateCreated) {
        this.commentTitle = commentTitle;
        this.commentBody = commentBody;
        this.dateCreated = dateCreated;
    }


    public Comment(String commentTitle, String commentBody, LocalDate dateCreated, float rating, Product whichProductCommented, User commentOwner) {
        this.commentTitle = commentTitle;
        this.commentBody = commentBody;
        this.dateCreated = dateCreated;
        this.rating = rating;
        this.whichProductCommented = whichProductCommented;
        this.commentOwner = commentOwner;
    }

    public Comment(String commentTitle, String commentBody, LocalDate dateCreated, float rating, Product whichProductCommented, User commentOwner, List<Comment> replies, Comment parentComment, Cart chat) {
        this.commentTitle = commentTitle;
        this.commentBody = commentBody;
        this.dateCreated = dateCreated;
        this.whichProductCommented = whichProductCommented;
        this.commentOwner = commentOwner;
        this.replies = replies;
        this.parentComment = parentComment;
        this.rating = rating;
        this.chat = chat;
    }
}
