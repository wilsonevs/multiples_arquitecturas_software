package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.reaction;

import com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.event.Event;

public class ReactionAddedEvent extends Event {

  private String reactionId;
  private String commentId;
  private String postId;
  private String emoji;

  public String getReactionId() {
    return reactionId;
  }

  public void setReactionId(String reactionId) {
    this.reactionId = reactionId;
  }

  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public String getPostId() {
    return postId;
  }

  public void setPostId(String postId) {
    this.postId = postId;
  }

  public String getEmoji() {
    return emoji;
  }

  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }
}
