package com.smsoft.board.dto;

public class PostDto {
    private Long postId;
    private String title;
    private String writer;
    private String content;

    // 생성자, 게터, 세터 등 필요한 메서드 추가

    public PostDto() {
        // 기본 생성자
    }

    public PostDto(Long postId, String title, String writer, String content) {
        this.postId = postId;
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
