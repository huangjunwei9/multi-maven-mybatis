package com.exam.entity;

import java.io.Serializable;

/**
 * @Author 黄军威
 * @create 2019/9/30 14:01
 * @email hjunwei@foxmail.com
 */

public class User implements Serializable {
    Integer id;
    Integer score;
    Integer content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", score=" + score +
                ", content=" + content +
                '}';
    }
}
