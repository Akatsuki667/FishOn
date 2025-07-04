package com.FishOn.FishOn.DTO.Comment;

import jakarta.validation.constraints.*;

public class CommentCreateDTO {

    @NotBlank(message = "Le contenu du commentaire est obligatoire")
    @Size(max = 1000, message = "Le commentaire ne peut pas dépasser 1000 caractères")
    private String content;

    // Constructeur par défaut
    public CommentCreateDTO() {}

    // Constructeur avec paramètres
    public CommentCreateDTO(String content) {
        this.content = content;
    }

    // Getter
    public String getContent() {
        return content;
    }

    // Setter
    public void setContent(String content) {
        this.content = content;
    }
}